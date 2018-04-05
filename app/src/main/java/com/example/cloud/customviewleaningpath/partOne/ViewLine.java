package com.example.cloud.customviewleaningpath.partOne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/5.
 */

public class ViewLine extends View {
    public ViewLine(Context context) {
        super(context);
    }

    public ViewLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStrokeWidth(50);
        canvas.drawLine(10,50,700,1800,mPaint);
    }
}
