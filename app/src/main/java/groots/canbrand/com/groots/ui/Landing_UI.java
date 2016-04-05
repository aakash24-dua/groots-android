package groots.canbrand.com.groots.ui;

import android.os.Bundle;

import android.support.v7.app.ActionBar;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


import groots.canbrand.com.groots.R;

import java.util.ArrayList;

import groots.canbrand.com.groots.Adapter.Landing_Adapter;
import groots.canbrand.com.groots.Model.LandingInfo;


public class Landing_UI extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing__ui);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbars);
        setSupportActionBar(toolbar);

        ArrayList<LandingInfo> dummyValue=new ArrayList<>();
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));
        dummyValue.add(new LandingInfo("Nasik Onion","Grade A Onion Sourced From Nasik.","45/kg","0",R.drawable.onion));
        dummyValue.add(new LandingInfo("Big Potato","Grade A Potato Sourced From India.","15/kg","0",R.drawable.potato));

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLayoutManager);
        Landing_Adapter mAdapter = new Landing_Adapter(dummyValue,this);
        mRecyclerView.setAdapter(mAdapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null)
        {
            actionBar.setTitle("#nofilter,SDA Market");

        }
    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.landing__ui, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
