package com.example.safetyfood.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.safetyfood.R;

public class ThongTinCuaHang extends AppCompatActivity {
    WebView wed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_tin_cua_hang);
    }
}