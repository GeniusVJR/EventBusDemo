package com.geniusvjr.eventbusdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by dream on 16/5/13.
 */
public class SecondActivity extends Activity{

    private Button btn_FirstEvent, btn_SecondEvent, btn_ThirdEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_FirstEvent = (Button) findViewById(R.id.btn_first_event);
        btn_SecondEvent = (Button) findViewById(R.id.btn_second_event);
        btn_ThirdEvent = (Button) findViewById(R.id.btn_third_event);
        btn_FirstEvent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                EventBus.getDefault().post(
                        new FirstEvent("FirstEvent btn clicked"));
            }
        });

        btn_SecondEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(
                        new SecondEvent("SecondEvent btn clicked")
                );
            }
        });


        btn_ThirdEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(
                        new ThirdEvent("ThirdEvent btn clicked")
                );
            }
        });


    }
}
