package com.example.a2doparcialexamenljls6tocuatri;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.VideoView;

public class menuterror extends AppCompatActivity {



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuterror);
        VideoView mivdeo=findViewById(R.id.video1);

        String videop= "android.resource://" + getPackageName() + "/" + R.raw.sqlvideo;
        Uri uri=Uri.parse(videop);
        mivdeo.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        mivdeo.setMediaController(mediaController);
        mediaController.setAnchorView(mivdeo);
    }

}
