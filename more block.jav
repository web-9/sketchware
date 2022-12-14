

list_drawer.add( "Account" );
list_drawer.add( "help" );
list_drawer.add( "Download" );
list_drawer.add( "Profile" );
list_drawer.add( "YouTube" );
list_drawer.add( "Facebook" );
list_drawer.add( "Settings" );
list_drawer.add( "Contact" );
list_drawer.add( "Check Update" );
list_drawer.add( "About" );
list_drawer.add( "Account" );
list_drawer.add( "help" );
list_drawer.add( "Download" );
list_drawer.add( "Profile" );
list_drawer.add( "YouTube" );
list_drawer.add( "Facebook" );
list_drawer.add( "Settings" );
list_drawer.add( "Contact" );
list_drawer.add( "Check Update" );
list_drawer.add( "About" );

ListView listview1 = new ListView( this );

LinearLayout.LayoutParams lp1 = new LinearLayout.LayoutParams(
    LinearLayout.LayoutParams.MATCH_PARENT, 
    LinearLayout.LayoutParams.MATCH_PARENT
);

listview1.setLayoutParams( lp1 );

listview1.setAdapter(
    new ArrayAdapter(
        getBaseContext(), 
        android.R.layout.simple_list_item_1, list_drawer
    )
);

_drawer_linearTarget.addView( listview1 );

listview1.setOnItemClickListener( new AdapterView.OnItemClickListener() {
	    @Override
	    public void onItemClick(
	        AdapterView _parent, View _view, final int _position, long _id ) {
	        	switch ( _position ) {
		            case 0:
						SketchwareUtil.showMessage( getApplicationContext(),
						"Account" );
						break;
					case 1:
						SketchwareUtil.showMessage( getApplicationContext(), 
						"help" );
						break;
					case 2:
						SketchwareUtil.showMessage( getApplicationContext(), 
						"Download" );
						break;
					case 3:
						SketchwareUtil.showMessage( getApplicationContext(), 
						"Profile" );
						break;
					case 4:
						SketchwareUtil.showMessage( getApplicationContext(), 
						"YouTube" );
						break;
				}
			}
} );