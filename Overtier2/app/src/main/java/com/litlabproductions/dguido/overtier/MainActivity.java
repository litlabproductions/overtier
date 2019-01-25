package com.litlabproductions.dguido.overtier;

import android.graphics.Typeface;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.VideoView;

import java.util.List;

import me.anwarshahriar.calligrapher.Calligrapher;

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



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{
        // ~ Initialize sound object.


    VideoView vv_startsLoop;

    private SoundPool soundPool;
    int soundLucio, soundDoomfist, soundWinston, soundSoldier, soundRein, soundReaper;
    int soundAna, soundHanzo, soundDva, soundMercy, soundOrisa, soundPharah, soundGenji;
    int soundTracer, soundZarya, soundZen, soundMcCree, soundJunkrat, soundMei;
    int soundRoadhog, soundTorb, soundBastion, soundSombra, soundSym, soundWidow, soundMoira, soundBrigitte;
    int soundWB;

    int soundLucio2, soundDoomfist2, soundWinston2, soundSoldier2, soundRein2, soundReaper2;
    int soundAna2, soundHanzo2, soundDva2, soundMercy2, soundOrisa2, soundPharah2, soundGenji2;
    int soundTracer2, soundZarya2, soundZen2, soundMcCree2, soundJunkrat2, soundMei2;
    int soundRoadhog2, soundTorb2, soundBastion2, soundSombra2, soundSym2, soundWidow2, soundMoira2, soundBrigitte2;


    public int getSoundLucio2() {
        return soundLucio2;
    }

    public int getSoundDoomfist2() {
        return soundDoomfist2;
    }

    public int getSoundWinston2() {
        return soundWinston2;
    }

    public int getSoundSoldier2() {
        return soundSoldier2;
    }

    public int getSoundRein2() {
        return soundRein2;
    }

    public int getSoundReaper2() {
        return soundReaper2;
    }

    public int getSoundHanzo2() {
        return soundHanzo2;
    }

    public int getSoundDva2() {
        return soundDva2;
    }

    public int getSoundMercy2() {
        return soundMercy2;
    }

    public int getSoundOrisa2() {
        return soundOrisa2;
    }

    public int getSoundPharah2() {
        return soundPharah2;
    }

    public int getSoundGenji2() {
        return soundGenji2;
    }

    public int getSoundTracer2() {
        return soundTracer2;
    }

    public int getSoundZarya2() {
        return soundZarya2;
    }

    public int getSoundZen2() {
        return soundZen2;
    }

    public int getSoundMcCree2() {
        return soundMcCree2;
    }

    public int getSoundJunkrat2() {
        return soundJunkrat2;
    }

    public int getSoundBrigitte() {
        return soundBrigitte;
    }

    public int getSoundWB() {
        return soundWB;
    }

    public int getSoundMei2() {
        return soundMei2;
    }

    public int getSoundRoadhog2() {
        return soundRoadhog2;
    }

    public int getSoundTorb2() {
        return soundTorb2;
    }

    public int getSoundBastion2() {
        return soundBastion2;
    }

    public int getSoundSombra2() {
        return soundSombra2;
    }

    public int getSoundSym2() {
        return soundSym2;
    }

    public int getSoundWidow2() {
        return soundWidow2;
    }

    public int getSoundAna2() {
        return soundAna2;
    }

    public int getSoundMoira2() {
        return soundMoira2;
    }

    public int getSoundBrigitte2() {
        return soundBrigitte2;
    }

    public Fragment getVisibleFragment(){
        FragmentManager fragmentManager = MainActivity.this.getSupportFragmentManager();
        List<Fragment> fragments = fragmentManager.getFragments();
        if(fragments != null){
            for(Fragment fragment : fragments){
                if(fragment != null && fragment.isVisible())
                    return fragment;
            }
        }
        return null;
    }

    public SoundPool getSoundPool() {
        return soundPool;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

            // Star background loop.
        vv_startsLoop = (VideoView)findViewById(R.id.startsVV);
        vv_startsLoop.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.setLooping(true);
            }
        });

        Uri uri = Uri.parse("android.resource://com.litlabproductions.dguido.overtier/"
                + R.raw.stars_loop2);

        vv_startsLoop.setVideoURI(uri);
        vv_startsLoop.requestFocus();
        vv_startsLoop.start();

            // ~ Implement SoundPool System.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            AudioAttributes audioAttrib = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            soundPool = new SoundPool.Builder().setAudioAttributes(audioAttrib).setMaxStreams(6).build();
        }
        else {

            soundPool = new SoundPool(6, AudioManager.STREAM_MUSIC, 0);
        }
        soundLucio = soundPool.load(MainActivity.this, R.raw.lucio_ms2,1);
        soundDoomfist = soundPool.load(MainActivity.this, R.raw.doomfist_ms,1);
        soundWinston = soundPool.load(MainActivity.this, R.raw.winston_p_butter,1);
        soundSoldier = soundPool.load(MainActivity.this, R.raw.soldier_all_soldiers,1);
        soundRein = soundPool.load(MainActivity.this, R.raw.rein_ms,1);
        soundReaper = soundPool.load(MainActivity.this, R.raw.reaper_ms,1);
        soundAna = soundPool.load(MainActivity.this, R.raw.ana_ms,1);
        soundHanzo = soundPool.load(MainActivity.this, R.raw.hanzo_ms,1);
        soundDva = soundPool.load(MainActivity.this, R.raw.dva_ms,1);
        soundMercy = soundPool.load(MainActivity.this, R.raw.mercy_ms,1);
        soundOrisa = soundPool.load(MainActivity.this, R.raw.orisa_ms,1);
        soundPharah = soundPool.load(MainActivity.this, R.raw.pharah_ms,1);
        soundGenji = soundPool.load(MainActivity.this, R.raw.genji_ms, 1);
        soundTracer = soundPool.load(MainActivity.this, R.raw.tracer_ms,1);
        soundZarya = soundPool.load(MainActivity.this, R.raw.zarya_ms,1);
        soundZen = soundPool.load(MainActivity.this, R.raw.zen_ms,1);
        soundMcCree = soundPool.load(MainActivity.this, R.raw.mccree_ms,1);
        soundJunkrat = soundPool.load(MainActivity.this, R.raw.junk_ms,1);
        soundMei = soundPool.load(MainActivity.this, R.raw.mei_ms,1);
        soundRoadhog = soundPool.load(MainActivity.this, R.raw.roadhog_ms,1);
        soundTorb = soundPool.load(MainActivity.this, R.raw.torb_ms,1);
        soundBastion = soundPool.load(MainActivity.this, R.raw.bastion_ms,1);
        soundSombra = soundPool.load(MainActivity.this, R.raw.sombra_ms,1);
        soundSym = soundPool.load(MainActivity.this, R.raw.sym_ms,1);
        soundWidow = soundPool.load(MainActivity.this, R.raw.widow_ms,1);
        soundMoira = soundPool.load(MainActivity.this, R.raw.moira_sound_1,1);
        soundBrigitte = soundPool.load(MainActivity.this, R.raw.brigitte_sound_1,1);
        soundWB = soundPool.load(MainActivity.this, R.raw.wb_sound1,1);

        soundLucio2 = soundPool.load(MainActivity.this, R.raw.lucio_ms3,1);
        soundWinston2 = soundPool.load(MainActivity.this, R.raw.winston_ms2,1);
        soundSoldier2 = soundPool.load(MainActivity.this, R.raw.soldier_ms2,1);
        soundRein2 = soundPool.load(MainActivity.this, R.raw.rein_ms2,1);
        soundReaper2 = soundPool.load(MainActivity.this, R.raw.reaper_ms2,1);
        soundAna2 = soundPool.load(MainActivity.this, R.raw.ana_sound_2,1);
        soundHanzo2 = soundPool.load(MainActivity.this, R.raw.hanzo_ms2,1);
        soundDva2 = soundPool.load(MainActivity.this, R.raw.dva_ms2,1);
        soundMercy2 = soundPool.load(MainActivity.this, R.raw.mercy_ms2,1);
        soundOrisa2 = soundPool.load(MainActivity.this, R.raw.orisa_ms2,1);
        soundPharah2 = soundPool.load(MainActivity.this, R.raw.pharah_ms2,1);
        soundGenji2 = soundPool.load(MainActivity.this, R.raw.genji_ms2, 1);
        soundTracer2 = soundPool.load(MainActivity.this, R.raw.tracer_ms2,1);
        soundZarya2 = soundPool.load(MainActivity.this, R.raw.zarya_ms2,1);
        soundZen2 = soundPool.load(MainActivity.this, R.raw.zen_ms2,1);
        soundMcCree2 = soundPool.load(MainActivity.this, R.raw.mccree_ms2,1);
        soundJunkrat2 = soundPool.load(MainActivity.this, R.raw.junkrat_ms3,1);
        soundMei2 = soundPool.load(MainActivity.this, R.raw.mei_ms2,1);
        soundRoadhog2 = soundPool.load(MainActivity.this, R.raw.roadhog_ms2,1);
        soundTorb2 = soundPool.load(MainActivity.this, R.raw.torb_ms2,1);
        soundBastion2 = soundPool.load(MainActivity.this, R.raw.bastion_ms3,1);
        soundSombra2 = soundPool.load(MainActivity.this, R.raw.sombra_ms2,1);
        soundSym2 = soundPool.load(MainActivity.this, R.raw.sym_ms2,1);
        soundWidow2 = soundPool.load(MainActivity.this, R.raw.widow_ms2,1);
        soundMoira2 = soundPool.load(MainActivity.this, R.raw.moira_sound_2,1);
        soundBrigitte2 = soundPool.load(MainActivity.this, R.raw.brigitte_sound_2,1);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu_white_18dp);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "fonts/big_noodle_titling_oblique.ttf", true);

        Menu m = navigationView.getMenu();
        for (int i=0;i<m.size();i++)
        {
            MenuItem mi = m.getItem(i);

                //for applying a font to subMenu ...
            SubMenu subMenu = mi.getSubMenu();
            if (subMenu!=null && subMenu.size() >0 )
            {
                for (int j=0; j <subMenu.size();j++)
                {
                    MenuItem subMenuItem = subMenu.getItem(j);
                    applyFontToMenuItem(subMenuItem);
                }
            }
                //the method we have create in activity
            applyFontToMenuItem(mi);
        }

        displaySelectedScreen(nav_home);
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        Fragment fragment;
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        ft.setCustomAnimations(R.anim.enter_from_left,
                R.anim.exit_to_top);

        // ~ Is Drawer Open?
        if (drawer.isDrawerOpen(GravityCompat.START))
            drawer.closeDrawer(GravityCompat.START);

        else if(navigationView.getMenu().findItem(R.id.nav_home).isChecked())
            super.onBackPressed();

        else if (!(navigationView.getMenu().findItem(R.id.nav_home).isChecked())
                && (getVisibleFragment().getTag().equals("0")))
        {
            fragment = new HomeFrag();
            ft.replace(R.id.content_main, fragment, "home_frag");
            navigationView.setCheckedItem(nav_home);
            ft.commit();
        }

        else
            super.onBackPressed();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
            // Inflate the menu.
            // This adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private void applyFontToMenuItem(MenuItem mi)
    {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/big_noodle_titling_oblique.ttf");
        SpannableString mNewTitle = new SpannableString(mi.getTitle());
        mNewTitle.setSpan(new CustomTypefaceSpan("" , font), 0 , mNewTitle.length(),  Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mi.setTitle(mNewTitle);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        if (navigationView.getMenu().findItem(R.id.nav_home).isChecked() || navigationView.getMenu().findItem(R.id.nav_about).isChecked())
            getSupportFragmentManager().popBackStack();
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        displaySelectedScreen(id);
        return true;
    }

    public void displaySelectedScreen(int id)
    {
        Fragment fragment;
        FragmentTransaction ft;
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        ft = getSupportFragmentManager().beginTransaction();

        if(navigationView.getMenu().findItem(R.id.nav_home).isChecked())
            ft.setCustomAnimations(R.anim.enter_from_top,
                    R.anim.exit_to_left);

        else
            ft.setCustomAnimations(R.anim.enter_from_top,
                    R.anim.exit_to_bottom);

        switch (id)
        {
            case R.id.nav_home:
                getSupportFragmentManager().popBackStackImmediate();
                fragment = new HomeFrag();
                ft.setCustomAnimations(R.anim.enter_from_left,
                        R.anim.exit_to_bottom);
                ft.replace(R.id.content_main, fragment, "1");
                navigationView.setCheckedItem(nav_home);
                ft.commit();
                break;

            case R.id.nav_about:
                fragment = new AboutFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_about);
                ft.commit();
                break;

            case R.id.nav_lucio:
                soundPool.play(soundLucio, 1, 1, 0, 0, 1);
                fragment = new LucioFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_lucio);
                ft.commit();
                break;


            case R.id.nav_doomfist:
                soundPool.play(soundDoomfist, 1, 1, 0, 0, 1);
                fragment = new DoomfistFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_doomfist);
                ft.commit();
                break;

            case R.id.nav_moira:
                soundPool.play(soundMoira, 1, 1, 0, 0, 1);
                fragment = new MoiraFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_moira);
                ft.commit();
                break;

            case R.id.nav_brigitte:
                soundPool.play(soundBrigitte, 1, 1, 0, 0, 1);
                fragment = new BrigitteFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_brigitte);
                ft.commit();
                break;

            case R.id.nav_winston:
                soundPool.play(soundWinston, 1, 1, 0, 0, 1);
                fragment = new WinstonFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_winston);
                ft.commit();
                break;

            case R.id.nav_soldier:
                soundPool.play(soundSoldier, 1, 1, 0, 0, 1);
                fragment = new SoldierFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_soldier);
                ft.commit();
                break;

            case R.id.nav_reinhart:
                soundPool.play(soundRein, 1, 1, 0, 0, 1);
                fragment = new ReinFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_reinhart);
                ft.commit();
                break;

            case R.id.nav_reaper:
                soundPool.play(soundReaper, 1, 1, 0, 0, 1);
                fragment = new ReaperFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_reaper);
                ft.commit();
                break;

            case R.id.nav_ana:
                soundPool.play(soundAna, 1, 1, 0, 0, 1);
                fragment = new AnaFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_ana);
                ft.commit();
                break;

            case R.id.nav_hanzo:
                soundPool.play(soundHanzo, 1, 1, 0, 0, 1);
                fragment = new HanzoFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_hanzo);
                ft.commit();
                break;

            case R.id.nav_dva:
                soundPool.play(soundDva, 1, 1, 0, 0, 1);
                fragment = new DvaFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_dva);
                ft.commit();
                break;

            case R.id.nav_mercy:
                soundPool.play(soundMercy, 1, 1, 0, 0, 1);
                fragment = new MercyFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_mercy);
                ft.commit();
                break;

            case R.id.nav_orisa:
                soundPool.play(soundOrisa, 1, 1, 0, 0, 1);
                fragment = new OrisaFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_orisa);
                ft.commit();
                break;

            case R.id.nav_pharah:
                soundPool.play(soundPharah, 1, 1, 0, 0, 1);
                fragment = new PharahFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_pharah);
                ft.commit();
                break;

            case R.id.nav_genji:
                soundPool.play(soundGenji, 1, 1, 0, 0, 1);
                fragment = new GenjiFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_genji);
                ft.commit();
                break;

            case R.id.nav_tracer:
                soundPool.play(soundTracer, 1, 1, 0, 0, 1);
                fragment = new TracerFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_tracer);
                ft.commit();
                break;

            case R.id.nav_zarya:
                soundPool.play(soundZarya, 1, 1, 0, 0, 1);
                fragment = new ZaryaFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_zarya);
                ft.commit();
                break;

            case nav_zen:
                soundPool.play(soundZen, 1, 1, 0, 0, 1);
                fragment = new ZenFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_zen);
                ft.commit();
                break;

            case R.id.nav_mcCree:
                soundPool.play(soundMcCree, 1, 1, 0, 0, 1);
                fragment = new McCreeFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_mcCree);
                ft.commit();
                break;

            case R.id.nav_junkrat:
                soundPool.play(soundJunkrat, 1, 1, 0, 0, 1);
                fragment = new JunkratFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_junkrat);
                ft.commit();
                break;

            case R.id.nav_mei:
                soundPool.play(soundMei, 1, 1, 0, 0, 1);
                fragment = new MeiFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_mei);
                ft.commit();
                break;

            case R.id.nav_roadhog:
                soundPool.play(soundRoadhog, 1, 1, 0, 0, 1);
                fragment = new RoadhogFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_roadhog);
                ft.commit();
                break;

            case R.id.nav_torb:
                soundPool.play(soundTorb, 1, 1, 0, 0, 1);
                fragment = new TorbFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_torb);
                ft.commit();
                break;

            case R.id.nav_bastion:
                soundPool.play(soundBastion, 1, 1, 0, 0, 1);
                fragment = new BastionFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_bastion);
                ft.commit();
                break;

            case R.id.nav_sombra:
                soundPool.play(soundSombra, 1, 1, 0, 0, 1);
                fragment = new SombraFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_sombra);
                ft.commit();
                break;

            case R.id.nav_symmetra:
                soundPool.play(soundSym, 1, 1, 0, 0, 1);
                fragment = new SymFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_symmetra);
                ft.commit();
                break;

            case R.id.nav_widow:
                soundPool.play(soundWidow, 1, 1, 0, 0, 1);
                fragment = new WidowFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_widow);
                ft.commit();
                break;

            case R.id.nav_wb:
                soundPool.play(soundWB, 1, 1, 0, 0, 1);
                fragment = new WBFrag();
                ft.replace(R.id.content_main, fragment, "0");
                navigationView.setCheckedItem(nav_wb);
                ft.commit();
                break;

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
}