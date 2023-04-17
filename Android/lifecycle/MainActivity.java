package fi.tamk.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    protected final String TAG = this.getClass().getName();

    public void painikettaPainettu(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Debug.print(TAG,"onCreate","ohjelma luotu",1);

        Calendar c = Calendar.getInstance();
        String time = c.getTime().toString();

        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(time);
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
        if(savedInstanceState != null){
            String text = savedInstanceState.getString("time");

            if(text != null){
                TextView tv = (TextView) findViewById(R.id.textView);
                tv.setText(text);
            }
        }
        Debug.print(TAG, "onRestoreInstanceState", "", 1);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Debug.print(TAG, "onSaveInstanceState", "", 1);
        TextView tv = (TextView) findViewById(R.id.textView);
        String text = tv.getText().toString();
        outState.putString("time", text);
        super.onSaveInstanceState(outState);
    }
}
