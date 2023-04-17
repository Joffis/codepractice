package fi.tamk.soundapp;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ChooseSoundFragment extends Fragment {
    private ChosenSound callback;

    @Override
    public void onCreate(Bundle b){
        super.onCreate(b);
        callback = (ChosenSound) getActivity();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.choosefragment,container,false);
        final ListView listView = (ListView) view.findViewById(R.id.list);



        SoundItem[] values = new SoundItem[] {
                new SoundItem("AM Radio",R.raw.radio),
                new SoundItem("Changing Batteries",R.raw.battery)
        };

        ArrayAdapter<SoundItem> adapter = new ArrayAdapter<SoundItem>(getActivity(),
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d("ChooseSoundFragment","Sound clicked!");
                callback.itemSelected((SoundItem) listView.getItemAtPosition(position));
            }
        });
        return view;
    }
}
