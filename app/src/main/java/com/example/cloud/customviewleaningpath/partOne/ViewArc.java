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

public class ViewArc extends View {
    public ViewArc(Context context) {
        super(context);
    }

    public ViewArc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewArc(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //
    }

    Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // x轴正右方向是0度   按顺时针方向。
        canvas.drawArc(100,200,500,700,90,90,true,mPaint);
//        canvas.drawArc(100,200,500,700,30,90,true,mPaint);
    }
}
