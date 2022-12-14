

/* Custom Popup Window
===================================== */
// 1) Add a custom view named window.You can name it according to your wish. 

// 2)Design your popup window. 

// 2) Now, In the logic section,In OnCLick event of button.Add the following  code

// view:
View popupView = getLayoutInflater().inflate(
    R.layout.window,
    null
);

// Popup window:
final PopupWindow popup = new PopupWindow(
    popupView,
    ViewGroup.LayoutParams.WRAP_CONTENT,
    ViewGroup.LayoutParams.WRAP_CONTENT,
    true
);

// Initialize:
Button b1 = popupView.findViewById(
    R.id.button1
);
Button b2 = popupView.findViewById(
    R.id.button2
);

// OnClickListeners:
b1.setOnClickListener( new OnClickListener() {
    public void onClick( View view ) {
        popup.dismiss();
    }
} );

b2.setOnClickListener( new OnClickListener() {
    public void onClick( View view ) {
        popup.dismiss();
    }
} );

Show the popup window 

popup.showAtLocation( popupView, Gravity.CENTER, 0, 0 );