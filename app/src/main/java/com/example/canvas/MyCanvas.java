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
        canvas.drawRect(600, 200, 950, 500, paint);
        canvas.drawCircle(360, 750, 170, paint);
        canvas.drawCircle(780, 750, 170, paint);
        canvas.drawLine(200, 1050, 950, 1050, paint);
        canvas.drawLine(200, 1150, 950, 1150, paint);
        canvas.drawLine(200, 1250, 950, 1250, paint);

    }
}