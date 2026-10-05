package com.empire.game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.VideoView;

public final class IntroActivity extends Activity {

    private VideoView video;

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        getWindow().setNavigationBarColor(Color.BLACK);
        getWindow().setStatusBarColor(Color.BLACK);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        video = new VideoView(this);
        video.setBackgroundColor(Color.BLACK);
        setContentView(video);

        int videoId = getResources().getIdentifier(
                "empire_intro",
                "raw",
                getPackageName()
        );

        if (videoId == 0) {
            openMain();
            return;
        }

        String path = "android.resource://" + getPackageName() + "/" + videoId;
        video.setVideoPath(path);

        video.setOnPreparedListener(mp -> {
            mp.setLooping(false);
            mp.setVolume(1.0f, 1.0f);
            video.start();
        });

        video.setOnCompletionListener(mp -> openMain());

        video.setOnErrorListener((mp, what, extra) -> {
            openMain();
            return true;
        });

        video.setOnTouchListener((v, event) -> {
            if (event.getAction() == MotionEvent.ACTION_UP) {
                openMain();
                return true;
            }
            return true;
        });
    }

    private void openMain() {
        if (video != null) {
            video.stopPlayback();
        }

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        openMain();
    }
}
