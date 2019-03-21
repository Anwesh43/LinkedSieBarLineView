package com.anwesh.uiprojects.linkedsidebarlineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.sidebarlineview.SideBarLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        SideBarLineView.create(this)
    }
}
