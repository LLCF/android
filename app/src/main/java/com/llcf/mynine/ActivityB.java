package com.llcf.mynine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by likai on 2015/11/28.
 */
public class ActivityB extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Button button = (Button)findViewById(R.id.next_but);
        //TextView textView = (TextView)findViewById(R.id.);

    }
}
