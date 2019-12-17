package com.netcompany.tormah.howtomakelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_constraint.*

class ConstraintActivity : AppCompatActivity() {

    var swapped = false

    val drawableCamera = android.R.drawable.ic_menu_camera
    val drawableRotate = android.R.drawable.ic_menu_rotate


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

        button_constraint_swapImages.setOnClickListener{
            swapped = !swapped
            swapDrawables()
        }

        imageView_constraint_imageLeft.setImageDrawable(getDrawable(drawableRotate))
        imageView_constraint_imageRight.setImageDrawable(getDrawable(drawableCamera))
    }

    fun swapDrawables(): Unit {
        if (swapped){
            imageView_constraint_imageLeft.setImageDrawable(getDrawable(drawableCamera))
            imageView_constraint_imageRight.setImageDrawable(getDrawable(drawableRotate))
        } else{
            imageView_constraint_imageLeft.setImageDrawable(getDrawable(drawableRotate))
            imageView_constraint_imageRight.setImageDrawable(getDrawable(drawableCamera))
        }
    }
}