package ir.bkhezry.googleanalyticssample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

import ir.bkhezry.googleanalyticssample.Application.AnalyticsApplication;

public class MainActivity extends AppCompatActivity {
    private Tracker mTracker;
    String name="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Obtain the shared Tracker instance.
        AnalyticsApplication application = (AnalyticsApplication) getApplication();
        mTracker = application.getDefaultTracker();
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.i("bkhezry", "Setting screen name: " + name);
        mTracker.setScreenName("Image~" + name);
        mTracker.send(new HitBuilders.ScreenViewBuilder().build());

    }
}
