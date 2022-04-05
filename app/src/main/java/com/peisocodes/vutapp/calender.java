package com.peisocodes.vutapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class calender extends AppCompatActivity {

    ProgressDialog progressDialog;

    public boolean isNetworkAvailable (final Context context){
        final ConnectivityManager connectivityManager = ((ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo()!= null &&connectivityManager.getActiveNetworkInfo().isConnected();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);


        if (isNetworkAvailable(getApplicationContext())) {

            String url ="https://www.vut.ac.za/adademic-calender/";
            WebView calenderWebView = findViewById(R.id.calender_webView);
            calenderWebView.setWebViewClient(new calender.MyWebViewClient());

            calenderWebView.getSettings().setJavaScriptEnabled(true);
            calenderWebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
            calenderWebView.loadUrl(url);
        }

        else {
            Toast.makeText(getApplicationContext(), "No Connection", Toast.LENGTH_LONG).show();
        }


    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            view.loadUrl("https://www.vut.ac.za/adademic-calender/");
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            progressDialog = new ProgressDialog(calender.this);
            progressDialog.setMessage("Please Wait...");
            // progressDialog.setCancelable(false);
            progressDialog.show();
            Toast.makeText(getApplicationContext(),"Loading...",Toast.LENGTH_LONG).show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            view.loadUrl("javascript:document.getElementById('Action_bar').style.display='none'; void(0);");
            view.loadUrl("javascript:document.getElementById('Header_wrapper').style.display='none'; void(0);");
            view.loadUrl("javascript:document.getElementById('Footer').style.display='none'; void(0);");


            view.loadUrl("javascript:if (typeof(document.getElementsByClassName('wpb_column vc_column_container vc_col-sm-3')[0]) != 'undefined' && document.getElementsByClassName('wpb_column vc_column_container vc_col-sm-3')[0] != null){document.getElementsByClassName('wpb_column vc_column_container vc_col-sm-3')[0].style.display = 'none';} void 0");
            view.loadUrl("javascript:if (typeof(document.getElementsByClassName('vc_row wpb_row vc_row-fluid vc_custom_1632304754030 vc_row-has-fill ult-vc-hide-row')[0]) != 'undefined' && document.getElementsByClassName('vc_row wpb_row vc_row-fluid vc_custom_1632304754030 vc_row-has-fill ult-vc-hide-row')[0] != null){document.getElementsByClassName('vc_row wpb_row vc_row-fluid vc_custom_1632304754030 vc_row-has-fill ult-vc-hide-row')[0].style.display = 'none';} void 0");
            view.loadUrl("javascript:if (typeof(document.getElementsByClassName('sfm-navicon-button x sf_label_default')[0]) != 'undefined' && document.getElementsByClassName('sfm-navicon-button x sf_label_default')[0] != null){document.getElementsByClassName('sfm-navicon-button x sf_label_default')[0].style.display = 'none';} void 0");

            view.loadUrl("javascript:document.getElementById('fsml_ff').style.display='none'; void(0);");
            view.loadUrl("javascript:document.getElementById('real-accessability').style.display='none'; void(0);");

            //super.onPageFinished(view, url);
            if(progressDialog!=null){
                progressDialog.dismiss();
            }
        }
    }
}
