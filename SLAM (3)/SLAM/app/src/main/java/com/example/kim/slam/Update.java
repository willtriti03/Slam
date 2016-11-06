package com.example.kim.slam;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

/**
 * Created by willtriti on 2015-07-14.
 */
public class Update extends FragmentActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.updat);
        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                networkThread thread = new networkThread();
                thread.start();
                try {
                    thread.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Update.this.finish();
            }
        });
        Button back = (Button) findViewById(R.id.up_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Update.this.finish();
            }
        });
    }

    private class networkThread extends Thread {
        @Override
        public void run() {
            super.run();
            EditText inputView = (EditText)findViewById(R.id.input);
            String gameMode = null;
            String input = inputView.getText().toString();
            int score = GameMode.score;

            if(GameMode.gamemode == 3) gameMode = "three";
            else if(GameMode.gamemode == 6) gameMode = "six";
            else gameMode = "nine";

            try {
                URL url = new URL("http://192.168.1.29/insert.php?usr=" + input + "&score=" + score + "&mode=" + gameMode);
                url.openStream();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
