package com.binaryveda.biju.testveda

import android.Manifest
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * Created by webwerks1 on 17/7/18.
 */
abstract class BaseActivity<T : ViewDataBinding, V : MainViewModel > : AppCompatActivity() {
    var mBinding: T? = null
    var mViewModel: V? = null

    abstract fun getViewModel():V
    abstract fun getContentLayout():Int
    abstract fun getBindingVariable():Int

    fun initBinding(){
        mBinding=DataBindingUtil.setContentView(this,getContentLayout())
        mViewModel=getViewModel()
        mBinding?.setVariable(getBindingVariable(),mViewModel)

    }

}
