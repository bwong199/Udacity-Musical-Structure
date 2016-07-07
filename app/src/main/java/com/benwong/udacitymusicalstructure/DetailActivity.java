package com.benwong.udacitymusicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailActivity extends AppCompatActivity {

    private Button toMusicLibraryBtn;
    private Button toLyricsViewBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        toMusicLibraryBtn = (Button)findViewById(R.id.toMusicLibrary);

        toLyricsViewBtn = (Button)findViewById(R.id.toLyricsView);

        toMusicLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        toLyricsViewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), LyricsActivity.class);
                startActivity(i);
            }
        });
    }
}
