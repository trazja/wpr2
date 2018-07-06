package tryhut.wpr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashScreenActivity extends AppCompatActivity {

    private static final int CZAS = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        // Uruchom wątek otwierający główną aktywność
        ActivityStarter starter = new ActivityStarter();
        starter.start();
    }


private class ActivityStarter extends Thread {

    @Override
    public void run() {
        try {
            // tutaj wrzucamy wszystkie akcje potrzebne podczas ładowania aplikacji
            Thread.sleep(CZAS);
        } catch (Exception e) {
            Log.e("SplashScreen", e.getMessage());
        }

        // Włącz główną aktywność
        Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
        SplashScreenActivity.this.startActivity(intent);
        SplashScreenActivity.this.finish();
    }
}}
