package com.example.kim.slam;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
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
public class NineWindow extends FragmentActivity {
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
    protected GameBtn gameBtn13;
    protected GameBtn gameBtn14;
    protected GameBtn gameBtn15;
    protected GameBtn gameBtn16;
    protected GameBtn gameBtn17;
    protected GameBtn gameBtn18;

    public boolean one_time_r = true;


    public static Context mContext;


    protected ImageView vlifeView;
    protected ImageView vTenstateView;
    protected ImageView vOenstateView;
    protected ImageView countDown;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.window_nine);
        mContext = this;

        GameMode.gamemode = 9;
//        GameMode.go= AnimationUtils.loadAnimation(this,R.anim.go3);
//        GameMode.back= AnimationUtils.loadAnimation(this,R.anim.back3);

        vlifeView = (ImageView) findViewById(R.id.nineLifeTxt);
        vTenstateView = (ImageView) findViewById(R.id.nineTenStatus);
        vOenstateView = (ImageView) findViewById(R.id.nineOneStatus);
        countDown = (ImageView) findViewById(R.id.countDown);
        vOenstateView.setBackgroundResource(R.drawable.score0);


        Button btn1 = (Button) findViewById(R.id.nineBtn1);
        Button btn2 = (Button) findViewById(R.id.nineBtn2);
        Button btn3 = (Button) findViewById(R.id.nineBtn3);
        Button btn4 = (Button) findViewById(R.id.nineBtn4);
        Button btn5 = (Button) findViewById(R.id.nineBtn5);
        Button btn6 = (Button) findViewById(R.id.nineBtn6);
        Button btn7 = (Button) findViewById(R.id.nineBtn7);
        Button btn8 = (Button) findViewById(R.id.nineBtn8);
        Button btn9 = (Button) findViewById(R.id.nineBtn9);
        Button btn10 = (Button) findViewById(R.id.nineBtn10);
        Button btn11 = (Button) findViewById(R.id.nineBtn11);
        Button btn12 = (Button) findViewById(R.id.nineBtn12);
        Button btn13 = (Button) findViewById(R.id.nineBtn13);
        Button btn14 = (Button) findViewById(R.id.nineBtn14);
        Button btn15 = (Button) findViewById(R.id.nineBtn15);
        Button btn16 = (Button) findViewById(R.id.nineBtn16);
        Button btn17 = (Button) findViewById(R.id.nineBtn17);
        Button btn18 = (Button) findViewById(R.id.nineBtn18);

        ImageView bg1 = (ImageView) findViewById(R.id.nineBtn_bg1);
        ImageView bg2 = (ImageView) findViewById(R.id.nineBtn_bg2);
        ImageView bg3 = (ImageView) findViewById(R.id.nineBtn_bg3);
        ImageView bg4 = (ImageView) findViewById(R.id.nineBtn_bg4);
        ImageView bg5 = (ImageView) findViewById(R.id.nineBtn_bg5);
        ImageView bg6 = (ImageView) findViewById(R.id.nineBtn_bg6);
        ImageView bg7 = (ImageView) findViewById(R.id.nineBtn_bg7);
        ImageView bg8 = (ImageView) findViewById(R.id.nineBtn_bg8);
        ImageView bg9 = (ImageView) findViewById(R.id.nineBtn_bg9);
        ImageView bg10 = (ImageView) findViewById(R.id.nineBtn_bg10);
        ImageView bg11 = (ImageView) findViewById(R.id.nineBtn_bg11);
        ImageView bg12 = (ImageView) findViewById(R.id.nineBtn_bg12);
        ImageView bg13 = (ImageView) findViewById(R.id.nineBtn_bg13);
        ImageView bg14 = (ImageView) findViewById(R.id.nineBtn_bg14);
        ImageView bg15 = (ImageView) findViewById(R.id.nineBtn_bg15);
        ImageView bg16 = (ImageView) findViewById(R.id.nineBtn_bg16);
        ImageView bg17 = (ImageView) findViewById(R.id.nineBtn_bg17);
        ImageView bg18 = (ImageView) findViewById(R.id.nineBtn_bg18);

        ImageView site_1 = (ImageView) findViewById(R.id.nineOne);
        ImageView site_2 = (ImageView) findViewById(R.id.nineTen);
        ImageView site_3 = (ImageView) findViewById(R.id.nineHun);
        ImageView site_4 = (ImageView) findViewById(R.id.nineThou);
        ImageView site_5 = (ImageView) findViewById(R.id.nineTenThou);
        ImageView site_6 = (ImageView) findViewById(R.id.nineHunThou);
        ImageView site_7 = (ImageView) findViewById(R.id.nineMill);
        ImageView site_8 = (ImageView) findViewById(R.id.nineTenMill);
        ImageView site_9 = (ImageView) findViewById(R.id.nineHunMill);

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
        btn13.setOnTouchListener(new MyTouchListener());
        btn14.setOnTouchListener(new MyTouchListener());
        btn15.setOnTouchListener(new MyTouchListener());
        btn16.setOnTouchListener(new MyTouchListener());
        btn17.setOnTouchListener(new MyTouchListener());
        btn18.setOnTouchListener(new MyTouchListener());

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
        gameBtn13 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn13, bg13, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn14 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn14, bg14, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn15 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn15, bg15, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn16 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn16, bg16, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn17 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn17, bg17, 1, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);
        gameBtn18 = new GameBtn(vOenstateView, vTenstateView, vlifeView, btn18, bg18, 0, site_1, site_2, site_3, site_4, site_5, site_6, site_7, site_8, site_9);

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
                        case R.id.nineBtn1:
                            if (gameBtn1.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn1.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.nineBtn2:
                            if (gameBtn2.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn2.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.nineBtn3:
                            if (gameBtn3.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn3.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.nineBtn4:
                            if (gameBtn4.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn4.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.nineBtn5:
                            if (gameBtn5.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn5.btnHandler.sendEmptyMessage(0);
                            }
                            break;

                        case R.id.nineBtn6:
                            if (gameBtn6.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn6.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn8:
                            if (gameBtn8.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn8.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn9:
                            if (gameBtn9.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn9.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn10:
                            if (gameBtn10.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn10.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn11:
                            if (gameBtn11.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn11.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn12:
                            if (gameBtn12.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn12.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn13:
                            if (gameBtn13.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn13.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn14:
                            if (gameBtn14.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn14.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn15:
                            if (gameBtn15.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn15.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn16:
                            if (gameBtn16.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn16.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn17:
                            if (gameBtn17.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn17.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                        case R.id.nineBtn18:
                            if (gameBtn18.on_off) {
                                GameMode.life -= 1;
                                GameMode.combo = 0;
                                if (GameMode.life <= 0) {
                                    GameMode.gameEnd = true;
                                }
                                gameBtn18.btnHandler.sendEmptyMessage(0);
                            }
                            break;
                    }
                    break;
                case MotionEvent.ACTION_MOVE:
                    switch (v.getId()) {
                        case R.id.nineBtn1:

                            gameBtn1.vbtnCheck = true;
                            break;

                        case R.id.nineBtn2:
                            gameBtn2.vbtnCheck = true;
                            break;

                        case R.id.nineBtn3:
                            gameBtn3.vbtnCheck = true;
                            break;

                        case R.id.nineBtn4:
                            gameBtn4.vbtnCheck = true;
                            break;

                        case R.id.nineBtn5:
                            gameBtn5.vbtnCheck = true;
                            break;

                        case R.id.nineBtn6:
                            gameBtn6.vbtnCheck = true;
                            break;
                        case R.id.nineBtn8:
                            gameBtn8.vbtnCheck = true;
                            break;
                        case R.id.nineBtn9:
                            gameBtn9.vbtnCheck = true;
                            break;
                        case R.id.nineBtn10:
                            gameBtn10.vbtnCheck = true;
                            break;
                        case R.id.nineBtn11:
                            gameBtn11.vbtnCheck = true;
                            break;
                        case R.id.nineBtn12:
                            gameBtn12.vbtnCheck = true;
                            break;
                        case R.id.nineBtn13:
                            gameBtn13.vbtnCheck = true;
                            break;
                        case R.id.nineBtn14:
                            gameBtn14.vbtnCheck = true;
                            break;
                        case R.id.nineBtn15:
                            gameBtn15.vbtnCheck = true;
                            break;
                        case R.id.nineBtn16:
                            gameBtn16.vbtnCheck = true;
                            break;
                        case R.id.nineBtn17:
                            gameBtn17.vbtnCheck = true;
                            break;
                        case R.id.nineBtn18:
                            gameBtn18.vbtnCheck = true;
                            break;
                    }
            }


            return true;
        }
    }

    Handler stateHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what != 0)
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
        Thread btn13Thread = gameBtn13.btnMT;
        Thread btn14Thread = gameBtn14.btnMT;
        Thread btn15Thread = gameBtn15.btnMT;
        Thread btn16Thread = gameBtn16.btnMT;
        Thread btn17Thread = gameBtn17.btnMT;
        Thread btn18Thread = gameBtn18.btnMT;

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
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn13Thread.start();
            else
                btn14Thread.start();
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn15Thread.start();
            else
                btn16Thread.start();
            selector = (int) (Math.random() * 2);
            if (selector == 1)
                btn17Thread.start();
            else
                btn18Thread.start();

            while (!GameMode.gameEnd) {
                try {
                    mainThread.this.sleep(100);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            NineWindow.this.finish();
            gameEnd();
        }
    }

    protected void gameEnd() {

        Intent intent = new Intent(NineWindow.this, ResultActivity.class);
        intent.putExtra("score", String.valueOf(GameMode.score));
        intent.putExtra("life", String.valueOf(GameMode.life));
        startActivity(intent);
        ResultActivity.score = GameMode.score;
        NineWindow.this.finish();
    }
}
