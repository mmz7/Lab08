package com.zhangmegan.lab08;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    Paint p = new Paint();
    int y = 0, dY = 5;
    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p.setColor(Color.YELLOW);
        canvas.drawCircle(100, y, 130.5F, p);
        canvas.drawCircle(500, 200, 130.5F, new Paint());
        y+=dY;
        y%=getHeight();
        invalidate();
    }
}
