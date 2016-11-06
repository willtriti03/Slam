package com.example.kim.slam;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.kim.slam.R;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;


public class Ranking extends FragmentActivity {
    ArrayList<HashMap<String, String>> data;
    ListView ls;
    SimpleAdapter sa;
    netWorkThread thread = null;
    public static MediaPlayer mp;

    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rank);

        Button threeBtn = (Button)findViewById(R.id.threeBtn);
        Button sixBtn = (Button)findViewById(R.id.sixBtn);
        Button nineBtn = (Button)findViewById(R.id.nineBtn);
        Button back =(Button)findViewById(R.id.rank_back);

        threeBtn.setOnClickListener(new btnOnClick());
        sixBtn.setOnClickListener(new btnOnClick());
        nineBtn.setOnClickListener(new btnOnClick());
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                Ranking.this.finish();
            }
        });



        data = new ArrayList<HashMap<String, String>>();

        thread = new netWorkThread("three");
        thread.start();
        try {
            thread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        datachange();
    }

    public void datachange() {
        ls = (ListView)findViewById(R.id.rankList);
        sa = new SimpleAdapter(this, data, R.layout.list_row,
                new String[] {"user", "score"}, new int[] {R.id.userText, R.id.scoreText});

        ls.setAdapter(sa);
    }

    public class btnOnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String mode = null;
            switch(v.getId()) {
                case R.id.threeBtn :
                    mode = "three";
                    break;
                case R.id.sixBtn :
                    mode = "six";
                    break;
                case R.id.nineBtn :
                    mode = "nine";
                    break;
            }

            data = new ArrayList<HashMap<String, String>>();

            thread = new netWorkThread(mode);
            thread.start();
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }

            datachange();
        }
    }

    private class netWorkThread extends Thread {
        String mode = null;
        public netWorkThread (String mode) {
            this.mode = mode;
        }
        private Source source;
        @Override
        public void run() {
            super.run();
            try {
                URL url = new URL("http://192.168.1.29/select.php?mode=" + mode);
                InputStream is = url.openStream();
                source = new Source(new InputStreamReader(is, "utf-8"));

                int size = source.getAllElements(HTMLElementName.UL).size();
                int i;

                Element usr = null;
                Element score = null;

                HashMap<String, String> hm = null;
                for(i=0; i<size; i++) {
                    hm = new HashMap<String, String>();

                    usr = (Element)source.getAllElements(HTMLElementName.UL).get(i);
                    score = (Element)source.getAllElements(HTMLElementName.OL).get(i);

                    hm.put("user", i+1 + ". " + usr.getContent().toString());
                    hm.put("score", score.getContent().toString());

                    data.add(hm);
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}