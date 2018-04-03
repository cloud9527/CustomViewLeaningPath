package com.example.cloud.customviewleaningpath.partOne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/1.
 */
public class ViewOne extends View {
    Paint mPaint = new Paint();
    public ViewOne(Context context) {
        super(context);
        initPaint();
    }

    public ViewOne(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }
    public ViewOne(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
//        mPaint.setColor(Color.BLUE);
        //Style 具体来说有三种： FILL, STROKE 和 FILL_AND_STROKE 。FILL 是填充模式，STROKE 是画线模式（即勾边模式）
        // ，FILL_AND_STROKE 是两种模式一并使用：既画线又填充。它的默认值是 FILL，填充模式。
//        mPaint.setStyle(Paint.Style.STROKE);
//        //在STROKE 和 FILL_AND_STROKE 下，还可以使用 paint.setStrokeWidth(float width) 来设置线条的宽度
//        mPaint.setStrokeWidth(20);
//        //抗锯齿
//        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
        //画圆
//        canvas.drawCircle(500,500,300,mPaint);
        //矩形实心
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawRect(100,300,500,800,mPaint);
        //矩形空心
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawRect(300,300,500,800,mPaint);

        //画点
        mPaint.setStrokeWidth(20);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);
//        mPaint.setStrokeCap(Paint.Cap.BUTT);
//        mPaint.setStrokeCap(Paint.Cap.SQUARE);
//        canvas.drawPoint(300,500,mPaint);

//        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
//        canvas.drawPoints(points,0,9,mPaint);

//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawOval(100,100,500,300,mPaint);
//        canvas.drawLine(100,300,599,583,mPaint);
//
//        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20,
//                150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(points, mPaint);
//
//        mPaint.setStyle(Paint.Style.STROKE);
//        canvas.drawRoundRect(500,500,700,900,50,50,mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(100,100,300,500,0,-100,true  ,mPaint);

    }
}
