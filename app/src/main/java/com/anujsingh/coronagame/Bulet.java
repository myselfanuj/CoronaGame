package com.anujsingh.coronagame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Bulet {
    int buletX;
    int buletY;
    int bVelocity;
    static Bitmap bulet;

    public Bulet(Context context) {
        bulet = BitmapFactory.decodeResource(context.getResources(),
                R.drawable.bulet);
        buletX = PlaneAnim.canvasWidth / 2 - bulet.getWidth() / 2;
        buletY = PlaneAnim.canvasHeight - PlaneAnim.tankHeight;
        bVelocity = 40;
    }

    public static int getBuletHeight() {
        return bulet.getHeight();
    }

    public static int getBuletWidtht() {
        return bulet.getWidth();
    }
}
