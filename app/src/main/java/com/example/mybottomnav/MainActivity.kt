package com.example.mybottomnav

import android.os.Bundle
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        counter++ //a break point

        Log.i("Log tracing", "onCreate")

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    override fun onPause() {
        super.onPause()
        Log.i("Log tracing", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Log tracing", "onStop")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Log tracing", "onResume")
    }

    override fun onStart() {
        super.onStart()
        Log.i("Log tracing", "onStart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Log tracing", "onDestroy")
    }
}