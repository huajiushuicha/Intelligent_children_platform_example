package com.example.intelligent_children_platform.indenx.function;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.example.intelligent_children_platform.R;
public class Histogram_function extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.histogram);
        //强制横屏（横屏：LANDSCAPE；竖屏：PORTRAIT）
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        //本地访问html文件
        WebView webView = (WebView)findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        //开启脚本支持
        webSettings.setJavaScriptEnabled(true);
        //开启本地文件读取(默认为true,不设置也可以)
        webView.getSettings().setAllowFileAccess(true);
        webView.loadUrl("file:///android_asset/health_histogram.html");
    }
}
