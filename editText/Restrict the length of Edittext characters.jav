

/* Restrict the length of Edittext characters
============================================= */
// OnActivityCreate 
InputFilter[] editFilters = edittext1.getFilters();

InputFilter[] newFilters = new InputFilter[
    editFilters.length + 1
];

System.arraycopy(
    editFilters, 0,
    newFilters, 0,
    editFilters.length
);

newFilters[ editFilters.length ] = new InputFilter.LengthFilter( 10 ); 
edittext1.setFilters( newFilters );
