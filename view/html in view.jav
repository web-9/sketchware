

/* Insert html in a webView */
WebView webview1 loadUrl data:text/html, <html code...>

/* onBackPressed: */
if webview canGoBack then webview goBack else finish activity

/* enable js */
WebSettings webSettings = webview1.getSettings();
webSettings.setJavaScriptEnabled( true );
webSettings.setJavaScriptCanOpenWindowsAutomatically( true );

if( android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN ) {
    webSettings.setAllowFileAccessFromFileURLs( true );
    webSettings.setAllowUniversalAccessFromFileURLs( true );
}
