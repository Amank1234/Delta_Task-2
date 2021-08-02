package com.example.task2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

import java.text.Normalizer;

import static androidx.core.content.ContextCompat.startActivity;


public class MyCanvas extends View {
    Paint paint;
    Rect rect;
    private final Context context;
    float x = getWidth() / 2;
    float y;
int count = 0;
int c=0;
    float i = 0;
    float l;
    float m;
    int z=0;
    float xv = (13+i/800000000);
    float yv =-(8+i/600000000);
    float prevx;
    float prevy;
    float pointX;
    float pointY;
    public Path path ;

    public MyCanvas(Context context, Context context1) {
        super(context);
        this.context = context1;
        setFocusable(true);
        setFocusableInTouchMode(true);
        paint = new Paint();
        rect = new Rect();
path= new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);

        l = getWidth();
        m = getHeight();

        if (i == 0) {
            x = getWidth() / 2;
            y = getHeight() / 2;


        } else {
            if (x >= ((31*l)/32)) {
                xv = -(13+i/800000000);
//                    yv=-2;

                x = x + xv;
                y = y + yv;
            } else if (x <= (m/32)) {
                xv = 13+i/800000000;
//                    yv=-2;
                x = x + xv;
                y = y + yv;
            } else if (y <= (m/32)) {
//                    xv=5;
                yv = 8+i/600000000;
                x = x + xv;
                y = y + yv;
            } else {
                x += xv;
                y += yv;
            }

        }
        if((y>=(m-(30+(m/32))))&&(y<=m-30))
        {
            if(pointX<=(5*l/6)) {

                if ((x >= pointX) && (x <= (pointX + l / 6))) {


                    c++;
                    yv = -(6 + i / 600000000);
                    x = x + xv;
                    y = y + yv;
                }
            }
            else
            {
                if(x>(5*l/6)&&x<=(l-(m/32)))
                {
                    c++;
                    yv = -(6 + i / 600000000);
                    x = x + xv;
                    y = y + yv;
                }
            }
        }
        else if(y>m)
        {
count=c;
z++;
        }
        i++;
        canvas.drawColor(Color.BLACK);
        canvas.drawCircle(x, y, getHeight() / 32, paint);
        if(( pointX)<=(5*l/6)) {


            canvas.drawRect(0 + pointX, m - 30, l / 6 + pointX, m, paint);
        }
        else
        {
            canvas.drawRect((5*l/6), m - 30,  l, m, paint);
        }

        if(z==0)
        {
            count=c;
            invalidate();
        }
        else
        {

Intent i1 = new Intent();
i1.setClass(context,MainActivity2.class);
            String s = Integer.toString(count);
            i1.putExtra("msg", s);
            i1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
context.startActivity(i1);

//            Intent i1 = new Intent (context, MainActivity2.class);
//            String s = Integer.toString(count);
//            i1.putExtra("msg", s);
//            context.startActivity(i1);

        }
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
         pointX = event.getX();
         pointY = event.getY();
        // Checks for the event that occurs
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                path.moveTo(pointX, pointY);
                return true;
            case MotionEvent.ACTION_MOVE:
                {
                path.lineTo(pointX, pointY);

            }
            case MotionEvent.ACTION_UP:
                break;
            default:
                return false;
        }
        postInvalidate();
        return true;
    }

}










