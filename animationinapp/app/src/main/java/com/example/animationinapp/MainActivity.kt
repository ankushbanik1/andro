package com.example.animationinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
fadein.setOnClickListener(
    {
        var animations=AnimationUtils.loadAnimation(this,R.anim.abc_fade_in)
textview.startAnimation(animations)
    }
)

            fadeout.setOnClickListener(
            {
                var animations=AnimationUtils.loadAnimation(this,R.anim.abc_fade_out)
                textview.startAnimation(animations)
            })

        bounce.setOnClickListener(
            {
                var animations=AnimationUtils.loadAnimation(this,R.anim.abc_popup_enter)
                textview.startAnimation(animations)
            })

        roated.setOnClickListener(
            {
                var animations=AnimationUtils.loadAnimation(this,R.anim.abc_grow_fade_in_from_bottom)
                textview.startAnimation(animations)
            })
        slidein.setOnClickListener(
            {
                var animations=AnimationUtils.loadAnimation(this,R.anim.abc_slide_out_bottom)
                textview.startAnimation(animations)
            })
        Slideout.setOnClickListener(
            {
                var animations=AnimationUtils.loadAnimation(this,R.anim.abc_shrink_fade_out_from_bottom)
                textview.startAnimation(animations)
            })
        zoomin.setOnClickListener(
            {
                var animations=AnimationUtils.loadAnimation(this,R.anim.abc_tooltip_exit)
                textview.startAnimation(animations)
            })

    }

}
