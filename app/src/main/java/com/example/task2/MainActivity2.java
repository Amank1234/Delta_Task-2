package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
private TextView textView;
private TextView textView2;
private Button button;
private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        Intent k = getIntent();
        String p1 = k.getStringExtra("msg");
        int count2 = Integer.parseInt(p1);
        textView2.setText(p1);
    }
    public void move(View v)
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);
    }
    public void move2(View view)
    {
//        if (getIntent().getBooleanExtra("QUIT", false)) {
//            finishAffinity();
//        }
        finishAffinity();
        System.exit(0);
//        int pid = android.os.Process.myPid();
//        android.os.Process.killProcess(pid);
//        Intent intent = new Intent(Intent.ACTION_MAIN);
//        intent.addCategory(Intent.CATEGORY_HOME);
//        startActivity(intent);
    }
}