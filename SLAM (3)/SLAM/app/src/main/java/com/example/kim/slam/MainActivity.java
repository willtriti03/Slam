package com.example.kim.slam;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button selectGameBtn = (Button)findViewById(R.id.game_start);
        Button rankingGameBtn = (Button)findViewById(R.id.ranking);
        Button helpGameBtn=(Button)findViewById(R.id.game_help);

        selectGameBtn.setOnClickListener(new btnOnClick());
        rankingGameBtn.setOnClickListener(new btnOnClick());
        helpGameBtn.setOnClickListener(new btnOnClick());

    }

    private class btnOnClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent = null;

            switch(v.getId()) {
                case R.id.game_start :
                    intent = new Intent(MainActivity.this, GameSelectActivity.class);
                    break;
                case R.id.ranking :
                    intent = new Intent(MainActivity.this, Ranking.class);
                    break;
                case R.id.game_help :
                    intent = new Intent(MainActivity.this, HowTo.class);
                    break;
            }

            startActivity(intent);
        }
    }
}
