package com.example.criminalintent

import android.icu.text.CaseMap
import java.util.*

class Crime(var id: UUID=UUID.randomUUID()){
    var title:String =""
    var date: Date? = null
    var isSolved: Boolean= false
    constructor(id: UUID, title: String,date: Date,isSolved: Boolean):this(id){
        this.title=title
        this.date=date
        this.id=id
        this.isSolved=isSolved
    }

}

