package com.hujiang.testappfordemo;

/**
 * Function:
 * Create date on 15/7/14.
 *
 * @author Conquer
 * @version 1.0
 */
public abstract class TestTask<Params,Progress,Result> {

    public TestTask(){

    }

    protected void onPreExcute(){

    }

    public TestTask<Params, Progress, Result> excute(Params... params){

        return null;
    }

    protected abstract Result doInBackground(Params... params);

    protected void onProgressUpdate(Progress progress){

    }

    protected void onPostExcute(Result result){

    }

    protected void onCanceled(){

    }

    protected void onCanceled(Result result){

    }
}
