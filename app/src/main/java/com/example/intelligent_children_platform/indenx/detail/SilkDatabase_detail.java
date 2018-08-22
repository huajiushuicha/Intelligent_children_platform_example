package com.example.intelligent_children_platform.indenx.detail;
import android.content.Intent;
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
import com.example.intelligent_children_platform.indenx.function.Education_function;
import java.util.ArrayList;
import java.util.List;
import com.example.intelligent_children_platform.R;
public class SilkDatabase_detail extends AppCompatActivity{
    //全局变量声明
    Spinner silk_word_spinner;
    ArrayAdapter<String> adapter;
    //初始数据声明
    private String data[] = {"发热","咳嗽","腹泻","呕吐"};
    private List<SilkDatabase_word> silkdatabaseList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.silkdatabase_layout);
        initPictures();
        SilkDatabase_wordAdapter adapter=new  SilkDatabase_wordAdapter(SilkDatabase_detail.this,R.layout.silkdatabase_word_item,silkdatabaseList);
        ListView listView = (ListView) findViewById(R.id.silkdatabase_listview);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> mAdapterView, View mView, int mI, long mL) {
                switch (mI) {
                    case 0:
                        Intent intent = new Intent(SilkDatabase_detail.this, Fare_detail.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(SilkDatabase_detail.this, Kesou_detail.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(SilkDatabase_detail.this,Fuxie_detail.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(SilkDatabase_detail.this,Outu_detail.class);
                        startActivity(intent3);
                        break;
                }
            }
        });
    }
    public void initPictures(){
        SilkDatabase_word fare=new SilkDatabase_word("小儿发热",R.drawable.fashao);
        silkdatabaseList.add(fare);
        SilkDatabase_word kesou=new SilkDatabase_word("小儿咳嗽",R.drawable.kesou);
        silkdatabaseList.add(kesou);
        SilkDatabase_word fuxie=new SilkDatabase_word("小儿腹泻",R.drawable.fuxie);
        silkdatabaseList.add(fuxie);
        SilkDatabase_word outu=new SilkDatabase_word("小儿呕吐",R.drawable.outu);
        silkdatabaseList.add(outu);
    }
}
