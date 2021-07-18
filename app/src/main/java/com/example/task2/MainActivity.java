package com.example.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
MyCanvas myCanvas;
//Paddle paddle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        myCanvas = new MyCanvas(this,getApplicationContext());
//        paddle = new Paddle(this);
        myCanvas.setBackgroundColor(Color.BLACK);
//if(myCanvas.count==0) {


    setContentView(myCanvas);
//}
//else
//{
//
//
//
//
//
//            Intent k = new Intent(getApplicationContext(), MainActivity2.class);
//            String s = Integer.toString(myCanvas.count);
//            k.putExtra("msg", s);
//            startActivity(k);
//        }
    }
}
//        myCanvas.update();
//        final Handler ha=new Handler();
//        ha.postDelayed(new Runnable() {
//
//            @Override
//            public void run() {
//                //call function
//                myCanvas.update();
//               ha.postDelayed(this, 10000);
//            }
//        }, 10000);

//        int delay = 0; // delay for 0 sec.
//        int period = 10000; // repeat every 10 sec.
//        Timer timer = new Timer();
//        timer.scheduleAtFixedRate(new TimerTask()
//        {
//            public void run()
//            {
//                myCanvas.update();
//                }
//
//
//        }, delay, period);