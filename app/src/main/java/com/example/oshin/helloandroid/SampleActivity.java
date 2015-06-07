package com.example.oshin.helloandroid;

import android.app.Activity;
import android.content.res.TypedArray;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

//import com.example.oshin.helloandroid.adapter.NavDrawerListAdapter;
import com.example.oshin.helloandroid.domain.NavDrawerItem;
import com.example.oshin.helloandroid.view.viewgroup.FlyOutContainer;

import java.util.ArrayList;

public class SampleActivity extends Activity {

    FlyOutContainer root;

    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;


    // nav drawer title
    private CharSequence mDrawerTitle;

    // used to store app title
    private CharSequence mTitle;


    private String[] navMenuTitles;
    private TypedArray navMenuIcons;
    private ArrayList<NavDrawerItem> navDrawerItems;
    //private NavDrawerListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        Log.d("sample act", "here sample activity");

        super.onCreate(savedInstanceState);

       this.root = (FlyOutContainer) this.getLayoutInflater().inflate(R.layout.activity_sample, null);

        this.setContentView(root);

        DbHelper helper = new DbHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
       // this.setContentView(R.layout.activity_sample);

        mTitle = mDrawerTitle = getTitle();

        // load slide menu items
        //navMenuTitles = getResources().getStringArray(R.array.nav_drawer_items);


        navMenuIcons = getResources()
                .obtainTypedArray(R.array.nav_drawer_icons);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.list_slidermenu);

        navDrawerItems = new ArrayList<NavDrawerItem>();

        // adding nav drawer items to array
        // Home
        //navDrawerItems.add(new NavDrawerItem(navMenuTitles[0], navMenuIcons.getResourceId(0, -1)));
        // Find People
        //navDrawerItems.add(new NavDrawerItem(navMenuTitles[1], navMenuIcons.getResourceId(1, -1)));
        // Photos
        //navDrawerItems.add(new NavDrawerItem(navMenuTitles[2], navMenuIcons.getResourceId(2, -1)));
        // Communities, Will add a counter here
        //navDrawerItems.add(new NavDrawerItem(navMenuTitles[3], navMenuIcons.getResourceId(3, -1), true, "22"));
        // Pages
        //navDrawerItems.add(new NavDrawerItem(navMenuTitles[4], navMenuIcons.getResourceId(4, -1)));
        // What's hot, We  will add a counter here
        //navDrawerItems.add(new NavDrawerItem(navMenuTitles[5], navMenuIcons.getResourceId(5, -1), true, "50+"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sample, menu);
        return true;
    }

    public void toggleMenu(View v){
        this.root.toggleMenu();
    }

}