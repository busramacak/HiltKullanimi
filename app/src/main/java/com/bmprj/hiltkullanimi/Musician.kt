package com.bmprj.hiltkullanimi

import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.FragmentScoped
import java.lang.reflect.Constructor
import javax.inject.Inject

//constructor injection
@ActivityRetainedScoped
class Musician
    @Inject
    constructor(instrument: Instrument,band: Band) {

    fun sing(){
        println("working..")
    }
}