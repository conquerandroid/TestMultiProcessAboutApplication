package com.hujiang.testappfordemo;

/**
 * Function:
 * Create date on 15/7/9.
 *
 * @author Conquer
 * @version 1.0
 */
public class TestGeneric<T,U>{

    private T mFirstGeneric;
    private U mSecondGeneric;

    public TestGeneric(){

    }

    public TestGeneric(T firstGeneric, U secondGeneric){
        mFirstGeneric = firstGeneric;
        mSecondGeneric = secondGeneric;
    }

    public void setFirstGeneric(T firstGeneric){
        mFirstGeneric = firstGeneric;
    }

    public T getFirstGeneric(){
        return mFirstGeneric;
    }
}
