package com.example.administrator.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String string = new JNI().sayHello();
        TextView TXT = (TextView) findViewById(R.id.tv);
        TXT.setText(string);
    }
}
