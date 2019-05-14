package com.noeurng.playstoresample;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

public class ChildLayoutManager extends LinearLayoutManager {

    public ChildLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }


    @Override
    public boolean canScrollVertically() {
        return false;
    }
}