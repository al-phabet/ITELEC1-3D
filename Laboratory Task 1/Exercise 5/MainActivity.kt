package com.example.mainactivity

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var imageSwitcher: ImageSwitcher
    private lateinit var btnSwitch: Button
    private val images = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3)
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageSwitcher = findViewById(R.id.imageSwitcher)
        btnSwitch = findViewById(R.id.btnSwitch)

        // Step 1: Tell the ImageSwitcher how to create its child ImageViews
        imageSwitcher.setFactory {
            ImageView(this).apply {
                scaleType = ImageView.ScaleType.CENTER_CROP
                background = ContextCompat.getDrawable(context, R.drawable.rounded_corners)
                clipToOutline = true
            }
        }

        // Step 2: Optional - Add fade animation for smooth transition
        imageSwitcher.inAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_in)
        imageSwitcher.outAnimation = AnimationUtils.loadAnimation(this, android.R.anim.fade_out)

        // Step 3: Show the first image initially
        imageSwitcher.setImageResource(images[currentIndex])

        // Step 4: Button toggles between the two images
        btnSwitch.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size
            imageSwitcher.setImageResource(images[currentIndex])
        }
    }
}
