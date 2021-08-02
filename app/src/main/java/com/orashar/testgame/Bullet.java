package com.orashar.testgame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import static com.orashar.testgame.GameView.screenRatioX;
import static com.orashar.testgame.GameView.screenRatioY;

public class Bullet {
    int x, y;
    Bitmap bullet;

    Bullet(Resources res){
        bullet = BitmapFactory.decodeResource(res, R.drawable.bullet);

        int width = bullet.getWidth();
        int height = bullet.getHeight();

        width /= 4;
        height /= 4;

        //width *= (int) screenRatioX;
        //height *= (int) screenRatioY;

        bullet = Bitmap.createScaledBitmap(bullet, width, height, false);
    }
}
