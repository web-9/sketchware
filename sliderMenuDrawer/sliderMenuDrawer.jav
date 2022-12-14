

/* [ slider menu drawer ] */
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