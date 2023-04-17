package fi.tamk.soundapp;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.io.IOException;

public class TriggerSoundSetupFragment extends Fragment {
    private EditText sID;
    private EditText sName;

    public void displayName(String name){
        sName.setText(name);
    }

    public void displayID(int id){
        sID.setText(Integer.toString(id));
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.triggerfagment,container,false);
        sID = (EditText) view.findViewById(R.id.soundID);
        sName = (EditText) view.findViewById(R.id.soundName);
        return view;
    }
}
