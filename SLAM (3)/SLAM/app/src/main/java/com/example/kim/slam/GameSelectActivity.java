package com.example.kim.slam;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kim on 2015. 7. 12..
 */
public class GameSelectActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_game);

        Button threeWindowBtn = (Button)findViewById(R.id.threeWindowBtn);
        Button sixWindowBtn = (Button)findViewById(R.id.sixWindowBtn);
        Button nineWindowBtn = (Button)findViewById(R.id.nineWindowBtn);

        threeWindowBtn.setOnClickListener(new btnOnClickListener());
        sixWindowBtn.setOnClickListener(new btnOnClickListener());
        nineWindowBtn.setOnClickListener(new btnOnClickListener());
    }

    protected class btnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            GameMode.score = 0;
            GameMode.combo = 0;
            GameMode.life = 10;
            GameMode.gameEnd=false;

            Intent intent = null;

            switch(v.getId()) {
                case R.id.threeWindowBtn:
                    intent = new Intent(GameSelectActivity.this, ThreeWindow.class);
                    break;

                case R.id.sixWindowBtn:
                    intent = new Intent(GameSelectActivity.this, SixWindow.class);
                    break;

                case R.id.nineWindowBtn:
                    intent = new Intent(GameSelectActivity.this, NineWindow.class);
                    break;
            }
            startActivity(intent);
            GameSelectActivity.this.finish();
        }
    }
}
