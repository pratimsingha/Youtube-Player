package com.example.pratim.youtubeplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity
                implements View.OnClickListener
{
    private String GOOGLE_API_KEY = "AIzaSyDH1hCJrslHm8Tvy939prP_JM-cKbNpVVA";
    private String YOUTUBE_VIDEO_ID = "6mNBbwTqlK8";
    private String YOUTUBE_PLAY_LIST = "PLl7FgM8EYUaqEgZViorfU9P6Pe72iYrTR";

    private Button btn_playVideo;
    private Button btn_playList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        btn_playVideo = (Button)findViewById(R.id.btn_playVideo);
        btn_playList = (Button)findViewById(R.id.btn_playList);

        btn_playVideo.setOnClickListener(this);
        btn_playList.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent =  null;
        switch (view.getId()){
            case R.id.btn_playVideo:
                intent = YouTubeStandalonePlayer.createVideoIntent(this,GOOGLE_API_KEY,YOUTUBE_VIDEO_ID);
                break;
            case R.id.btn_playList:
                intent = YouTubeStandalonePlayer.createPlaylistIntent(this,GOOGLE_API_KEY,YOUTUBE_PLAY_LIST);
                break;
            default:
        }
        if (intent != null){
            startActivity(intent);
        }
    }
}
