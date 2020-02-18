package com.khoa.swipetoback;

import android.os.Bundle;

import me.yokeyword.swipebackfragment.SwipeBackActivity;

public class SecondActivity extends SwipeBackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_fragment);
    }
}
