package com.bmprj.hiltkullanimi

import javax.inject.Inject
class Example
@Inject constructor(@FirstImplementor private val interfaceImplementor: Myinterface,
                    @SecondImplementor private val secondInterfaceImplementor: Myinterface){

    fun myFunction() : String{
        return "Working: ${interfaceImplementor.myPrint()}"
    }

    fun secondFunction():String{
        return "Working: ${secondInterfaceImplementor.myPrint()}"
    }
}