package com.litlabproductions.dguido.overtier;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import static com.litlabproductions.dguido.overtier.R.id.nav_about;
import static com.litlabproductions.dguido.overtier.R.id.nav_ana;
import static com.litlabproductions.dguido.overtier.R.id.nav_bastion;
import static com.litlabproductions.dguido.overtier.R.id.nav_brigitte;
import static com.litlabproductions.dguido.overtier.R.id.nav_doomfist;
import static com.litlabproductions.dguido.overtier.R.id.nav_dva;
import static com.litlabproductions.dguido.overtier.R.id.nav_genji;
import static com.litlabproductions.dguido.overtier.R.id.nav_hanzo;
import static com.litlabproductions.dguido.overtier.R.id.nav_home;
import static com.litlabproductions.dguido.overtier.R.id.nav_junkrat;
import static com.litlabproductions.dguido.overtier.R.id.nav_lucio;
import static com.litlabproductions.dguido.overtier.R.id.nav_mcCree;
import static com.litlabproductions.dguido.overtier.R.id.nav_mei;
import static com.litlabproductions.dguido.overtier.R.id.nav_mercy;
import static com.litlabproductions.dguido.overtier.R.id.nav_moira;
import static com.litlabproductions.dguido.overtier.R.id.nav_orisa;
import static com.litlabproductions.dguido.overtier.R.id.nav_pharah;
import static com.litlabproductions.dguido.overtier.R.id.nav_reaper;
import static com.litlabproductions.dguido.overtier.R.id.nav_reinhart;
import static com.litlabproductions.dguido.overtier.R.id.nav_roadhog;
import static com.litlabproductions.dguido.overtier.R.id.nav_soldier;
import static com.litlabproductions.dguido.overtier.R.id.nav_sombra;
import static com.litlabproductions.dguido.overtier.R.id.nav_symmetra;
import static com.litlabproductions.dguido.overtier.R.id.nav_torb;
import static com.litlabproductions.dguido.overtier.R.id.nav_tracer;
import static com.litlabproductions.dguido.overtier.R.id.nav_wb;
import static com.litlabproductions.dguido.overtier.R.id.nav_widow;
import static com.litlabproductions.dguido.overtier.R.id.nav_winston;
import static com.litlabproductions.dguido.overtier.R.id.nav_zarya;
import static com.litlabproductions.dguido.overtier.R.id.nav_zen;

public class BastionPatchFrag extends Fragment {

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
        View view = inflater.inflate(R.layout.frag_bastion_patch, container, false);
        return view;
    }
}

