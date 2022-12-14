

window.addEventListener( "load", ev => {
	var links = document.querySelectorAll( "li[link]" );

	links.forEach( link => link.addEventListener( "click", ev => {
		window.open( link.getAttribute( "link" ), "_self" );
	} ) );
} );