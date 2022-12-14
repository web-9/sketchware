

/* ActionBar
================================ */

// Modify ActionBar using getActionBar();:
ActionBar ab = getActionBar();
// * Modify ActionBar AppCompat:
android.support.v7.app.ActionBar ab = getSupportActionBar();
// In androidx project use
androidx.appcompat.app.ActionBar ab = getSupportActionBar();
/* ------------------------------------------------------ */

// setTitle
ab.setTitle( "Title" );

// setSubtitle
ab.setSubtitle( "s​ubtitle" );

// Show App icon in Action Bar
ab.setDisplayShowHomeEnabled( true );

// Set an image as icon in Action Bar
ab.setIcon( getDrawable( R.drawable.imagename ) );
ab.setDisplayShowHomeEnabled( true );

// Use Custom view in Action Bar
ab.setCustomView( R.layout.customView1 );
ab.setDisplayShowCustomEnabled( true );

// Hide Action Bar
ab.hide();

// Hide Action Bar Title
ab.setDisplayShowTitleEnabled( false );

// Use an image as Action Bar background
ab.setBackgroundDrawable( getDrawable( R.drawable.imagename ) );

// Change Action Bar background​ color
ab.setBackgroundDrawable(
    new android.graphics.drawable.ColorDrawable(
        Color.parseColor( "#AA666D" )
    )
);

// 

