package com.example.appwebviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser=findViewById(R.id.webkit);

        //lorsqu'on développe avec webviews, les progs HTML, CSS, JS ...
        //doivent étre stockés dans le dossier raw. Et l'accès à des apps distantés
        //se fait via des webservices. (PHP coté serveur) et AJAX coté client.
        //on peut developper un apps entièrement comme cela, par contre les differentes
        //pages seront crées de manière dynamique dans le mème webview
        //Les navigateurs possèdent des base des données local (websql et indexdb)
        //on peut y stocker des données comme avec SQLITE

        //browser.loadUrl("http://10.0.2.2");
        browser.loadUrl("file:///android_res/raw/index.html");
    }
}
