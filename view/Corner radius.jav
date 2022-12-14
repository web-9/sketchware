

/* Corner radius
=============================== */
// sk:
card.setBackground(
    new GradientDrawable() {
        public GradientDrawable getIns( int a, int b ) {
            this.setCornerRadius( a ); 
            this.setColor( b ); 
            return this; 
        }
    }.getIns( ( int )18, 0x99FFFFFF )
);

// as:
android.graphics.drawable.GradientDrawable gd = 
    new android.graphics.drawable.GradientDrawable();
gd.setCornerRadius( 80 );

// new sk:
android.graphics.drawable.GradientDrawable gd =
    new android.graphics.GradientDrawable();

gd.setColor( 0xffffab00 );
gr.setCornerRadius( 80 );

card.setBackground( gd );