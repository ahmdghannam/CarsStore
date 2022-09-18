package fts.ahmed.carsstore.views.activities;

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter
import fts.ahmed.carsstore.views.fragments.addEmployees.AddEmployeeFragment
import fts.ahmed.carsstore.views.fragments.addPurches.AddPurchesFragment
import fts.ahmed.carsstore.views.fragments.addVehicle.AddVehicleFragment
import fts.ahmed.carsstore.views.fragments.home.HomeFragment

class ViewPagerAdapter (fragmentActivity:FragmentActivity): FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> HomeFragment()
            1-> AddPurchesFragment()
            2-> AddVehicleFragment()
            3-> AddEmployeeFragment()
            else -> throw NullPointerException("no fragment founded -batata")
        }

    }

}