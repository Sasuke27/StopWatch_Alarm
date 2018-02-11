package com.example.khent.stopwatch

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

/**
 * Created by khent on 2/11/2018.
 */
class FragmentAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {


    var mFragmentItems:ArrayList<Fragment> = ArrayList()
    var mFragmentTitles:ArrayList<String> = ArrayList()

    fun addFragments(fragmentItem:Fragment, fragmentTitle:String){
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }


    override fun getItem(position: Int): Fragment {
        return mFragmentItems[position]
    }

    override fun getCount(): Int {
        return mFragmentItems.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitles[position]
    }
}