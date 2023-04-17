package fi.tamk.callme;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected final String TAG = this.getClass().getName();
    private String phoneNumber = "1234567890";
    private static final int REQUEST_CODE = 7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Debug.print(TAG, "onCreate", "", 1);
    }

    public void soitaNumeroon(View v){
        Debug.print(TAG, "soitaNumeroon", "", 1);
        Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
        startActivity(i);
    }

    public void openSettings(View v){
        Debug.print(TAG, "openSettings", "", 1);
        Intent i = new Intent(this, Settings.class);
        i.putExtra("prefix", "+358");
        startActivityForResult(i, REQUEST_CODE);
    }

    public void openBrowser(View v){
        Debug.print(TAG, "openBrowser", "", 1);
        Uri uri = Uri.parse("http://www.google.com");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                Bundle bundle = data.getExtras();
                phoneNumber = bundle.getString("pNumber");
                Debug.print(TAG, "onActivityResult", "updated phone number", 1);
            }
        }
    }
}
