package com.example.khent.stopwatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar.*


class MainActivity : AppCompatActivity() {

    var pagerAdapter:FragmentAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        pagerAdapter = FragmentAdapter(supportFragmentManager)

        pagerAdapter!!.addFragments(AlarmFragment(),"Alarm")
        pagerAdapter!!.addFragments(StopWatchFragment(),"StopWatch")


        costomViewpager.adapter = pagerAdapter
        costomTabLayout.setupWithViewPager(costomViewpager)



    }




}
