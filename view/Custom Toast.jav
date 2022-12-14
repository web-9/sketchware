

/* Custom Toast
============================== */
// 1) - Add a Button
// 2) - Add a New Custom View

// button1 onClick:
View layoutValue = LayoutInflater.from(
    MainActivity.this
).inflate( R.layout.custom, null );

TextView textview1 = ( TextView ) layoutValue.findViewById(
    R.id.textview1
);

textview1.setText( "Hello Everyone " );

Toast toast = new Toast( getApplicationContext() );
toast.setDuration( Toast.LENGTH_SHORT );
toast.setGravity( Gravity.CENTER_VERTICAL, 0, 0 );
toast.setView( layoutValue );
toast.show();
