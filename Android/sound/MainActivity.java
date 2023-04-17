package fi.tamk.soundapp;


import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements ChosenSound {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void itemSelected(SoundItem selectedSound) {
        Log.d("MainActivity","List item: "+selectedSound);
        Fragment frag = getFragmentManager().findFragmentById(R.id.triggerFragment);
        if(frag != null && frag instanceof TriggerSoundSetupFragment && frag.isInLayout()){
            Log.d("MainActivity", "Second fragment visible! (landscape)");
            ((TriggerSoundSetupFragment) frag).displayName(selectedSound.getName());
            ((TriggerSoundSetupFragment) frag).displayID(selectedSound.getSoundID());
        } else {
            Log.d("MainActivity", "Second fragment not visible! (portrait)");
            Intent i = new Intent(this, SecondActivity.class);
            i.putExtra("name", selectedSound.getName());
            i.putExtra("soundID", selectedSound.getSoundID());
            startActivity(i);
        }
    }
}
