

/* drawer at right side
================================== */
_toolbar.setNavigationOnClickListener(
    new View.OnClickListener() {
        @Override
        public void onClick( View _v ) {
            _drawer.openDrawer( Gravity.RIGHT );
        }
    }
);
 
LinearLayout _nav_view = ( LinearLayout ) findViewById( R.id._nav_view );

androidx.drawerlayout.widget.DrawerLayout.LayoutParams lp = new androidx.drawerlayout.widget.DrawerLayout.LayoutParams(
    LinearLayout.LayoutParams.MATCH_PARENT,
    LinearLayout.LayoutParams.MATCH_PARENT
);

lp.gravity = Gravity.RIGHT;
_nav_view.setLayoutParams( lp );
