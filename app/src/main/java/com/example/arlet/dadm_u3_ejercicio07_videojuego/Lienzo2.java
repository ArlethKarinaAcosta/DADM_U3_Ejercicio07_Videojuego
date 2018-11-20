package com.example.arlet.dadm_u3_ejercicio07_videojuego;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo2 extends View {

    Imagen2 icono1, icono2, icono3, icono4, puntero;
    Main2Activity puntero2;
    String mensaje, mensaje2;
    MediaPlayer mp;

    public Lienzo2(Context context) {
        super(context);

        icono1 = new Imagen2(R.drawable.nombrejuego, 600, 500, this);
        icono2 = new Imagen2(R.drawable.navefinal2, 700, 1050, this);
        icono3 = new Imagen2(R.drawable.comenzarjuego, 500, 1400, this);
        puntero2 = (Main2Activity) context;
        puntero = null;
        mensaje ="Are you ready for it?";
        mp = new MediaPlayer();
        mensaje2 ="¡Junta 400 puntos y gana!";

        mp = MediaPlayer.create(puntero2, R.raw.inicio);
        mp.start();




    }

    public void onDraw(Canvas c)
    {
        super.onDraw(c);

        Paint p = new Paint();
        c.drawColor(Color.parseColor("#0B0B61"));
        icono1.pintar(c,p);
        icono2.pintar(c,p);
        icono3.pintar(c,p);
        p.setTextSize(110);
        p.setColor(Color.WHITE);
        c.drawText(mensaje, 450, 200, p);
        p.setTextSize(100);
        p.setColor(Color.WHITE);
        c.drawText(mensaje2, 360, 350, p);







    }

    public boolean onTouchEvent(MotionEvent e)
    {

        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if (icono3.estaEnArea(xp, yp)){
                    puntero = icono3; //puntero apunta a icono1
                    cambio();
                }
                break;

            case MotionEvent.ACTION_MOVE:
                break;

            case MotionEvent.ACTION_UP:
                puntero = null;
                break;

        }

        invalidate();
        return true;
    }

    public void cambio()
    {
        mp.stop();
        Intent otraPantalla = new Intent(puntero2, MainActivity.class);
        puntero2.startActivity(otraPantalla);
    }
}
