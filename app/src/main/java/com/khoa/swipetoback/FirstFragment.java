package com.khoa.swipetoback;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import me.yokeyword.swipebackfragment.SwipeBackFragment;

public class FirstFragment extends SwipeBackFragment {

    public FirstFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        return attachToSwipeBack(view);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_open_second_fragment).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondFragment();
            }
        });
    }

    public void openSecondFragment(){
        MainActivity mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(SecondFragment.class.getSimpleName())
                .add(R.id.frame_layout, new SecondFragment(), SecondFragment.class.getSimpleName())
                .commit();

    }
}
