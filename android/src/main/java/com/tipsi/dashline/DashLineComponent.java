package com.tipsi.dashline;

import android.graphics.DashPathEffect;
import android.util.AttributeSet;
import android.graphics.PathEffect;
import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.content.Context;
import android.view.View;


public class DashLineComponent extends View
{
    private float density;
    private Paint paint;
    private Path path;
    private PathEffect effects;
    private String dashColor = "#000000";
    private float m_space = 2;
    private float m_line = 4;

    public DashLineComponent(Context context)
    {
        super(context);
        init(context);
    }

    public DashLineComponent(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public DashLineComponent(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init(context);
    }

    public void setDashColor(String color) {
        dashColor = color;
        paint.setColor(Color.parseColor(color));
        invalidate();
    }

    public void setDashLineWidth(float line) {
        m_line = line;
        effects = new DashPathEffect(new float[] { m_line * density, m_space * density}, 0);
        invalidate();
    }

    public void setDashLineSpace(float space) {
        m_space = space;
        effects = new DashPathEffect(new float[] { m_line * density, m_space * density}, 0);
        invalidate();
    }


    private void init(Context context)
    {
        density = getResources().getDisplayMetrics().density;
        paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        //set your own color
        paint.setColor(Color.parseColor(dashColor));
        path = new Path();
        //array is ON and OFF distances in px (4px line then 2px space)
        effects = new DashPathEffect(new float[] { m_line * density, m_space * density}, 0);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        paint.setPathEffect(effects);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        paint.setStrokeWidth(density * measuredHeight);
        path.moveTo(0, 0);
        path.lineTo(measuredWidth, 0);
        canvas.drawPath(path, paint);
    }
}
