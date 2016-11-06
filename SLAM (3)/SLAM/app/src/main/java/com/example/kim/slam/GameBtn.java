package com.example.kim.slam;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.concurrent.Delayed;

/**
 * Created by kim on 2015. 7. 12..
 */
public class GameBtn extends FragmentActivity {
    public boolean vbtnCheck = false;
    public boolean vthreadCheck = false;
    public boolean endCheck = false;
    public boolean on_off = false;


    protected boolean oneTimeAction = true;

    static public MediaPlayer mp;

    protected ImageView mlifeView;
    protected ImageView mTenStateView;
    protected ImageView mOneStateView;
    public ImageView site_1;
    public ImageView site_2;
    public ImageView site_3;
    public ImageView site_4;
    public ImageView site_5;
    public ImageView site_6;
    public ImageView site_7;
    public ImageView site_8;
    public ImageView site_9;

    protected Button mbtn;
    protected ImageView mImg;


    protected Animation left;
    protected Animation right;

    protected int isLeft;
    protected int r = 1;


    public btnMethodThread btnMT = new btnMethodThread();


    public GameBtn(ImageView mOneStateView, ImageView mTenStateView, ImageView mlifeView, Button mbtn, ImageView img, int isLeft,ImageView one, ImageView ten, ImageView hun, ImageView thou, ImageView tenThou, ImageView hunThou, ImageView mill, ImageView tenMill, ImageView hunMill) {
        this.mTenStateView = mTenStateView;
        this.mOneStateView = mOneStateView;
        this.mlifeView = mlifeView;
        this.mbtn = mbtn;
        this.mImg = img;
        this.isLeft = isLeft;
        this.site_1 = one;
        this.site_2 = ten;
        this.site_3 = hun;
        this.site_4 = thou;
        this.site_5 = tenThou;
        this.site_6 = hunThou;
        this.site_7 = mill;
        this.site_8 = tenMill;
        this.site_9 = hunMill;
    }


    Handler btnHandler = new Handler() {
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    mlifeView.setBackgroundResource(R.drawable.score0);
                    mlifeView.setBackgroundResource(R.drawable.score0 + GameMode.life);
                    break;
                case 1:
                    int score = GameMode.score;
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
                                                    } else
                                                        site_1.setBackgroundResource(R.drawable.score0);
                                                } else {
                                                    site_2.setBackgroundResource(R.drawable.score0);
                                                    site_1.setBackgroundResource(R.drawable.score0);
                                                }

                                            } else {
                                                site_3.setBackgroundResource(R.drawable.score0 + hun);
                                                site_2.setBackgroundResource(R.drawable.score0);
                                                site_1.setBackgroundResource(R.drawable.score0);
                                            }
                                        } else {
                                            site_4.setBackgroundResource(R.drawable.score0 + thou);
                                            site_3.setBackgroundResource(R.drawable.score0 + hun);
                                            site_2.setBackgroundResource(R.drawable.score0);
                                            site_1.setBackgroundResource(R.drawable.score0);
                                        }
                                    } else {
                                        site_5.setBackgroundResource(R.drawable.score0 + ten_thou);
                                        site_4.setBackgroundResource(R.drawable.score0 + thou);
                                        site_3.setBackgroundResource(R.drawable.score0 + hun);
                                        site_2.setBackgroundResource(R.drawable.score0);
                                        site_1.setBackgroundResource(R.drawable.score0);
                                    }
                                } else {
                                    site_6.setBackgroundResource(R.drawable.score0 + hun_thou);
                                    site_5.setBackgroundResource(R.drawable.score0 + ten_thou);
                                    site_4.setBackgroundResource(R.drawable.score0 + thou);
                                    site_3.setBackgroundResource(R.drawable.score0 + hun);
                                    site_2.setBackgroundResource(R.drawable.score0);
                                    site_1.setBackgroundResource(R.drawable.score0);
                                }
                            } else {
                                site_7.setBackgroundResource(R.drawable.score0 + mill);
                                site_6.setBackgroundResource(R.drawable.score0 + hun_thou);
                                site_5.setBackgroundResource(R.drawable.score0 + ten_thou);
                                site_4.setBackgroundResource(R.drawable.score0 + thou);
                                site_3.setBackgroundResource(R.drawable.score0 + hun);
                                site_2.setBackgroundResource(R.drawable.score0);
                                site_1.setBackgroundResource(R.drawable.score0);
                            }
                        } else {
                            site_8.setBackgroundResource(R.drawable.score0 + ten_mill);
                            site_7.setBackgroundResource(R.drawable.score0 + mill);
                            site_6.setBackgroundResource(R.drawable.score0 + hun_thou);
                            site_5.setBackgroundResource(R.drawable.score0 + ten_thou);
                            site_4.setBackgroundResource(R.drawable.score0 + thou);
                            site_3.setBackgroundResource(R.drawable.score0 + hun);
                            site_2.setBackgroundResource(R.drawable.score0);
                            site_1.setBackgroundResource(R.drawable.score0);
                        }
                    } else {
                        site_9.setBackgroundResource(R.drawable.score0 + hun_mill);
                        site_8.setBackgroundResource(R.drawable.score0 + ten_mill);
                        site_7.setBackgroundResource(R.drawable.score0 + mill);
                        site_6.setBackgroundResource(R.drawable.score0 + hun_thou);
                        site_5.setBackgroundResource(R.drawable.score0 + ten_thou);
                        site_5.setBackgroundResource(R.drawable.score0 + ten_thou);
                        site_4.setBackgroundResource(R.drawable.score0 + thou);
                        site_3.setBackgroundResource(R.drawable.score0 + hun);
                        site_2.setBackgroundResource(R.drawable.score0);
                        site_1.setBackgroundResource(R.drawable.score0);


                    }
                    break;
                case 2:
                    mTenStateView.setBackgroundResource(R.drawable.clear_win);
                    mOneStateView.setBackgroundResource(R.drawable.score0);
                    int one_s = GameMode.combo % 10;
                    int ten_s = (GameMode.combo % 100 - one_s) / 10;

                    if (ten_s == 0) {
                        if (one_s == 0) {

                        } else {
                            mOneStateView.setBackgroundResource(R.drawable.score0 + one_s);
                        }
                    } else {
                        mTenStateView.setBackgroundResource(R.drawable.score0 + ten_s);
                        mOneStateView.setBackgroundResource(R.drawable.score0 + one_s);
                    }


                    break;
                case 100:
                    if (isLeft == 1) {
                        mbtn.setBackgroundResource(R.drawable.alpha_pannel);
                        switch (GameMode.gamemode) {
                            case 3:
                                left = AnimationUtils.loadAnimation(ThreeWindow.mContext, R.anim.go);
                                mImg.startAnimation(left);
                                break;
                            case 6:
                                left = AnimationUtils.loadAnimation(SixWindow.mContext, R.anim.go2);
                                mImg.startAnimation(left);
                                break;
                            case 9:
                                left = AnimationUtils.loadAnimation(NineWindow.mContext, R.anim.go3);
                                mImg.startAnimation(left);
                                break;
                        }
                    } else {
                        mbtn.setBackgroundResource(R.drawable.alpha_pannel);
                        switch (GameMode.gamemode) {
                            case 3:
                                right = AnimationUtils.loadAnimation(ThreeWindow.mContext, R.anim.back);
                                mImg.startAnimation(right);
                                break;
                            case 6:
                                right = AnimationUtils.loadAnimation(SixWindow.mContext, R.anim.back2);
                                mImg.startAnimation(right);
                                break;
                            case 9:
                                right = AnimationUtils.loadAnimation(NineWindow.mContext, R.anim.back3);
                                mImg.startAnimation(right);
                                break;
                        }
                    }
                    break;
                case 255:
                    if (isLeft == 1) {
                        switch (GameMode.gamemode) {
                            case 3:
                                left = AnimationUtils.loadAnimation(ThreeWindow.mContext, R.anim.go_back);
                                mImg.startAnimation(left);
                                break;
                            case 6:
                                left = AnimationUtils.loadAnimation(SixWindow.mContext, R.anim.go2_back);
                                mImg.startAnimation(left);
                                break;
                            case 9:
                                left = AnimationUtils.loadAnimation(NineWindow.mContext, R.anim.go3_back);
                                mImg.startAnimation(left);
                                break;
                        }
                        mbtn.setBackgroundResource(R.drawable.clear_win);
                    }

                    if (isLeft == 0) {
                        switch (GameMode.gamemode) {
                            case 3:
                                right = AnimationUtils.loadAnimation(ThreeWindow.mContext, R.anim.back_back);
                                mImg.startAnimation(right);
                                break;
                            case 6:
                                right = AnimationUtils.loadAnimation(SixWindow.mContext, R.anim.back2_back);
                                mImg.startAnimation(right);
                                break;
                            case 9:
                                right = AnimationUtils.loadAnimation(NineWindow.mContext, R.anim.back3_back);
                                mImg.startAnimation(right);
                                break;
                        }
                        mbtn.setBackgroundResource(R.drawable.clear_win);
                    }
                    break;
            }
        }
    };


    public class btnThread extends Thread {

        @Override
        public void run() {

            vbtnCheck = false;
            vthreadCheck = false;
            endCheck = false;
            for (int i = 0; i < 500; i++) {
                if (oneTimeAction) {

                    btnHandler.sendEmptyMessage(100);
                    oneTimeAction = false;
                }
                int time = 2;

                try {
                    on_off = false;
                    this.sleep(time);
                    on_off = true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (vbtnCheck) {
                    vthreadCheck = true;
                    vbtnCheck = false;
                    break;
                }

            }

            btnHandler.sendEmptyMessage(255);

            oneTimeAction = true;


        }
    }


    public class btnMethodThread extends Thread {
        @Override
        public void run() {

            GameMode.gameEnd = false;
            endCheck = false;
            int st = 0;

            try {
                while (!endCheck) {
                    int randTime;
                    btnThread thread = new btnThread();

                    if (st == 0) randTime = (int) (Math.random() * 4.5) * 1000;
                    else randTime = (int) (Math.random() * 4000)
                            - (int) (GameMode.score * 0.01);
                    st = 1;

                    try {
                        this.sleep(randTime);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    thread.start();

                    try {
                        thread.join();


                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    thread.interrupt();

                    if (!vthreadCheck) {
                        GameMode.combo = 0;
                        GameMode.life--;
                        if (GameMode.life <= 0) {
                            endCheck = true;
                        }
                        vthreadCheck = false;
                        btnHandler.sendEmptyMessage(0);

                    } else {
                        GameMode.combo += 1;
                        GameMode.score += 1000;
                        btnHandler.sendEmptyMessage(1);
                        vthreadCheck = false;

                    }

                    btnHandler.sendEmptyMessage(2);
                    vthreadCheck = false;
                    thread = null;


                }
                GameMode.gameEnd = true;


                btnThread thread = new btnThread();

                thread.interrupt();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
