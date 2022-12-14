

// set a single color:
android.graphics.drawable.GradientDrawable gd = 
new android.graphics.drawable.GradientDrawable();

int clr[] = new int[] {
    Color.parseColor( "#ff0000" ),
    Color.parseColor( "#ffff06" ),
    Color.parseColor( "#dd00ff" ),
    Color.parseColor( "#ddff46" )
};

gd.setColors( clr );
gd.setCornerRadius( 80 );

linear1.setBackground( gd );

// change orientation of GradientDrawable:
gd.setOrientation(
    android.graphics.drawable.GradientDrawable.Orientation.BL_TR
);

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