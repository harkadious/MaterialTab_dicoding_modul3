package com.fajar.materialtab;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import com.fajar.materialtab.adapter.TabFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private ViewPager pager;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Tab");

        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark), getResources().getColor(android.R.color.white));

        tabs.setupWithViewPager(pager);

        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}