//package com.example.task2;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.Rect;
//import android.util.AttributeSet;
//import android.view.MotionEvent;
//import android.view.View;
//
//import androidx.annotation.Nullable;
//
//public class Paddle extends View
//{
//    Paint paint;
//    Rect rect;
//    float a,b,c,d,e;
//    public Paddle(Context context) {
//        super(context);
//        setFocusable(true);
//        setFocusableInTouchMode(true);
//        paint = new Paint();
//        rect = new Rect();
//    }
//
//    public Paddle(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//    }
//
//    public Paddle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }
//
//    public Paddle(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas)
//    {
//        super.onDraw(canvas);
//        paint.setColor(Color.RED);
//        paint.setStrokeWidth(3);
//        a=canvas.getHeight();
//        b = canvas.getWidth();
//        canvas.drawRect((3*b)/8,a-10,(5*b)/8,a,paint);
//    }
//    @Override
//    public boolean onTouchEvent(MotionEvent event)
//    {
//        int num = event.getPointerCount();
//        for (int a = 0; a < num; a++) {
//            int x = (int) event.getX(event.getPointerId(a));
//            int y = (int) event.getY(event.getPointerId(a));
//            if(y > screenY/2)  playerPoint1.set(x, y);
//            if(y < screenY/2)  playerPoint2.set(x, y);
//        }
//        return true;
//    }
//}
