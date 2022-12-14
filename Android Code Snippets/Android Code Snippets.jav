

/* Android Code Snippets
================================== */

// Disable screenshot
getWindow().setFlags(
    WindowManager.LayoutParams.FLAG_SECURE,
    WindowManager.LayoutParams.FLAG_SECURE
);

// Hide suggestions from the soft keyboard on EditText view
EditText.setInputType(
    InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
);

// Hide soft keyboard on Button Click
android.view.inputmethod.InputMethodManager imm = (
    android.view.inputmethod.InputMethodManager
) getSystemService( Context.INPUT_METHOD_SERVICE );

imm.hideSoftInputFromWindow(
    getCurrentFocus().getWindowToken(), 0
);

// Hide WebView scrollbar
webview1.setVerticalScrollBarEnabled( false );
webview1.setHorizontalScrollBarEnabled( false );

// Get Screen Height
Point sPoint = new Point();

WindowManager wm = (
    WindowManager
) getApplicationContext().getSystemService( Context.WINDOW_SERVICE );

wm.getDefaultDisplay().getSize( sPoint );

int screenHeight = sPoint.y;

// Get Screen Width
Point sPoint = new Point();

WindowManager wm = (
    WindowManager
) getApplicationContext().getSystemService( Context.WINDOW_SERVICE );

wm.getDefaultDisplay().getSize( sPoint );

int screenWidth = sPoint.x;

