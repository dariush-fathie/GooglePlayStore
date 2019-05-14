package com.noeurng.playstoresample;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;

public class ParentLayoutManager extends LinearLayoutManager {

    public ParentLayoutManager(Context context, int orientation, boolean reverseLayout) {
        super(context, orientation, reverseLayout);
    }

    @Override
    public boolean canScrollHorizontally() {
        return false ;
    }
}