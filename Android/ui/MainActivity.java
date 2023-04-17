package fi.tamk.uiexercise;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentTransaction;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case (R.id.resetCalc):
                Toast.makeText(this,"Calculator Reset", Toast.LENGTH_LONG).show();
                displayNotification("Calculator Reset");
                showMyDialog("Reset calculator?");
                Log.d("MainActivity","Calculator Reset");
                return true;
        }
        return false;
    }

    public void displayNotification(String text) {
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setContentTitle("UIExercise");
        mBuilder.setSmallIcon(R.mipmap.ic_launcher);
        mBuilder.setContentText(text);

        Notification notification = mBuilder.build();

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        int mID = 1;
        mNotificationManager.notify(mID, notification);
    }

    private void showMyDialog(String text) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        MyDialogFragment dialog = MyDialogFragment.newInstance(text);
        dialog.show(ft, "dialog");
    }

    public static class MyDialogFragment extends DialogFragment {

        public static MyDialogFragment newInstance(String text){
            MyDialogFragment frag = new MyDialogFragment();
            Bundle args = new Bundle();
            args.putString("text", text);
            frag.setArguments(args);
            return frag;
        }

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState){

            String text = getArguments().getString("text");

            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage(text).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            return builder.create();
        }
    }
}
