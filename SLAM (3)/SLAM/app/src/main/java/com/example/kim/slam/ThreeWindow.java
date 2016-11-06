package com.example.kim.slam;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by kim on 2015. 7. 12..
 */
public class ThreeWindow extends FragmentActivity {
    protected GameBtn gameBtn1;
    protected GameBtn gameBtn2;
    protected GameBtn gameBtn3;
    protected GameBtn gameBtn4;
    protected GameBtn gameBtn5;
    protected GameBtn gameBtn6;
    protected TextView vscoreView;
    protected ImageView vlifeView;
    protected ImageView vTenstateView;
    protected ImageView vOenstateView;
    protected ImageView countDown;

    public static Context mContext;
    public boolean one_time_r = true;


    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.window_three);
        GameMode.gamemode = 3;
        mContext = this;
        vlifeView = (ImageView) findViewById(R.id.threeLifeTxt);
        vTenstateView = (ImageView) findViewById(R.id.threeTenStatus);
        vOenstateView = (ImageView) findViewById(R.id.threeOneStatus);
        countDown = (ImageView) findViewById(R.id.countDown);


        Button btn1 = (Button) findViewById(R.id.threeBtn1);
        Button btn2 = (Button) findViewById(R.id.threeBtn2);
        Button btn3 = (Button) findViewById(R.id.threeBtn3);
        Button btn4 = (Button) findViewById(R.id.threeBtn4);
        Button btn5 = (Button) findViewById(R.id.threeBtn5);
        Button btn6 = (Button) findViewById(R.id.threeBtn6);

        ImageView bg1 = (ImageView) findViewById(R.id.threeBtn_bg1);
        ImageView bg2 = (ImageView) findViewById(R.id.threeBtn_bg2);
        ImageView bg3 = (ImageView) findViewById(R.id.threeBtn_bg3);
        ImageView bg4 = (ImageView) findViewById(R.id.threeBtn_bg4);
        ImageView bg5 = (ImageView) findViewById(R.id.threeBtn_bg5);
        ImageView bg6 = (ImageView) findViewById(R.id.threeBtn_bg6);

        ImageView site_1 = (ImageView) findViewById(R.id.threeOne);
        ImageView site_2 = (ImageView) findViewById(R.id.threeTen);
        ImageView site_3 = (ImageView) findViewById(R.id.threeHun);
        ImageView site_4 = (ImageView) findViewById(R.id.threeThou);
        ImageView site_5 = (ImageView) findViewById(R.id.threeTenThou);
        ImageView site_6 = (ImageView) findViewById(R.id.threeHunThou);
        ImageView site_7 = (ImageView) findViewById(R.id.threeMill);
        ImageView site_8 = (ImageView) findViewById(R.id.threeTenMill);
        ImageView site_9 = (ImageView) findViewById(R.id.threeHunMill);
        btn1.setOnTouchListener(new MyTouchListener());
        btn2.setOnTouchListener(new MyTouchListener());
        btn3.setOnTouchListener(new MyTouchListener());
        btn4.setOnTouchListener(new MyTouchListener());
        btn5.setOnTouchListener(new MyTouchListener());
        btn6.setOnTouchListener(new MyTouchListener());


        gameBtn1 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn1, bg1, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn2 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn2, bg2, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn3 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn3, bg3, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn4 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn4, bg4, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn5 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn5, bg5, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn6 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn6, bg6, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);


        mainThread thread = new mainThread();
        thread.start();
    }


    class MyTouchListener implements View.OnTouchListener {
        public boolean onTouch(View v, MotionEvent event) {
            int eventaction = event.getAction();
            int X = (int) event.getX();
            int Y = (int) event.getY();
            switch (eventaction) {
                case MotionEvent.ACTION_DOWN:
                    switch (v.getId()) {
                        case R.id.threeBtn1:
                            if (gameBtn1.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn1.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.threeBtn2:
                            if (gameBtn2.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn2.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.threeBtn3:
                            if (gameBtn3.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn3.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.threeBtn4:
                            if (gameBtn4.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn4.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.threeBtn5:
                            if (gameBtn5.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn5.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.threeBtn6:
                            if (gameBtn6.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn6.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                    }
                    break;
                case MotionEvent.ACTION_MOVE:
                    switch (v.getId()) {
                        case R.id.threeBtn1:
                            gameBtn1.vbtnCheck = true;
                            break;

                        case R.id.threeBtn2:
                            gameBtn2.vbtnCheck = true;
                            break;

                        case R.id.threeBtn3:
                            gameBtn3.vbtnCheck = true;
                            break;

                        case R.id.threeBtn4:
                            gameBtn4.vbtnCheck = true;
                            break;

                        case R.id.threeBtn5:
                            gameBtn5.vbtnCheck = true;
                            break;

                        case R.id.threeBtn6:
                            gameBtn6.vbtnCheck = true;
                            break;
                    }
            }


            return true;
        }
    }


    Handler stateHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            countDown.setBackgroundResource(R.drawable.big_num0 + msg.what);
            if (msg.what == 0)
                countDown.setBackgroundResource(R.drawable.clear_win);
        }
    };

    protected class mainThread extends Thread {
        Thread btn1Thread = gameBtn1.btnMT;
        Thread btn2Thread = gameBtn2.btnMT;
        Thread btn3Thread = gameBtn3.btnMT;
        Thread btn4Thread = gameBtn4.btnMT;
        Thread btn5Thread = gameBtn5.btnMT;
        Thread btn6Thread = gameBtn6.btnMT;


        int i;

        @Override
        public void run() {
            for (i = 3; i >= 0; i--) {
                stateHandler.sendEmptyMessage(i);
                try {
                    this.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            int selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn1Thread.start();

            else
                btn2Thread.start();
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn3Thread.start();
            else
                btn4Thread.start();
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn5Thread.start();
            else
                btn6Thread.start();


            while (!GameMode.gameEnd) {
                try {
                    mainThread.this.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            ThreeWindow.this.finish();
            gameEnd();
        }

    }


    protected void gameEnd() {
        Intent intent = new Intent(ThreeWindow.this, ResultActivity.class);
        intent.putExtra("score", String.valueOf(GameMode.score));
        intent.putExtra("life", String.valueOf(GameMode.life));
        startActivity(intent);
        ResultActivity.score = GameMode.score;
        ThreeWindow.this.finish();

    }
}
