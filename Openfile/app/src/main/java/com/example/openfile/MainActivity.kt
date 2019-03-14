package com.example.openfile

import android.annotation.SuppressLint
import android.annotation.TargetApi
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.webkit.PermissionRequest
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileInputStream
import java.io.InputStream
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
  private  val  file_id=123
private  lateinit var context: Context
// private var permissions= arrayOf(android.Manifest.permission.CAMERA,android.Manifest.permission.READ_EXTERNAL_STORAGE)
//private  val PermissionRequest=10
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // context=this


        btn_read.setOnClickListener({
            var intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "*/*"
            startActivityForResult(intent,file_id)


        })

//
//camera.setOnClickListener({
//    var intent=Intent("android.media.action.IMAGE_CAPTURE")
//startActivity(intent)
//
//})
//        btn_request.setOnClickListener {
//            if (checkPermission(context,permissions)){
//                Toast.makeText(context,"Success",Toast.LENGTH_SHORT).show()
//            }else
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                    requestPermissions(permissions,PermissionRequest)
//
//
//                }
//
//        }
//
//

        @TargetApi(Build.VERSION_CODES.KITKAT)
        @RequiresApi(Build.VERSION_CODES.KITKAT)
        @SuppressLint("NewApi")
        fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
            super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==file_id&&resultCode==Activity.RESULT_OK){
            var dest= if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                File(PathUtils.getPath(context,data!!.data))
            } else {
                TODO("VERSION.SDK_INT < KITKAT")
            }
            var readdata=FileInputStream(dest).bufferedReader().use { it.readText() }
      tv_read_data.text=readdata
        }

                }
//        fun checkPermission(context: Context,permissionarray:Array<String>):Boolean{
//            return  false
//        }
//
    }
}