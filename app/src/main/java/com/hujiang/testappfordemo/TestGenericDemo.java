package com.hujiang.testappfordemo;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

/**
 * Function:
 * Create date on 15/7/9.
 *
 * @author Conquer
 * @version 1.0
 */
public class TestGenericDemo extends Activity{

    private String aString;
    private String bString;

    TestGeneric<String,Integer> mStringTestGeneric = new TestGeneric<>();
    ArrayList<String> mStrings = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStringTestGeneric.setFirstGeneric("a");
        mStringTestGeneric.setFirstGeneric("b");
    }

    public static <T> T getMiddle(T[] a){
        return a[a.length/2];
    }
}
