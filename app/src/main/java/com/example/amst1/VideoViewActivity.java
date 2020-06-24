package com.example.amst1;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);
        // Instanciando el objeto VideoView
        VideoView videoView =(VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse("rtsp://r6---sn-4g5e6nlk.googlevideo.com/Cj0LENy73wIaNAm9Pw3umbhMnhMYESARFC1khfNeMOCoAUIASARgrqWbyveP54RcigELRDUyNTJEdGluUEEM/5C431528468FACF940834E7E63093E6A31D99809.DC2A92E073D6FA520C0EDC46C570C22A7E22F70B/yt8/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
