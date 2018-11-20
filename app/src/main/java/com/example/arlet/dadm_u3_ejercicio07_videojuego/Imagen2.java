package com.example.arlet.dadm_u3_ejercicio07_videojuego;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;

public class Imagen2 {

    Bitmap icono;
    float x, y;
    private boolean visible;


    public Imagen2(int recurso, float _x, float _y, Lienzo2 l)
    {
        icono = BitmapFactory.decodeResource(l.getResources(), recurso);
        x = _x;
        y = _y;
        visible = true;
    }


    public void pintar (Canvas c, Paint p)
    {
        if (visible)
        {
            c.drawBitmap(icono, x, y,p);
        }
    }

    public boolean estaEnArea(float xp, float yp)
    {
        float x2, y2;
        if (!visible)
        {
            return false;
        }
        x2 = x + icono.getWidth();
        y2 = y + icono.getHeight();

        if(xp>=x && xp<=x2)
        {
            if(yp >= y && yp <= y2)
            {
                return true;
            }
        }
        return false;
    }


}
