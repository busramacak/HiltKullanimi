package com.bmprj.hiltkullanimi

import javax.inject.Inject

class InterfaceImplementor
    @Inject constructor(): Myinterface {
    override fun myPrint(): String {
        return "stttttttttttttttttring"
    }

}