package com.litlabproductions.dguido.overtier;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RoadhogPatchFrag extends Fragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        // ~ Set custom font typeface for fragment.
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/big_noodle_titling_oblique.ttf");



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.frag_roadhog_patch, container, false);
        return view;
    }
}
