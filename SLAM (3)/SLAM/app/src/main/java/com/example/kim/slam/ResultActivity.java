package com.example.kim.slam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;

/**
 * Created by kim on 2015. 7. 12..
 */
public class ResultActivity extends FragmentActivity {
    static int score;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_result);

        Button backBtn = (Button) findViewById(R.id.backBtn);


//        TextView scoreView = (TextView)findViewById(R.id.resultScore);
//        Intent intent = getIntent();
//        String score = intent.getExtras().getString("score");
//        scoreView.setText("score : " + score);
        ImageView site_1 = (ImageView) findViewById(R.id.one_site);
        ImageView site_2 = (ImageView) findViewById(R.id.ten_site);
        ImageView site_3 = (ImageView) findViewById(R.id.han_site);
        ImageView site_4 = (ImageView) findViewById(R.id.thou_site);
        ImageView site_5 = (ImageView) findViewById(R.id.ten_thou_site);
        ImageView site_6 = (ImageView) findViewById(R.id.hun_thou_site);
        ImageView site_7 = (ImageView) findViewById(R.id.mill_site);
        ImageView site_8 = (ImageView) findViewById(R.id.ten_mill_site);
        ImageView site_9 = (ImageView) findViewById(R.id.hun_mill_site);

        int one = score % 10;
        int ten = score % 100 / 10;
        int hun = score % 1000 / 100;
        int thou = score % 10000 / 1000;
        int ten_thou = score % 100000 / 10000;
        int hun_thou = score % 1000000 / 100000;
        int mill = score % 10000000 / 1000000;
        int ten_mill = score % 100000000 / 10000000;
        int hun_mill = score % 1000000000 / 100000000;

        if (hun_mill == 0) {
            if (ten_mill == 0) {
                if (mill == 0) {
                    if (hun_thou == 0) {
                        if (ten_thou == 0) {
                            if (thou == 0) {
                                if (hun == 0) {
                                    if (ten == 0) {
                                        if (one == 0) {
                                        } else site_1.setBackgroundResource(R.drawable.big_num0);
                                    } else {
                                        site_2.setBackgroundResource(R.drawable.big_num0);
                                        site_1.setBackgroundResource(R.drawable.big_num0);
                                    }

                                } else {
                                    site_3.setBackgroundResource(R.drawable.big_num0 + hun);
                                    site_2.setBackgroundResource(R.drawable.big_num0);
                                    site_1.setBackgroundResource(R.drawable.big_num0);
                                }
                            } else {
                                site_4.setBackgroundResource(R.drawable.big_num0 + thou);
                                site_3.setBackgroundResource(R.drawable.big_num0 + hun);
                                site_2.setBackgroundResource(R.drawable.big_num0);
                                site_1.setBackgroundResource(R.drawable.big_num0);
                            }
                        } else {
                            site_5.setBackgroundResource(R.drawable.big_num0 + ten_thou);
                            site_4.setBackgroundResource(R.drawable.big_num0 + thou);
                            site_3.setBackgroundResource(R.drawable.big_num0 + hun);
                            site_2.setBackgroundResource(R.drawable.big_num0);
                            site_1.setBackgroundResource(R.drawable.big_num0);
                        }
                    } else {
                        site_6.setBackgroundResource(R.drawable.big_num0 + hun_thou);
                        site_5.setBackgroundResource(R.drawable.big_num0 + ten_thou);
                        site_4.setBackgroundResource(R.drawable.big_num0 + thou);
                        site_3.setBackgroundResource(R.drawable.big_num0 + hun);
                        site_2.setBackgroundResource(R.drawable.big_num0);
                        site_1.setBackgroundResource(R.drawable.big_num0);
                    }
                } else {
                    site_7.setBackgroundResource(R.drawable.big_num0 + mill);
                    site_6.setBackgroundResource(R.drawable.big_num0 + hun_thou);
                    site_5.setBackgroundResource(R.drawable.big_num0 + ten_thou);
                    site_4.setBackgroundResource(R.drawable.big_num0 + thou);
                    site_3.setBackgroundResource(R.drawable.big_num0 + hun);
                    site_2.setBackgroundResource(R.drawable.big_num0);
                    site_1.setBackgroundResource(R.drawable.big_num0);
                }
            } else {
                site_8.setBackgroundResource(R.drawable.big_num0 + ten_mill);
                site_7.setBackgroundResource(R.drawable.big_num0 + mill);
                site_6.setBackgroundResource(R.drawable.big_num0 + hun_thou);
                site_5.setBackgroundResource(R.drawable.big_num0 + ten_thou);
                site_4.setBackgroundResource(R.drawable.big_num0 + thou);
                site_3.setBackgroundResource(R.drawable.big_num0 + hun);
                site_2.setBackgroundResource(R.drawable.big_num0);
                site_1.setBackgroundResource(R.drawable.big_num0);
            }
        } else {
            site_9.setBackgroundResource(R.drawable.big_num0 + hun_mill);
            site_8.setBackgroundResource(R.drawable.big_num0 + ten_mill);
            site_7.setBackgroundResource(R.drawable.big_num0 + mill);
            site_6.setBackgroundResource(R.drawable.big_num0 + hun_thou);
            site_5.setBackgroundResource(R.drawable.big_num0 + ten_thou);
            site_5.setBackgroundResource(R.drawable.big_num0 + ten_thou);
            site_4.setBackgroundResource(R.drawable.big_num0 + thou);
            site_3.setBackgroundResource(R.drawable.big_num0 + hun);
            site_2.setBackgroundResource(R.drawable.big_num0);
            site_1.setBackgroundResource(R.drawable.big_num0);


        }

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResultActivity.this.finish();
            }
        });

        Button btn = (Button) findViewById(R.id.update);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, Update.class);
                startActivity(intent);
            }
        });
    }
}





