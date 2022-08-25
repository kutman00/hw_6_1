package com.geektech.hw_6_1

import android.graphics.pdf.PdfRenderer
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.geektech.hw_6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val viewPager: ViewPager2 = binding.viewPager

        val fragments: ArrayList<Fragment> = arrayListOf(
            MainFragment(),
            SecondFragment(),
            ThirdFragment()

        )

        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter

    }

}

