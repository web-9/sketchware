

/* [ slider menu drawer ]
============================================================================== */
/* https://www.youtube.com/watch?v=XeL4SwgUKuI */

/* Inject:
=============================== */
android:elevation = "8dp"

/* onCreate:
=============================== */
LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
    ( int ) (
        SketchwareUtil.getDisplayWidthPixels( getApplicationContext() )
        ), ViewGroup.LayoutParams.MATCH_PARENT);

linear3.setLayoutParams( lp );

/* onMenuClicked:
=============================== */
LinearLayout viewgroup = ( LinearLayout ) linear1;

android.transition.AutoTransition autoTransition = new android.transition.AutoTransition(); 
autoTransition.setDuration( 200 );
autoTransition.setInterpolator( new android.view.animation.DecelerateInterpolator() ); 
android.transition.TransitionManager.beginDelayedTransition( viewgroup, autoTransition );

/* boolean:
=============================== */
linear2.getVisibility() == View.VISIBLE

/* OR you can also use */

if( linear2.getVisibility() == View.VISIBLE ) {
 
} else {
 
}

/* https://www.youtube.com/watch?v=PwbymEBAgns */



/*======================================
[ create blocks ]
============================================================================== */
properties
name:
setViewElevation

type:
regular

design:
params:
view, "setElevation", number, 

code:
%1$s.setElevation(%2$s);
/* ------------------------------------- */

/* if */
params:
"if", textView, "isEmpty", 

code:
if( %1$s.getText().toString().equals("") ) {
    %2$s
} else {
    %3$s
}


/* [ firebase ]
============================================================================== */

project id:
dmchat-11111-default-d1dd

app id:
1:6256225165:androidf456464655645445

api key:
AfdsfdsAFdfsdfAFDSFfsdf1sdf61

storage bucket URL:
afa-45454.fafaf.com
----------------------------

1:330211779474:android:95fc35532d81e1a4c4974b
AIzaSyAOIkRnpXjSvGDa3_LRmY7CHILc8ovKt0g