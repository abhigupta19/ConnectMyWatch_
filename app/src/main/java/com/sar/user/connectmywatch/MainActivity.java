package com.sar.user.connectmywatch;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toolbar;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView get100,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Selfstudy");
        final  ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.menu);

        get100=findViewById(R.id.textView2);
        String text="GET 100% REFUND";
        SpannableString ss=new SpannableString(text);
        ForegroundColorSpan fcs=new ForegroundColorSpan(Color.RED);
        ss.setSpan(fcs,3,8,SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        get100.setText(ss);

        date=findViewById(R.id.textView6);
        String text6="Your free trial expired on 29 Jan 2019";
        SpannableString ss6=new SpannableString(text6);
         ForegroundColorSpan fcs6=new ForegroundColorSpan(Color.BLACK);
        ss6.setSpan(fcs6,27,38,SpannableString.SPAN_EXCLUSIVE_EXCLUSIVE);
        date.setText(ss6);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
}
