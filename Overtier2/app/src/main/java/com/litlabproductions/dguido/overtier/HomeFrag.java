package com.litlabproductions.dguido.overtier;

/**
 * Created by David on 7/1/2017.
 */

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;

import static com.litlabproductions.dguido.overtier.R.id.nav_brigitte;
import static com.litlabproductions.dguido.overtier.R.id.nav_moira;
import static com.litlabproductions.dguido.overtier.R.id.nav_sombra;
import static com.litlabproductions.dguido.overtier.R.id.nav_bastion;
import static com.litlabproductions.dguido.overtier.R.id.nav_genji;
import static com.litlabproductions.dguido.overtier.R.id.nav_junkrat;
import static com.litlabproductions.dguido.overtier.R.id.nav_mcCree;
import static com.litlabproductions.dguido.overtier.R.id.nav_mei;
import static com.litlabproductions.dguido.overtier.R.id.nav_pharah;
import static com.litlabproductions.dguido.overtier.R.id.nav_ana;
import static com.litlabproductions.dguido.overtier.R.id.nav_doomfist;
import static com.litlabproductions.dguido.overtier.R.id.nav_dva;
import static com.litlabproductions.dguido.overtier.R.id.nav_hanzo;
import static com.litlabproductions.dguido.overtier.R.id.nav_lucio;
import static com.litlabproductions.dguido.overtier.R.id.nav_mercy;
import static com.litlabproductions.dguido.overtier.R.id.nav_orisa;
import static com.litlabproductions.dguido.overtier.R.id.nav_reaper;
import static com.litlabproductions.dguido.overtier.R.id.nav_reinhart;
import static com.litlabproductions.dguido.overtier.R.id.nav_roadhog;
import static com.litlabproductions.dguido.overtier.R.id.nav_soldier;
import static com.litlabproductions.dguido.overtier.R.id.nav_symmetra;
import static com.litlabproductions.dguido.overtier.R.id.nav_torb;
import static com.litlabproductions.dguido.overtier.R.id.nav_tracer;
import static com.litlabproductions.dguido.overtier.R.id.nav_wb;
import static com.litlabproductions.dguido.overtier.R.id.nav_widow;
import static com.litlabproductions.dguido.overtier.R.id.nav_winston;
import static com.litlabproductions.dguido.overtier.R.id.nav_zarya;
import static com.litlabproductions.dguido.overtier.R.id.nav_zen;

/**
 * Created by David on 7/1/2017.
 */

public class HomeFrag extends Fragment
{


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_teal);

        TextView homeTitleTV =(TextView) getActivity().findViewById(R.id.toolbar_text_view);
        homeTitleTV.setText("Tier List");


        // ~ Set ability scroll view to never have 'over scroll'.
        HorizontalScrollView homeScrollView1 = (HorizontalScrollView) getActivity().findViewById(R.id.horizontal_scrollview_1);
        HorizontalScrollView homeScrollView2 = (HorizontalScrollView) getActivity().findViewById(R.id.horizontal_scrollview_2);
        HorizontalScrollView homeScrollView3 = (HorizontalScrollView) getActivity().findViewById(R.id.horizontal_scrollview_3);

        homeScrollView1.setOverScrollMode(HorizontalScrollView.OVER_SCROLL_NEVER);
        homeScrollView2.setOverScrollMode(HorizontalScrollView.OVER_SCROLL_NEVER);
        homeScrollView3.setOverScrollMode(HorizontalScrollView.OVER_SCROLL_NEVER);

        setupLaunchButton();
    }

    private void setupLaunchButton()
    {
        ImageView lucioImageView = (ImageView) getActivity().findViewById(R.id.lucio_image_view);
        ImageView doomfistImageView = (ImageView) getActivity().findViewById(R.id.doomfist_image_view);
        ImageView winstonImageView = (ImageView) getActivity().findViewById(R.id.winston_image_view);
        ImageView soldierImageView = (ImageView) getActivity().findViewById(R.id.soldier_image_view);
        ImageView reinImageView = (ImageView) getActivity().findViewById(R.id.reinhart_image_view);
        ImageView reaperImageView = (ImageView) getActivity().findViewById(R.id.reaper_image_view);
        ImageView anaImageView = (ImageView) getActivity().findViewById(R.id.ana_image_view);
        ImageView hanzoImageView = (ImageView) getActivity().findViewById(R.id.hanzo_image_view);
        ImageView dvaImageView = (ImageView) getActivity().findViewById(R.id.dva_image_view);
        ImageView mercyImageView = (ImageView) getActivity().findViewById(R.id.mercy_image_view);
        ImageView orisaImageView = (ImageView) getActivity().findViewById(R.id.orisa_image_view);
        ImageView pharahImageView = (ImageView) getActivity().findViewById(R.id.pharaph_image_view);
        ImageView genjiImageView = (ImageView) getActivity().findViewById(R.id.genji_image_view);
        ImageView tracerImageView = (ImageView) getActivity().findViewById(R.id.tracer_image_view);
        ImageView zaryaImageView= (ImageView) getActivity().findViewById(R.id.zarya_image_view);
        ImageView zenImageView = (ImageView) getActivity().findViewById(R.id.zen_image_view);
        ImageView mcreeImageView = (ImageView) getActivity().findViewById(R.id.mcree_image_view);
        ImageView junkImageView = (ImageView) getActivity().findViewById(R.id.junkrat_image_view);
        ImageView meiImageView = (ImageView) getActivity().findViewById(R.id.mei_image_view);
        ImageView roadhogImageView = (ImageView) getActivity().findViewById(R.id.roadhog_image_view);
        ImageView torbImageView = (ImageView) getActivity().findViewById(R.id.torb_image_view);
        ImageView bastionImageView = (ImageView) getActivity().findViewById(R.id.bastion_image_view);
        ImageView sombraImageView = (ImageView) getActivity().findViewById(R.id.sombra_image_view);
        ImageView symImageView = (ImageView) getActivity().findViewById(R.id.sym_image_view);
        ImageView widowImageView = (ImageView) getActivity().findViewById(R.id.widow_image_view);
        ImageView moiraImageView = (ImageView) getActivity().findViewById(R.id.moira_image_view);
        ImageView brigitteImageView = (ImageView) getActivity().findViewById(R.id.brigitte_image_view);
        ImageView wbImageView = (ImageView) getActivity().findViewById(R.id.wb_image_view);

        final Activity act = getActivity();

        lucioImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_lucio);
            }
        });

        doomfistImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_doomfist);
            }
        });

        winstonImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_winston);
            }
        });

        soldierImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_soldier);
            }
        });

        reinImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_reinhart);
            }
        });

        reaperImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_reaper);
            }
        });

        anaImageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (act instanceof MainActivity)
                ((MainActivity) act).displaySelectedScreen(nav_ana);
            }
        });

        hanzoImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_hanzo);
            }
        });

        dvaImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_dva);
            }
        });

        mercyImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_mercy);
            }
        });

        orisaImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_orisa);
            }
        });

        pharahImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_pharah);
            }
        });

        genjiImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_genji);
            }
        });

        tracerImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_tracer);
            }
        });

        zaryaImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_zarya);
            }
        });

        zenImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_zen);
            }
        });

        mcreeImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_mcCree);
            }
        });

        junkImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_junkrat);
            }
        });

        meiImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_mei);
            }
        });

        roadhogImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_roadhog);
            }
        });

        torbImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_torb);
            }
        });

        bastionImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_bastion);
            }
        });

        sombraImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_sombra);
            }
        });

        symImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_symmetra);
            }
        });

        widowImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_widow);
            }
        });

        moiraImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_moira);
            }
        });

        brigitteImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_brigitte);
            }
        });

        wbImageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (act instanceof MainActivity)
                    ((MainActivity) act).displaySelectedScreen(nav_wb);
            }
        });

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

       View view = inflater.inflate(R.layout.frag_home,container, false);

            // ~ Return altered view.
        return view;
    }
}