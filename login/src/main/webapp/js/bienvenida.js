window.onload=cargarPerfil;

function cargarPerfil ()
{
	fetch("ObtenerPerfil")
	.then(respuesta=>{
		console.log ("Procesando la vuelta ..");
			switch (respuesta.status) {
				case 200:
					console.log("Perfil obtenido");
					respuesta.json().then (infoUsuario=>mostrarPerfil(infoUsuario));
					break;
				case 401:
					console.log("No autoizado");
					location.href="index.html";
					break;
				case 500:
					console.log("Error al obtener el perfil");
					break;

			}
	})
}

function mostrarPerfil (infousuario)
{
	console.log ("INFO = " + infousuario);
	document.getElementById ("nombre").innerHTML = infousuario.usuario
	document.getElementById ("fotoPerfil").src = "ObtenerFoto?idfoto="+infousuario.rutaFoto.substring(infousuario.rutaFoto.lastIndexOf('\\') + 1);
	//fotosperfil\foto1728286525650
}







