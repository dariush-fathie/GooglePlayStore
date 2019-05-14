package com.noeurng.playstoresample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class ParentRecyclerView extends RecyclerView {

    private GestureDetector mGestureDetector;

    public ParentRecyclerView(Context context) {
        super(context);
        mGestureDetector = new GestureDetector(this.getContext(), new YScrollDetector());
        // do the same in other constructors
    }

    public ParentRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mGestureDetector = new GestureDetector(this.getContext(), new YScrollDetector());
    }

    public ParentRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        mGestureDetector = new GestureDetector(this.getContext(), new YScrollDetector());
    }


// and override onInterceptTouchEvent

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return super.onInterceptTouchEvent(ev) && mGestureDetector.onTouchEvent(ev);
    }

}