package com.example.cloud.customviewleaningpath.partOne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/5.
 */

public class ViewPie extends View {
    Paint mPaint;
    RectF mRectF;

    public ViewPie(Context context) {
        super(context);
        initData();
    }

    public ViewPie(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initData();
    }

    private void initData() {
        mRectF = new RectF(200,200,800,800);
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.BLACK);

    }

    public ViewPie(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initData();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.LTGRAY);
        mPaint.setColor(Color.RED);
        canvas.drawArc(mRectF,0,45,true,mPaint);
        mPaint.setColor(Color.GREEN);
        canvas.drawArc(mRectF,50,70,true,mPaint);
        mPaint.setColor(Color.YELLOW);
        //使用rectf来实现偏移
        mRectF.offset(-10,-10);
        canvas.drawArc(mRectF,125,180,true,mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(mRectF,320,20,true,mPaint);
//        mPaint.setColor(Color.CYAN);
//        canvas.drawArc(mRectF,305,360,true,mPaint);
    }
}
