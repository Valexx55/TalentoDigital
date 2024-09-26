window.onload = pedirListadoDni;

function pedirListadoDni()
{
	console.log("Pidiendo datos al servidor . . .");
	fetch("http://localhost:8080/dniwebprofe/ServletListadoDni")
	.then(respuesta=> {
		console.log("Respuesta recibida " + respuesta.status);
		return respuesta.json();
		}
		)
	.then(listadoDni => {
		console.log ("listado de dni recibido "+listadoDni.length );
		//pillo el ul
		let ulista = document.getElementById("listadoDni");
		listadoDni.forEach(dni=>{
			//creo un li y lo voy añadiendo
			let nuevoli = document.createElement("li");
			nuevoli.innerHTML = dni.numero + " " +dni.letra;
			ulista.appendChild(nuevoli);
			console.log(dni.numero + " " +dni.letra);
			});
	});
}










