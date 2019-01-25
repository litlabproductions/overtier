package com.litlabproductions.dguido.overtier;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

import static com.litlabproductions.dguido.overtier.R.id.nav_junkrat;
import static com.litlabproductions.dguido.overtier.R.id.nav_reinhart;
import static com.litlabproductions.dguido.overtier.R.id.nav_torb;
import static com.litlabproductions.dguido.overtier.R.id.nav_widow;
import static com.litlabproductions.dguido.overtier.R.id.nav_winston;
import static com.litlabproductions.dguido.overtier.R.id.nav_zarya;

/**
 * David Guido
 * OVERTIER
 * 7/22/2017
*/

public class SombraFrag extends Fragment
{
    Fragment fragment = null;
    FragmentTransaction ft;


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        // ~ Toolbar Access.
        TextView toolbarTV = (TextView) getActivity().findViewById(R.id.toolbar_text_view);
        toolbarTV.setText("Sombra");

        // ~ Set custom font typeface for fragment.
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "fonts/big_noodle_titling_oblique.ttf");

        // ~ Initialize all XML text areas to be altered.

        TextView strongTV = (TextView) getActivity().findViewById(R.id.strong_textview);
        TextView weakTV = (TextView) getActivity().findViewById(R.id.weak_textview);

        TextView ablitiesTV = (TextView) getActivity().findViewById(R.id.abilities_textview);

        TextView abitityTV1 = (TextView) getActivity().findViewById(R.id.ability_textview_1);
        TextView abitityTV2 = (TextView) getActivity().findViewById(R.id.ability_textview_2);
        TextView abitityTV3 = (TextView) getActivity().findViewById(R.id.ability_textview_3);
        TextView abitityTV4 = (TextView) getActivity().findViewById(R.id.ability_textview_4);
        TextView abitityTV5  = (TextView) getActivity().findViewById(R.id.ability_textview_5);
        TextView abitityTV6 = (TextView) getActivity().findViewById(R.id.ability_textview_6);
        TextView abitityTV7 = (TextView) getActivity().findViewById(R.id.ability_textview_7);
        TextView abitityTV8 = (TextView) getActivity().findViewById(R.id.ability_textview_8);
        TextView abitityTV9 = (TextView) getActivity().findViewById(R.id.ability_textview_9);
        TextView abitityTV10 = (TextView) getActivity().findViewById(R.id.ability_textview_10);
        TextView abitityTV11 = (TextView) getActivity().findViewById(R.id.ability_textview_11);
        TextView abitityTV12 = (TextView) getActivity().findViewById(R.id.ability_textview_12);

        TextView rankTV = (TextView) getActivity().findViewById(R.id.rank_text_view);
        TextView roleTV = (TextView) getActivity().findViewById(R.id.role_text_view);
        TextView diffTV = (TextView) getActivity().findViewById(R.id.diff_text_view);
        Button patchNotesBtn = (Button) getActivity().findViewById(R.id.patch_notes_button);
        Button soundBoardBtn = (Button) getActivity().findViewById(R.id.sound_board_button);
        // ~ Set all initialized text fields to the corresponding custom typeface font.

        strongTV.setTypeface(typeface);
        weakTV.setTypeface(typeface);
        ablitiesTV.setTypeface(typeface);
        abitityTV1.setTypeface(typeface);
        abitityTV2.setTypeface(typeface);
        abitityTV3.setTypeface(typeface);
        abitityTV4.setTypeface(typeface);
        abitityTV5.setTypeface(typeface);
        abitityTV6.setTypeface(typeface);
        abitityTV7.setTypeface(typeface);
        abitityTV8.setTypeface(typeface);
        abitityTV9.setTypeface(typeface);
        abitityTV10.setTypeface(typeface);
        abitityTV11.setTypeface(typeface);
        abitityTV12.setTypeface(typeface);

        rankTV.setTypeface(typeface);
        diffTV.setTypeface(typeface);
        roleTV.setTypeface(typeface);
        patchNotesBtn.setTypeface(typeface);
        soundBoardBtn.setTypeface(typeface);

        // ~ Set on click listeners on strong and weak 1, 2, and 3 image views.
        ImageView strongIV1= (ImageView) getActivity().findViewById(R.id.strong_imageview_1);
        ImageView strongIV2= (ImageView) getActivity().findViewById(R.id.strong_imageview_2);
        ImageView strongIV3= (ImageView) getActivity().findViewById(R.id.strong_imageview_3);

        ImageView weakTV1= (ImageView) getActivity().findViewById(R.id.weak_imageview_1);
        ImageView weakTV2= (ImageView) getActivity().findViewById(R.id.weak_imageview_2);
        ImageView weakTV3= (ImageView) getActivity().findViewById(R.id.weak_imageview_3);

        final Activity act = getActivity();

        strongIV1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_zarya);
            }
        });
        strongIV2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_reinhart);
            }
        });
        strongIV3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_torb);
            }
        });

        weakTV1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_winston);
            }
        });
        weakTV2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_junkrat);
            }
        });
        weakTV3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_widow);
            }
        });


        patchNotesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                    ((MainActivity) act).getSoundPool().play(((MainActivity) act).getSoundSombra2(), 1, 1, 0, 0, 1);
                fragment = new SombraPatchFrag();
                ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_to_right);
                ft.addToBackStack("sombra");
                ft.replace(R.id.content_main, fragment, "1");

                ft.commit();
            }
        });

        // ~ Set ability scroll view to never have 'over scroll'.
        HorizontalScrollView abilityScrollView = (HorizontalScrollView) getActivity().findViewById(R.id.horizontalScrollView2);
        abilityScrollView.setSmoothScrollingEnabled(true);
        abilityScrollView.setOverScrollMode(HorizontalScrollView.OVER_SCROLL_NEVER);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
       View view = inflater.inflate(R.layout.frag_sombra,container, false);
        return view;
    }
}