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

public class ViewRoundRect extends View {
    public ViewRoundRect(Context context) {
        super(context);
    }

    public ViewRoundRect(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewRoundRect(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        canvas.drawRoundRect(100,100,500,700,50,50,paint);
    }
}
