/**
 * 
 */
function traerPerro() {
	
	fetch('https://dog.ceo/api/breeds/image/random')
		.then(cuerpoRespuesta => cuerpoRespuesta.json())
		.then(infoPerro => {
			console.log(infoPerro);
			document.getElementById("imagen").src = infoPerro.message;
		}
		);
}

















