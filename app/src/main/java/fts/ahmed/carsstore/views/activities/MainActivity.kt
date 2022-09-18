package fts.ahmed.carsstore.views.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import fts.ahmed.carsstore.R
import fts.ahmed.carsstore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViewPager()

    }

    private fun initViewPager() {
        binding.viewPager.adapter = ViewPagerAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> "Home"
                1 -> "Purchases"
                2 -> "Vehicles"
                3 -> "employees"
                else -> "error 404"
            }
            val icon = when (position) {
                0 -> R.drawable.ic_home
                1 -> R.drawable.ic_money
                2 -> R.drawable.ic_car
                3 -> R.drawable.ic_work
                else -> R.drawable.ic_error
            }

            tab.setIcon(icon)

        }.attach()
    }
}

