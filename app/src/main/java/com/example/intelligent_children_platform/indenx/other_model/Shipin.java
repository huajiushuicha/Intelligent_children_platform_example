package com.example.intelligent_children_platform.indenx.other_model;
import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;
import com.example.intelligent_children_platform.indenx.function.Education_function;
import com.example.intelligent_children_platform.indenx.other_model.Youxi;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
public class Shipin extends AppCompatActivity implements View.OnClickListener{
    private VideoView videoView;
    @Override
    //需要事先在SD卡的根目录下放置一个名为movie.mp4的视频文件
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shipin);
        Button play=findViewById(R.id.playshipin_bt);
        Button pause=findViewById(R.id.pauseshipin_bt);
        Button replay=findViewById(R.id.replayshipin_bt);
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        replay.setOnClickListener(this);
        if (ContextCompat.checkSelfPermission(Shipin.this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(Shipin.this,new String[]{
                    Manifest.permission.WRITE_EXTERNAL_STORAGE },1);
        } else {
            initVideoPath();
        }
    }
    private void initVideoPath(){
            File file=new File(Environment.getExternalStorageDirectory(),"movie.mp4");
            videoView.setVideoPath(file.getPath());
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,String[] permissions,int[] grantResults){
        switch (requestCode){
            case 1:
                if (grantResults.length>0&&grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    initVideoPath();
                } else {
                    Toast.makeText(this,"拒绝权限将无法使用程序",Toast.LENGTH_SHORT).show();
                    finish();
                }
                break;
            default:
        }
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.playshipin_bt:
                if (!videoView.isPlaying()){
                    videoView.start();
                }
                break;
            case R.id.pauseshipin_bt:
                if (videoView.isPlaying()){
                    videoView.pause();
                }
                break;
            case R.id.replayshipin_bt:
                if (videoView.isPlaying()){
                    videoView.resume();
                }
                break;
        }
    }

    protected void onDestory(){
        super.onDestroy();
        if (videoView!=null){
            videoView.suspend();

        }
    }
}
