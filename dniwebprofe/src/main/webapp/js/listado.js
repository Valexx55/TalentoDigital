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
		let ulista = document.getElementById("tablaDni");
		listadoDni.forEach(dni=>{
			//creo un li y lo voy añadiendo
			let filadni = document.createElement("tr");
			let columnanumero = document.createElement("td");
			let columnaletra = document.createElement("td");
			let columnaboton = document.createElement("td");
			
			let boton = document.createElement("button");
			boton.innerHTML="BORRAR";
			boton.id = dni.id;
			boton.addEventListener("click", (evento)=>{
				console.log("HA TOCADO BORRAR "+evento.target.id);
				fetch("ServletBorrarDni?iddni="+evento.target.id)
				.then (respuesta => {
					if (respuesta.status==500)
					{
						alert("Error al borrar");
					} else {
						alert("DNI BORRADO Correctamente");
						let boton = evento.target;
						boton.parentElement.parentElement.remove();
					}
				})
				 
			})
			
			columnanumero.innerHTML = dni.numero;
			columnaletra.innerHTML = dni.letra;
			
			
			columnaboton.appendChild(boton);
			
			filadni.appendChild(columnanumero);
			filadni.appendChild(columnaletra);
			filadni.appendChild(columnaboton);
			
			ulista.appendChild(filadni);
			
			
			});
	});
}










