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
public class English_detail extends AppCompatActivity{
    //全局变量声明
    Spinner english_picture_spinner;
    ArrayAdapter<String> adapter;
    //初始数据声明
    private String data[] = {"chiken","pink","orange","pink"};
    private List<English_picture>english_pictureList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.english_layout);
        initPictures();
        English_pictureAdapter adapter = new English_pictureAdapter(English_detail.this, R.layout.english_picture_item, english_pictureList);
        ListView listView = (ListView) findViewById(R.id.English_listview);
        listView.setAdapter(adapter);
    }
    private void initPictures(){
        English_picture chiken=new English_picture("chiken",R.drawable.chiken);
        english_pictureList.add(chiken);
        English_picture orange=new English_picture("orange",R.drawable.orange);
        english_pictureList.add(orange);
        English_picture pig=new English_picture("pig",R.drawable.pig);
        english_pictureList.add(pig);
        English_picture pink=new English_picture("pink",R.drawable.pink);
        english_pictureList.add(pink);
    }
}



