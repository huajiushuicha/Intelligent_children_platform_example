package com.example.intelligent_children_platform.indenx.other_model;
import android.content.Intent;
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
import java.util.ArrayList;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
public class Taobao_detail extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taobao_layout);
        WebView webView =(WebView)findViewById(R.id.taobao_wv);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.taobao.com");
    }
}
