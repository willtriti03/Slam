package com.example.kim.slam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by kim on 2015. 7. 12..
 */
public class SixWindow extends FragmentActivity {
    protected GameBtn gameBtn1;
    protected GameBtn gameBtn2;
    protected GameBtn gameBtn3;
    protected GameBtn gameBtn4;
    protected GameBtn gameBtn5;
    protected GameBtn gameBtn6;
    protected GameBtn gameBtn7;
    protected GameBtn gameBtn8;
    protected GameBtn gameBtn9;
    protected GameBtn gameBtn10;
    protected GameBtn gameBtn11;
    protected GameBtn gameBtn12;

    public boolean one_time_r = true;


    public static Context mContext;


    protected ImageView vlifeView;
    protected TextView vscoreView;
    protected ImageView vTenstateView;
    protected ImageView vOenstateView;
    protected ImageView countDown;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.window_six);
        GameMode.gamemode = 6;
        mContext = this;

//        GameMode.go = AnimationUtils.loadAnimation(this, R.anim.go2);
//        GameMode.back = AnimationUtils.loadAnimation(this, R.anim.back2);

        vlifeView = (ImageView) findViewById(R.id.sixLifeTxt);
        vTenstateView = (ImageView) findViewById(R.id.sixTenStatus);
        vOenstateView = (ImageView) findViewById(R.id.sixOneStatus);
        countDown = (ImageView) findViewById(R.id.countDown);


        Button btn1 = (Button) findViewById(R.id.sixBtn1);
        Button btn2 = (Button) findViewById(R.id.sixBtn2);
        Button btn3 = (Button) findViewById(R.id.sixBtn3);
        Button btn4 = (Button) findViewById(R.id.sixBtn4);
        Button btn5 = (Button) findViewById(R.id.sixBtn5);
        Button btn6 = (Button) findViewById(R.id.sixBtn6);
        Button btn7 = (Button) findViewById(R.id.sixBtn7);
        Button btn8 = (Button) findViewById(R.id.sixBtn8);
        Button btn9 = (Button) findViewById(R.id.sixBtn9);
        Button btn10 = (Button) findViewById(R.id.sixBtn10);
        Button btn11 = (Button) findViewById(R.id.sixBtn11);
        Button btn12 = (Button) findViewById(R.id.sixBtn12);

        ImageView bg1 = (ImageView) findViewById(R.id.sixBtn_bg1);
        ImageView bg2 = (ImageView) findViewById(R.id.sixBtn_bg2);
        ImageView bg3 = (ImageView) findViewById(R.id.sixBtn_bg3);
        ImageView bg4 = (ImageView) findViewById(R.id.sixBtn_bg4);
        ImageView bg5 = (ImageView) findViewById(R.id.sixBtn_bg5);
        ImageView bg6 = (ImageView) findViewById(R.id.sixBtn_bg6);
        ImageView bg7 = (ImageView) findViewById(R.id.sixBtn_bg7);
        ImageView bg8 = (ImageView) findViewById(R.id.sixBtn_bg8);
        ImageView bg9 = (ImageView) findViewById(R.id.sixBtn_bg9);
        ImageView bg10 = (ImageView) findViewById(R.id.sixBtn_bg10);
        ImageView bg11 = (ImageView) findViewById(R.id.sixBtn_bg11);
        ImageView bg12 = (ImageView) findViewById(R.id.sixBtn_bg12);

        ImageView site_1 = (ImageView) findViewById(R.id.sixOne);
        ImageView site_2 = (ImageView) findViewById(R.id.sixTen);
        ImageView site_3 = (ImageView) findViewById(R.id.sixHun);
        ImageView site_4 = (ImageView) findViewById(R.id.sixThou);
        ImageView site_5 = (ImageView) findViewById(R.id.sixTenThou);
        ImageView site_6 = (ImageView) findViewById(R.id.sixHunThou);
        ImageView site_7 = (ImageView) findViewById(R.id.sixMill);
        ImageView site_8 = (ImageView) findViewById(R.id.sixTenMill);
        ImageView site_9 = (ImageView) findViewById(R.id.sixHunMill);

        btn1.setOnTouchListener(new MyTouchListener());
        btn2.setOnTouchListener(new MyTouchListener());
        btn3.setOnTouchListener(new MyTouchListener());
        btn4.setOnTouchListener(new MyTouchListener());
        btn5.setOnTouchListener(new MyTouchListener());
        btn6.setOnTouchListener(new MyTouchListener());
        btn7.setOnTouchListener(new MyTouchListener());
        btn8.setOnTouchListener(new MyTouchListener());
        btn9.setOnTouchListener(new MyTouchListener());
        btn10.setOnTouchListener(new MyTouchListener());
        btn11.setOnTouchListener(new MyTouchListener());
        btn12.setOnTouchListener(new MyTouchListener());

        gameBtn1 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn1, bg1, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn2 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn2, bg2, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn3 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn3, bg3, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn4 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn4, bg4, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn5 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn5, bg5, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn6 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn6, bg6, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn7 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn7, bg7, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn8 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn8, bg8, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn9 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn9, bg9, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn10 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn10, bg10, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn11 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn11, bg11, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn12 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn12, bg12, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);

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
                        case R.id.sixBtn1:
                            if (gameBtn1.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn1.btnHandler.sendEmptyMessage(0);
                            }

                            break;

                        case R.id.sixBtn2:
                            if (gameBtn2.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn2.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.sixBtn3:
                            if (gameBtn3.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn3.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.sixBtn4:
                            if (gameBtn4.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn4.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.sixBtn5:
                            if (gameBtn5.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn5.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.sixBtn6:
                            if (gameBtn6.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn6.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.sixBtn7:
                            if (gameBtn7.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn7.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.sixBtn8:
                            if (gameBtn8.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn8.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.sixBtn9:
                            if (gameBtn9.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn9.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.sixBtn10:
                            if (gameBtn10.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn10.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.sixBtn11:
                            if (gameBtn11.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn11.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.sixBtn12:
                            if (gameBtn12.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn12.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                    }
                    break;
                case MotionEvent.ACTION_MOVE:
                    switch (v.getId()) {
                        case R.id.sixBtn1:

                            gameBtn1.vbtnCheck = true;
                            break;

                        case R.id.sixBtn2:

                            gameBtn2.vbtnCheck = true;
                            break;

                        case R.id.sixBtn3:

                            gameBtn3.vbtnCheck = true;
                            break;

                        case R.id.sixBtn4:

                            gameBtn4.vbtnCheck = true;
                            break;

                        case R.id.sixBtn5:

                            gameBtn5.vbtnCheck = true;
                            break;

                        case R.id.sixBtn6:

                            gameBtn6.vbtnCheck = true;
                            break;
                        case R.id.sixBtn7:

                            gameBtn7.vbtnCheck = true;
                            break;
                        case R.id.sixBtn8:

                            gameBtn8.vbtnCheck = true;
                            break;
                        case R.id.sixBtn9:

                            gameBtn9.vbtnCheck = true;
                            break;
                        case R.id.sixBtn10:

                            gameBtn10.vbtnCheck = true;
                            break;
                        case R.id.sixBtn11:

                            gameBtn11.vbtnCheck = true;
                            break;
                        case R.id.sixBtn12:

                            gameBtn12.vbtnCheck = true;
                            break;
                    }
                    break;
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
        Thread btn7Thread = gameBtn7.btnMT;
        Thread btn8Thread = gameBtn8.btnMT;
        Thread btn9Thread = gameBtn9.btnMT;
        Thread btn10Thread = gameBtn10.btnMT;
        Thread btn11Thread = gameBtn11.btnMT;
        Thread btn12Thread = gameBtn12.btnMT;

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
            else btn2Thread.start();
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
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn7Thread.start();
            else
                btn8Thread.start();
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn9Thread.start();
            else
                btn10Thread.start();
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn11Thread.start();
            else
                btn12Thread.start();

            while (!GameMode.gameEnd) {
                try {
                    mainThread.this.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            SixWindow.this.finish();
            gameEnd();
        }
    }

    protected void gameEnd() {
        Intent intent = new Intent(SixWindow.this, ResultActivity.class);
        intent.putExtra("score", String.valueOf(GameMode.score));
        intent.putExtra("life", String.valueOf(GameMode.life));
        startActivity(intent);
        ResultActivity.score = GameMode.score;
        SixWindow.this.finish();
    }
}
