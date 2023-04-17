package fi.tamk.soundapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    private int id;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    @Override
    protected void onResume() {
        super.onResume();  // Always call the superclass method first
        Bundle bundle = getIntent().getExtras();
        Fragment frag = getFragmentManager().findFragmentById(R.id.triggerFragment);

        if(bundle.getString("name") != null){
            name = bundle.getString("name");
            ((TriggerSoundSetupFragment) frag).displayName(name);
        }
        if(bundle.getInt("soundID") != 0){
            id = bundle.getInt("soundID");
            ((TriggerSoundSetupFragment) frag).displayID(id);
        }
    }
}
