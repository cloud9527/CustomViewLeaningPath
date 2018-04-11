package com.example.cloud.customviewleaningpath.partTwo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.cloud.customviewleaningpath.R;

/**
 * Created by cloud on 2018/4/11.
 */

public class P06LightingColorFilterView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Bitmap bitmap;
    ColorFilter colorFilter1 = new LightingColorFilter(0x00ffff, 0x111000);
    ColorFilter colorFilter2 = new LightingColorFilter(0xffffff, 0x003000);

    public P06LightingColorFilterView(Context context) {
        super(context);
    }

    public P06LightingColorFilterView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public P06LightingColorFilterView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.batman);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);;

        paint.setColorFilter(colorFilter1);
        canvas.drawBitmap(bitmap, 0, 0, paint);

        paint.setColorFilter(colorFilter2);
        canvas.drawBitmap(bitmap, bitmap.getWidth() + 100, 0, paint);
    }
}
