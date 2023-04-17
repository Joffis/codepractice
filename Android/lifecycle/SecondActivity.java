package fi.tamk.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    protected final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Debug.print(TAG,"onCreate"," ohjelma luotu",1);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Debug.print(TAG, "onStart", "ohjelma startattu", 1);
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Debug.print(TAG, "onRestart", "ohjelma restartattu", 1);
    }

    @Override
    protected void onResume(){
        super.onResume();
        Debug.print(TAG, "onResume", "ohjelmaan palattu", 1);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Debug.print(TAG, "onPause", "ohjelma pausella", 1);
    }

    @Override
    protected void onStop(){
        super.onStop();
        Debug.print(TAG, "onStop", "ohjelma pysäytetty", 1);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Debug.print(TAG, "onDestroy", "ohjelma tuhottu", 1);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Debug.print(TAG, "onRestoreInstanceState", "", 1);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Debug.print(TAG, "onSaveInstanceState", "", 1);
        super.onSaveInstanceState(outState);
    }
}
