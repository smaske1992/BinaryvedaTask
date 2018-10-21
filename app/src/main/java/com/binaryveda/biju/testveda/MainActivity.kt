package com.binaryveda.biju.testveda

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.binaryveda.biju.testveda.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding,MainViewModel>() {

    override fun getViewModel(): MainViewModel = MainViewModel()

    override fun getContentLayout(): Int = R.layout.activity_main

    override fun getBindingVariable(): Int = BR.viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initBinding()
    }
}
