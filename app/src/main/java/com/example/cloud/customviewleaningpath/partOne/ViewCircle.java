package com.example.cloud.customviewleaningpath.partOne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/4.
 */

public class ViewCircle extends View {

    public ViewCircle(Context context) {
        super(context);
    }

    public ViewCircle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewCircle(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        mPaint.setColor(Color.RED);
        //        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        //1.
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200, 200, 100, mPaint);

        //2.
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(500, 200, 100, mPaint);

        //3.
        mPaint.setColor(Color.MAGENTA);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(200,500,100,mPaint);

        //4.
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(30);
        canvas.drawCircle(500,500,100,mPaint);

    }
}
