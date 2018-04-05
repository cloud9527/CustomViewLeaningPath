package com.example.cloud.customviewleaningpath.partOne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/5.
 */

public class ViewHistogram extends View {

    private Paint mLinePaint;
    private Paint mHistogramPaint;

    public ViewHistogram(Context context) {
        super(context);
        initPaint();
    }

    public ViewHistogram(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initPaint();
    }

    public ViewHistogram(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initPaint();
    }

    private void initPaint() {
        mLinePaint = new Paint();
        mLinePaint.setStrokeWidth(4);
        mLinePaint.setColor(Color.BLACK);
        mHistogramPaint = new Paint();
        mHistogramPaint.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawLine(150,150,150,800,mLinePaint);
        canvas.drawLine(150,800,1000,800,mLinePaint);

        Rect rect = new Rect(200,600,250,800);
        canvas.drawRect(rect,mHistogramPaint);
        canvas.drawRect(new Rect(300,500,350,800),mHistogramPaint);
        canvas.drawRect(new Rect(400,200,450,800),mHistogramPaint);
        canvas.drawRect(new Rect(500,250,550,800),mHistogramPaint);
        canvas.drawRect(new Rect(600,350,650,800),mHistogramPaint);
        canvas.drawRect(new Rect(700,450,750,800),mHistogramPaint);
        canvas.drawRect(new Rect(800,550,850,800),mHistogramPaint);

    }
}
