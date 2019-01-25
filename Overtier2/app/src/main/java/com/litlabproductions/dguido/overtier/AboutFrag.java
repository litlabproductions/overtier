package com.litlabproductions.dguido.overtier;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AboutFrag extends Fragment {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

            // ~ Toolbar Access.
        TextView toolbarTV = (TextView) getActivity().findViewById(R.id.toolbar_text_view);
        toolbarTV.setText("About");



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.frag_about, container, false);
        return view;
    }
}
