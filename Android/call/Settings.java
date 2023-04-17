package fi.tamk.callme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Settings extends AppCompatActivity {
    protected final String TAG = this.getClass().getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        EditText ed = (EditText) findViewById(R.id.editText);
        Bundle bundle = getIntent().getExtras();
        ed.setText(bundle.getString("prefix"));
        Debug.print(TAG, "onCreate", "", 1);
    }

    public void onBackPressed(){
        Debug.print(TAG, "onBackPressed", "", 1);
        Intent intent = new Intent();

        EditText ed = (EditText) findViewById(R.id.editText);
        String number = ed.getText().toString();
        intent.putExtra("pNumber",number);
        setResult(RESULT_OK, intent);

        super.onBackPressed();
    }
}
