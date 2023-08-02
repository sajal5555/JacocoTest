package com.example.jacocotest

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.Transformation
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.ui.AppBarConfiguration
import com.example.jacocotest.databinding.ActivityCollapsableTestBinding

class CollapsableTestActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCollapsableTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityCollapsableTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.collapsableView.visibility = View.GONE
        binding.collapsableView.getExpandAnimation()

    }

    fun View.getExpandAnimation(): Animation {
        measure(
            View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.EXACTLY),
            View.MeasureSpec.makeMeasureSpec(width, View.MeasureSpec.AT_MOST)
        )
        val targetHeight = measuredHeight

        layoutParams.height = 1
        visibility = View.VISIBLE
        val animation: Animation = object : Animation() {
            override fun applyTransformation(
                interpolatedTime: Float,
                transformation: Transformation?
            ) {
                layoutParams.height =
                    if (interpolatedTime == 1f) ViewGroup.LayoutParams.WRAP_CONTENT else (targetHeight * interpolatedTime).toInt()
                requestLayout()
            }

            override fun willChangeBounds(): Boolean {
                return true
            }

            override fun cancel() {
                super.cancel()
                layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT
            }
        }

        animation.duration = 200
        return animation
    }

}