

// set a single color:
android.graphics.drawable.GradientDrawable gd = 
new android.graphics.drawable.GradientDrawable();

gd.setColor( Color.parseColor( "#ff000000" ) );

linear1.setBackground( gd );

// or:
gd.setColor( Color.WHITE );

linear1.setBackground( gd );


// add stroke:
gd.setStroke(8, Color.BLUE);

// change shape of gradient:
gd.setShape(
    android.graphics.drawable.GradientDrawable.OVAL
);

// change gradient type:
gd.setGradientType(
    android.graphics.drawable.GradientDrawable.SWEEP_GRADIENT
    // or: gd.setGradientType(android.graphics.drawable.GradientDrawable.RADIAL_GRADIENT);
);