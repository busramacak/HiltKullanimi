package com.bmprj.hiltkullanimi

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton


interface Myinterface {
    fun myPrint():String
}

//@InstallIn(ActivityComponent::class)
//@Module
//abstract class MyModule{
//    @ActivityScoped
//    @Binds
//    abstract fun bindingFunction(myImplementor: InterfaceImplementor): Myinterface
//}


@InstallIn(SingletonComponent::class)
@Module
class MyModule{
    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction():Myinterface{
        return InterfaceImplementor()
    }
    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction() : Myinterface{
        return SecontInterfaceImplementor()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor