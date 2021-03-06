package com.jasjotsingh.tindermotionlayout.scenes

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.jasjotsingh.tindermotionlayout.R
import kotlinx.android.synthetic.main.activity_tinder_scene10.*
import kotlinx.android.synthetic.main.activity_tinder_scene9.*
import kotlinx.android.synthetic.main.activity_tinder_scene9.containerCardOne
import kotlinx.android.synthetic.main.activity_tinder_scene9.containerCardTwo
import kotlinx.android.synthetic.main.activity_tinder_scene9.description
import kotlinx.android.synthetic.main.activity_tinder_scene9.motionLayout
import kotlinx.android.synthetic.main.activity_tinder_scene9.name

class TinderScene10Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tinder_scene10)

        val viewModel = ViewModelProviders
                .of(this)
                .get(TinderContactViewModel::class.java)

        viewModel
                .modelStream
                .observe(this, Observer {
                    bindCard(it)
                })

        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                when (currentId) {
                    R.id.offScreenUnlike,
                    R.id.offScreenLike -> {
                        motionLayout.progress = 0f
                        motionLayout.setTransition(R.id.start, R.id.detail)
                        viewModel.swipe()
                    }
                }
            }
        })

        likeFloating.setOnClickListener {
            motionLayout.transitionToState(R.id.like)
        }

        unlikeFloating.setOnClickListener {
            motionLayout.transitionToState(R.id.unlike)
        }
    }

    private fun bindCard(model: TinderContactModel) {
        containerCardOne.setBackgroundColor(model.cardTop.backgroundColor)
        name.text = "${model.cardTop.name}, ${model.cardTop.age}"
        description.text = model.cardTop.description
        containerCardTwo.setBackgroundColor(model.cardBottom.backgroundColor)
    }

}