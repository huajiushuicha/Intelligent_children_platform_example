package com.example.intelligent_children_platform.indenx.detail;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.*;
import com.example.intelligent_children_platform.R;

import java.util.ArrayList;
import java.util.List;
public class ChineseWord_detail extends AppCompatActivity {
    //全局变量声明
    Spinner  chineseword_picture_spinner;
    ArrayAdapter<String> adapter;
    //初始数据声明
    private String data[] = {"足","鸟","人","舌","牙"};
    private List<ChineseWord_picture> chineseword_pictureList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.chineseword_layout);
        initPictures();
        ChineseWord_pictureAdapter adapter=new ChineseWord_pictureAdapter(ChineseWord_detail.this,R.layout.chineseword_picture_item,chineseword_pictureList);
        ListView listView=(ListView)findViewById(R.id.ChineseWord_listview);
        listView.setAdapter(adapter);
    }
    private void initPictures(){
        ChineseWord_picture zu=new ChineseWord_picture("足",R.drawable.zu);
        chineseword_pictureList.add(zu);
        ChineseWord_picture ren=new ChineseWord_picture("人",R.drawable.ren );
        chineseword_pictureList.add(ren);
        ChineseWord_picture she=new ChineseWord_picture("舌",R.drawable.she);
        chineseword_pictureList.add(she);
        ChineseWord_picture niao=new ChineseWord_picture("鸟",R.drawable.niao);
        chineseword_pictureList.add(niao);
        ChineseWord_picture ya=new ChineseWord_picture("牙",R.drawable.ya);
        chineseword_pictureList.add(ya);
    }
}