package com.benwong.udacitymusicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LyricsActivity extends AppCompatActivity {

    private Button toDetailsViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);

        toDetailsViewBtn = (Button)findViewById(R.id.toDetailsViewBtn);

        toDetailsViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), DetailActivity.class);
                startActivity(i);
            }
        });
    }
}
