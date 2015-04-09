package com.jash.jpushdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import cn.jpush.android.api.JPushInterface;


public class OtherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            //获得消息内容
            String string = extras.getString(JPushInterface.EXTRA_ALERT);
            TextView view = (TextView) findViewById(R.id.text);
            view.setText(string);
        }
    }
}
