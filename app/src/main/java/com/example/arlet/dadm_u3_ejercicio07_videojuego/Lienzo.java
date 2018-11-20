package com.example.arlet.dadm_u3_ejercicio07_videojuego;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;

public class Lienzo extends View {

    Imagen icono, icono2, icono3, icono4, puntero, icono5, icono6, icono7, icono8, icono9, icono10, icono11, icono12, icono13, icono14, icono15, icono16, icono17, icono18, icono19, icono20, icono21, icono22, icono23, icono24, icono25, icono26, icono27, icono28, icono29, icono31, icono32, icono33, icono34, icono35, icono36, icono37;
    MainActivity puntero2;
    MediaPlayer mp;
    int scorenumero;
    String score;

    public Lienzo(Context context) {
        super(context);

        icono15 = new Imagen(R.drawable.navefinal2, 700, 1900, this, icono15);
        icono36 = new Imagen(R.drawable.balas, 700, 1900, this, icono15);


        scorenumero = 0;
        score ="";





        icono = new Imagen(R.drawable.estrellablanca2, 100, 250, this, icono);
        icono2 = new Imagen(R.drawable.estrellaamarilla2, 550, 650, this, icono2);
        icono3 = new Imagen(R.drawable.islafinal2, 200, 500, this, icono3);
        icono4 = new Imagen(R.drawable.estrellablanca2, 1400, 900, this, icono4);
        icono5 = new Imagen(R.drawable.estrellaamarilla2, 900, 50, this, icono5);
        icono6 = new Imagen(R.drawable.islafinal2, 450, 125, this, icono6);
        icono7 = new Imagen(R.drawable.estrellablanca2, 800, 1200, this, icono7);
        icono8 = new Imagen(R.drawable.islafinal2, 1000, 800, this, icono8);
        icono9 = new Imagen(R.drawable.islafinal2, 650, 900, this, icono9);
        icono10 = new Imagen(R.drawable.islafinal2, 50, 1500, this, icono10);
        icono11 = new Imagen(R.drawable.islafinal2, 1500, 1700, this, icono11);
        icono12 = new Imagen(R.drawable.estrellablanca2, 1550, 400, this, icono12);
        icono13 = new Imagen(R.drawable.estrellablanca2, 250, 1100, this, icono13);
        icono14 = new Imagen(R.drawable.estrellaamarilla2, 1500, 1300, this, icono14);

        icono16 = new Imagen(R.drawable.navemarciano, 850, 300, this, icono31);
        icono17 = new Imagen(R.drawable.navemarciano, 50, 800, this, icono32);
        icono18 = new Imagen(R.drawable.navemarciano, 1400, 70, this, icono33);
        icono19 = new Imagen(R.drawable.navemarciano, 1000, 1100, this, icono34);
        icono20 = new Imagen(R.drawable.estrellablanca2, 1400, 1550, this, icono20);
        icono21 = new Imagen(R.drawable.estrellaamarilla2, 600, 1500, this, icono21);
        icono22 = new Imagen(R.drawable.navemarciano, 500, 1200, this, icono35);
        icono23 = new Imagen(R.drawable.estrellaamarilla2, 80, 1800, this, icono23);
        icono24 = new Imagen(R.drawable.estrellablanca2, 900, 1700, this, icono24);
        icono25 = new Imagen(R.drawable.estrellaamarilla2, 1100, 2100, this, icono25);
        icono26 = new Imagen(R.drawable.estrellablanca2, 400, 2000, this, icono26);
        icono27 = new Imagen(R.drawable.estrellaamarilla2, 1200, 600, this, icono27);

        icono31 = new Imagen(R.drawable.balamarcianofinal, 850, 300, this, icono16);
        icono32 = new Imagen(R.drawable.balamarcianofinal, 50, 800, this, icono17);
        icono33 = new Imagen(R.drawable.balamarcianofinal, 1400, 70, this, icono18);
        icono34 = new Imagen(R.drawable.balamarcianofinal, 1000, 1100, this, icono19);
        icono35 = new Imagen(R.drawable.balamarcianofinal, 500, 1200, this, icono22);
        icono28 = new Imagen(R.drawable.gameoverfinal, 600, 600, this, icono28);
        icono29 = new Imagen(R.drawable.jugardenuevo, 600, 1200, this, icono29);
        icono37 = new Imagen(R.drawable.ganador, 650, 650, this, icono37);





        puntero = null;
        mp = new MediaPlayer();
        puntero2 = (MainActivity) context;

        icono3.moverCosas(11);
        icono6.moverCosas(5);
        icono8.moverCosas(8);
        icono9.moverCosas(2);
        icono10.moverCosas(6);
        icono11.moverCosas(5);
        icono16.moverCosas(8);
        icono17.moverCosas(20);
        icono18.moverCosas(9);
        icono19.moverCosas(22);
        icono22.moverCosas(10);
        icono31.moverBalaMarciano(10);
        icono32.moverBalaMarciano(22);
        icono33.moverBalaMarciano(12);
        icono34.moverBalaMarciano(24);
        icono35.moverBalaMarciano(13);
        icono36.moverBala(80);

        mp = MediaPlayer.create(puntero2, R.raw.juego);
        mp.start();



    }

    protected void onDraw(Canvas c)
    {
        super.onDraw(c);

        Paint p = new Paint();

        c.drawColor(Color.parseColor("#08088A"));
        icono.pintar(c, p);
        icono2.pintar(c,p);
        icono3.pintar(c,p);
        icono4.pintar(c,p);
        icono5.pintar(c,p);
        icono6.pintar(c,p);
        icono7.pintar(c,p);
        icono8.pintar(c,p);
        icono9.pintar(c,p);
        icono10.pintar(c,p);
        icono11.pintar(c,p);
        icono12.pintar(c,p);
        icono13.pintar(c,p);
        icono14.pintar(c,p);
        icono16.pintar(c,p);
        icono17.pintar(c,p);
        icono18.pintar(c,p);
        icono19.pintar(c,p);
        icono20.pintar(c,p);
        icono21.pintar(c,p);
        icono22.pintar(c,p);
        icono23.pintar(c,p);
        icono24.pintar(c,p);
        icono25.pintar(c,p);
        icono26.pintar(c,p);
        icono27.pintar(c,p);
        icono31.pintar(c,p);
        icono32.pintar(c,p);
        icono33.pintar(c,p);
        icono34.pintar(c,p);
        icono35.pintar(c,p);
        icono36.pintar(c,p);
        icono15.pintar(c,p);
        icono37.pintar(c,p);
        icono37.hacerVisible(false);
        //icono36.hacerVisible(false);
        icono28.pintar(c,p);
        icono28.hacerVisible(false);
        icono29.pintar(c,p);
        icono29.hacerVisible(false);
        p.setColor(Color.WHITE);
        p.setTextSize(70);
        c.drawText(score, 50, 100, p);
        score = "PUNTOS: " + scorenumero;






            if(icono15.colisionNew(icono16)== true )
            {
                icono15.hacerVisible(false);
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();


            }
            if(icono15.colisionNew(icono17) == true)
            {
                icono15.hacerVisible(false);
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();


            }
            if(icono15.colisionNew(icono18) == true)
            {
                icono15.hacerVisible(false);
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();

            }
            if(icono15.colisionNew(icono19)==true)
            {
                icono15.hacerVisible(false);
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();

            }
            if(icono15.colisionNew(icono22))
            {
                icono15.hacerVisible(false);
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();

            }
            if(icono15.colisionNew(icono31) == true)
            {

                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.hacerVisible(false);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();

            }
            if(icono15.colisionNew(icono32) ==true)
            {
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.hacerVisible(false);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();
            }
            if(icono15.colisionNew(icono33) == true)
            {
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.hacerVisible(false);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();

            }
            if(icono15.colisionNew(icono34) == true)
            {
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.hacerVisible(false);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();
            }
            if(icono15.colisionNew(icono35) == true)
            {
                icono28.hacerVisible(true);
                icono29.hacerVisible(true);
                icono15.hacerVisible(false);
                icono15.timer.cancel();
                icono16.timer.cancel();
                icono3.timer.cancel();
                icono4.timer.cancel();
                icono5.timer.cancel();
                icono6.timer.cancel();
                icono8.timer.cancel();
                icono9.timer.cancel();
                icono10.timer.cancel();
                icono11.timer.cancel();
                icono16.timer.cancel();
                icono17.timer.cancel();
                icono18.timer.cancel();
                icono19.timer.cancel();
                icono22.timer.cancel();
                icono36.timer2.cancel();
                icono31.timer3.cancel();
                icono32.timer3.cancel();
                icono33.timer3.cancel();
                icono34.timer3.cancel();
                icono35.timer3.cancel();
                mp.stop();
            }

        if(icono36.colisionNew(icono16) == true)
        {
            icono16.hacerVisible(false);
            icono31.hacerVisible(false);
            scorenumero = scorenumero + 100;
            score = "PUNTOS: " + scorenumero;


        }
        if(icono36.colisionNew(icono17) == true)
        {
            icono17.hacerVisible(false);
            icono32.hacerVisible(false);
            scorenumero = scorenumero + 100;
            score = "PUNTOS: " + scorenumero;

        }
        if(icono36.colisionNew(icono18) == true)
        {
            icono18.hacerVisible(false);
            icono33.hacerVisible(false);
            scorenumero = scorenumero + 100;
            score = "PUNTOS: " + scorenumero;

        }
        if(icono36.colisionNew(icono19) == true)
        {
            icono19.hacerVisible(false);
            icono34.hacerVisible(false);
            scorenumero = scorenumero + 100;
            score = "PUNTOS: " + scorenumero;

        }
        if(icono36.colisionNew(icono22) == true)
        {
            icono22.hacerVisible(false);
            icono35.hacerVisible(false);
            scorenumero = scorenumero + 100;
            score = "PUNTOS: " +scorenumero;

        }

        if(scorenumero == 400)
        {
            icono37.hacerVisible(true);
            icono29.hacerVisible(true);
            icono15.timer.cancel();
            icono16.timer.cancel();
            icono3.timer.cancel();
            icono4.timer.cancel();
            icono5.timer.cancel();
            icono6.timer.cancel();
            icono8.timer.cancel();
            icono9.timer.cancel();
            icono10.timer.cancel();
            icono11.timer.cancel();
            icono16.timer.cancel();
            icono17.timer.cancel();
            icono18.timer.cancel();
            icono19.timer.cancel();
            icono22.timer.cancel();
            icono36.timer2.cancel();
            icono31.timer3.cancel();
            icono32.timer3.cancel();
            icono33.timer3.cancel();
            icono34.timer3.cancel();
            icono35.timer3.cancel();
        }









    }

    public boolean onTouchEvent(MotionEvent e)
    {
        float xp = e.getX();
        float yp = e.getY();

        switch (e.getAction())
        {
            case MotionEvent.ACTION_DOWN:
                if(icono15.estaEnArea(xp,yp))
                {
                    puntero = icono15;
                }
                if(icono29.estaEnArea(xp, yp))
                {
                    //puntero = icono29;
                    cambio();
                }


                break;
            case MotionEvent.ACTION_MOVE:
                if(puntero!=null)
                {

                        icono15.mover(xp);


                }


                break;
            case MotionEvent.ACTION_UP:
                puntero =null;



                break;
        }



        invalidate();
        return true;
    }

    public void cambio()
    {
        mp.stop();
        Intent jugaragain = new Intent(puntero2, MainActivity.class);
        puntero2.startActivity(jugaragain);
    }


}
