package com.example.cloud.customviewleaningpath.partTwo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cloud on 2018/4/11.
 */

public class P02RadiaGradientView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    public P02RadiaGradientView(Context context) {
        super(context);
    }

    public P02RadiaGradientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public P02RadiaGradientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setShader(new RadialGradient(300,500,200, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"), Shader.TileMode.CLAMP));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(100,300,500,900,paint);
    }
}
