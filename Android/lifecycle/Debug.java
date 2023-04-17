package fi.tamk.myapplication;

import android.util.Log;

public class Debug {
    private final static int DEBUG_LEVEL = 1;

    public static void print(String className, String methodName, String message, int level) {
        String logMsg = methodName + ", " + message;
        if (BuildConfig.DEBUG && level <= DEBUG_LEVEL) {
            Log.d(className, logMsg);
        }
    }
}
