package com.example.kim.slam;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by willtriti on 2015-07-14.
 */
public class HowTo extends FragmentActivity {
    public ImageView inform;
    int i=1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to);

        Button next = (Button) findViewById(R.id.next);
        inform=(ImageView)findViewById(R.id.inform);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i%2==1){
                    inform.setBackgroundResource(R.drawable.how_to_play);
                    i++;
                }
                else{
                    inform.setBackgroundResource(R.drawable.story);
                    i++;
                }
            }
        });

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HowTo.this.finish();
            }
        });
    }
}
