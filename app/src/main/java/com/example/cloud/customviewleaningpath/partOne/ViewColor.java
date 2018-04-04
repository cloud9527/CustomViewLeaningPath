package com.example.cloud.customviewleaningpath.partOne;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/4.
 */

public class ViewColor extends View {
    public ViewColor(Context context) {
        super(context);
    }

    public ViewColor(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewColor(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.YELLOW);
    }
}
