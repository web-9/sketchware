

/* custom if
========================= */
params:
"if", textView, "isEmpty", 

code:
if( %1$s.getText().toString().equals("") ) {
    %2$s
} else {
    %3$s
}