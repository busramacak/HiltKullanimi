package com.bmprj.hiltkullanimi

import javax.inject.Inject

class SecontInterfaceImplementor
@Inject constructor() : Myinterface
{
    override fun myPrint(): String {
        return "My second interface ımplementor"
    }

}