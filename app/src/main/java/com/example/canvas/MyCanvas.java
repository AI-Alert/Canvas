package com.example.canvas;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class MyCanvas extends View {
    Paint paint;
    Rect rect;

    public MyCanvas(Context context) {
        super(context);
        paint = new Paint();
        rect = new Rect();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(23);

        canvas.drawRect(200, 200, 550, 500, paint);
        canvas.drawCircle(800, 350, 150, paint);
        canvas.drawLine(200, 600, 1000, 600, paint);
        canvas.drawLine(200, 700, 1000, 700, paint);
        canvas.drawLine(200, 800, 1000, 800, paint);

    }
}