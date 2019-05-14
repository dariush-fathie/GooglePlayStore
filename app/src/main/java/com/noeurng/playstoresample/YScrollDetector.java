package com.noeurng.playstoresample;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;

class YScrollDetector extends GestureDetector.SimpleOnGestureListener {
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.e("onScroll", "x :" + distanceX + " , y : " + distanceY);
        return Math.abs(distanceX) < Math.abs(distanceY);
    }


}