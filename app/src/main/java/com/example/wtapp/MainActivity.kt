package com.example.wtapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.example.wtapp.adapter.MainPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         tabLayout= findViewById(R.id.tab)

        viewPager= findViewById(R.id.viewPager)
        viewPager.adapter = MainPageAdapter (supportFragmentManager, lifecycle)

        TabLayoutMediator (tabLayout, viewPager){ tab, position ->
            when (position){
                0 ->  tab.icon= getDrawable(R.drawable.ic_baseline_photo_camera_24)
                1 -> tab.text="chat"
                2 -> tab.text="status"
                3 -> tab.text="calls"

            }

        }.attach()
        viewPager.currentItem=1
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.app_bar_search -> {
                Toast.makeText(this, "search click", Toast.LENGTH_LONG).show()
            return true
            }
            R.id.new_broadcast -> {
                Toast.makeText(this, "Broadcast click", Toast.LENGTH_LONG).show()
            return true
            }
            R.id.new_group -> {
                goToNewGroupActivity()

            return true
            }
            R.id.shared_messages -> {
                Toast.makeText(this, "shared click", Toast.LENGTH_LONG).show()
            return true
            }
            R.id.settings -> {
                Toast.makeText(this, "settings click", Toast.LENGTH_LONG).show()
            return true
            }
            else ->{
                return false
            }

        }
    }
    private fun goToNewGroupActivity(){
        val i =Intent(this,NewGroupActivity::class.java)
        startActivity(i)

    }
    }


