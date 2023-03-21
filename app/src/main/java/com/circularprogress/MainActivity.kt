package com.circularprogress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.Toast
import com.tecorb.circularprogressbar.CircleProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progressBar = findViewById<View>(R.id.asd) as CircleProgressBar
        val seekbarBtn    = findViewById<View>(R.id.btnSeekbar) as SeekBar

        progressBar.progress = 50f
        progressBar.setProgressText(progressBar.progress.toString())
        progressBar.setProgressColor(resources.getColor(R.color.purple_200))
        progressBar.suffix = "%"

        seekbarBtn.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar?, p1: Int, p2: Boolean) {
                progressBar.progress = seek?.progress!!.toFloat()
                progressBar.setProgressText(progressBar.progress.toString())
                progressBar.setProgressColor(resources.getColor(R.color.purple_200))
                progressBar.suffix = "%"
            }

            override fun onStartTrackingTouch(seek: SeekBar?) {

            }

            override fun onStopTrackingTouch(seek: SeekBar?) {
                progressBar.progress = seek?.progress!!.toFloat()
                progressBar.setProgressText(progressBar.progress.toString())
                progressBar.setProgressColor(resources.getColor(R.color.purple_200))
                progressBar.suffix = "%"
            }

        })

       // progressBar.su
    }
}