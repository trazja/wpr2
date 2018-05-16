package tryhut.wpr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class SelectNavigationOrGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_navigation_or_guide);


        Button guideButton = findViewById(R.id.guideButton);
        guideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent guideIntent = new Intent(SelectNavigationOrGuideActivity.this, MainActivity.class);
                SelectNavigationOrGuideActivity.this.startActivity(guideIntent);
            }
        });
    }
}
