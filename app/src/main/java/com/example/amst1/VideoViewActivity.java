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

        VideoView videoView = (VideoView)findViewById(R.id.videoView);
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);
        Uri uri=Uri.parse("rtsp://r6---sn-4g5e6nlk.googlevideo.com/Cj0LENy73wIaNAm9Pw3umbhMnhMYESARFC3XzfJeMOCoAUIASARgrqWbyveP54RcigELRDUyNTJEdGluUEEM/0B03BADD7E3C0E7FD2664AE4BC7E36AED48C3AB5.E0FB493C98B6E851411420B1D2882E1510A3D75B/yt8/1/video.3gp");
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
