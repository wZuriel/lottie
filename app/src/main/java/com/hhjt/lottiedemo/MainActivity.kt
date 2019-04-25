package com.hhjt.lottiedemo

import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.facebook.fresco.helper.Phoenix
import com.facebook.fresco.helper.controller.SingleImageControllerListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("222")

//        lottie.imageAssetsFolder = "images/"
//        lottie.setAnimationFromJson("qd1.json")
//        lottie.loop(false)
//        lottie.playAnimation()

//        var intent = Intent()
//        intent.data = Uri.parse("xidebao://hhjt.happybaby")
//        startActivity(intent)

//        mIv.setImageURI("http://img.cdgxdb.com/Flzh2ekCp5plzVUNOXysRvxWraem")
//        mIv.setImageURI("http://img.cdgxdb.com/data/upload/2019/0331/201903311645306877.jpg")
        Phoenix.with(mIv)
//            .setControllerListener(SingleImageControllerListener(mIv))
            .load("http://img.cdgxdb.com/data/upload/2019/0331/201903311645306877.jpg")
    }
}
