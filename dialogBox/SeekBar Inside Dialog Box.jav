

/* SeekBar Inside Dialog Box
================================ */
final SeekBar cb1 = new SeekBar( MainActivity.this );

LinearLayout.LayoutParams lpar = new LinearLayout.LayoutParams(
    LinearLayout.LayoutParams.WRAP_CONTENT,
    LinearLayout.LayoutParams.WRAP_CONTENT
);

cb1.setLayoutParams( lpar );
dialog.setView( cb1 );

// Inside the block "dialog OK Button Clicked", add the following code using add source directly block

textview1.setText( String.valueOf( cb1.getProgress() ) );