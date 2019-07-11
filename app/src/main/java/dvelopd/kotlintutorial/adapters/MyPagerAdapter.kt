package dvelopd.kotlintutorial.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import dvelopd.kotlintutorial.fragments.FirstFragment
import dvelopd.kotlintutorial.fragments.SecondFragment
import dvelopd.kotlintutorial.fragments.ThirdFragment

class MyPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> { FirstFragment() }
            1 -> SecondFragment()
            else -> { return ThirdFragment() }
        }
    }


    override fun getCount(): Int {
        return 3
    }


    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "First Tab"
            1 -> "Second Tab"
            else -> { return "Third Tab"
            }
        }
    }
}
