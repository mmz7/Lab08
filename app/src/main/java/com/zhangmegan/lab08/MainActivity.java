package com.zhangmegan.lab08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    DrawView dV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dV = findViewById(R.id.drawView);
    }

    public void reverseY(View view) {
        dV.dY *=-1;
    }
}