package vn.nano.photocropper.photocropper;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by alex on 12/4/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
