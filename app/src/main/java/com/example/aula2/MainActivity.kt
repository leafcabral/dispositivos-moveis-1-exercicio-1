package com.example.aula2

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

	private val TAG: String = "INFOTESTE"

	// Activity is created
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_main)

		Log.i(TAG, "onCreate was called.")

		/*
		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}
		 */
	}

	// Activity is visible (after onCreate)
	override fun onStart() {
		super.onStart()

		Log.i(TAG, "onStart was called.")
	}


	// Activity is ready to use (after onStart)
	override fun onResume() {
		super.onResume()

		Log.i(TAG, "onResume was called.")
	}


	// User is leaving the application
	override fun onPause() {
		super.onPause()

		Log.i(TAG, "onPause was called.")
	}


	// Activity is invisible (after onPause)
	override fun onStop() {
		super.onStop()

		Log.i(TAG, "onStop was called.")
	}


	// Activity is destroied
	override fun onDestroy() {
		super.onDestroy()

		Log.i(TAG, "onDestroy was called.")
	}
}
