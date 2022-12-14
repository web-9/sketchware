

/* onActivityCreate */
mapVar.create new map;
mapVar.putKey( "key" ).value( editText.getText() );
firebaseDb.addKey( "componentKey" ).value( mapVar );

// remove

// onActivityCreate
firebaseDb.getChildrenTo( ListMap ).then{
    editText.setText( getValueAt( 0 ).Key( mapKey ).of( ListMap ) );
}

