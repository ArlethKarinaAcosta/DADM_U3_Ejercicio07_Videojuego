package com.example.arlet.dadm_u3_ejercicio07_videojuego;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.CountDownTimer;

public class Imagen {

    Bitmap icono;
    float x, y;
    private boolean visible;
    int desplazamiento, d, lado;
    CountDownTimer timer, timer2, timer3;

    public Imagen(int recurso, float _x, float _y, final Lienzo l, final Imagen nave)
    {
        icono = BitmapFactory.decodeResource(l.getResources(), recurso);
        x = _x;
        y = _y;
        visible = true;

        timer = new CountDownTimer(1000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                y+=desplazamiento;
                if(y>=l.getHeight()+120)
                {
                    y = -120;
                }
                l.invalidate();


            }

            @Override
            public void onFinish() {
                start();

            }
        };

        timer2 = new CountDownTimer(1000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {
                y-=d;
                if(y<=50)
                {
                    y = 1900;
                    x = nave.x;
                }
                l.invalidate();
            }

            @Override
            public void onFinish() {
                start();

            }
        };

        timer3 = new CountDownTimer(1000, 100) {
            @Override
            public void onTick(long millisUntilFinished) {

                y+=lado;
                if(y>=l.getHeight()+120)
                {
                    y = nave.y+450;
                    x = nave.x+100;
                }
                l.invalidate();

            }

            @Override
            public void onFinish() {
                start();
            }
        };



    }

    public void pintar(Canvas c, Paint p) {
        if (visible) {
            c.drawBitmap(icono, x, y, p);
        }
    }

    public void hacerVisible(boolean v)
    {
        visible = v;
    }

    public boolean estaEnArea(float xp, float yp)
    {
        float x2, y2;
        if(!visible)
        {
            return  false;
        }

        x2 = x + icono.getWidth();
        y2 = y + icono.getHeight();

        if(xp>=x && xp<=x2)
        {
            if(yp >=y && yp <= y2)
            {
                return true;
            }
        }

        return false;
    }

    public void mover(float xp) //float yp)
    {
        x = xp - icono.getWidth()/2;
        //y = yp - icono.getHeight()/2;
    }

    public void moverCosas(int desplaza)
    {
        desplazamiento = desplaza;
        timer.start();
    }

    public void moverBala(int des)
    {
        d = des;
        timer2.start();
    }

    public void moverBalaMarciano(int l)
    {
        lado = l;
        timer3.start();
    }

    public boolean colisionNew(Imagen objetoC)
    {
        float x2 = x + icono.getWidth();
        float y2 = y + icono.getHeight();

        if(objetoC.estaEnArea(x2, y))
        {
            return true;
        }
        if(objetoC.estaEnArea(x, y))
        {
            return true;

        }
        if(objetoC.estaEnArea(x2, y2))
        {
            return true;
        }

        if(objetoC.estaEnArea(x,y2))
        {
            return true;
        }
        return false;
    }
















}
