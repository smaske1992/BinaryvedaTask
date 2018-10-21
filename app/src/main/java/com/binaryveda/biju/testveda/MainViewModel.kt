package com.binaryveda.biju.testveda

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableBoolean
import android.databinding.ObservableField

class MainViewModel:ViewModel() {

    var isSkillSelected=ObservableBoolean(true)
    var isWorkSelected=ObservableBoolean(false)
    var isIndustrySelected=ObservableBoolean(false)
    var selectedText=ObservableField<String>("Adobe Photoshop | Sketch | Adobe Illustrator | Indesign | Interaction | Prototyping")

    fun onClick(isSkill:Boolean,isWork:Boolean,isInduustry:Boolean,value:String){
        isSkillSelected.set(isSkill)
        isWorkSelected.set(isWork)
        isIndustrySelected.set(isInduustry)
        selectedText.set(value)
    }

}