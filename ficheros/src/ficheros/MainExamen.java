package ficheros;


/**
 * 
 * TODO: haced una conexión a la base de datos para ver si existe
 * un usuario y su contraseña
 * 
 * 
 * el usuario y la contraseña la pedimos por teclado (clase Scanner)
 * 
 * La tabla de la base de datos es usuarios del esquema bddni
 * En dicha tabla, tenemos dos columnas: usuario y password, que son
 * las que tenemos que consultar
 * 
 * Una vez solicitadas las credenciales del usuario (usuario y password)
 * hacemos una consulta SELECT en la base de datos. Si está, le mostramos
 * un mensaje de Bienvenida.
 * 
 * Si no coincide el nombre o la contraseña, le mostramos un mensaje
 * de login Incorrecto.
 * 
 * Importante: Tratar las exepciones con try catch y si se prodeuce algún
 * fallo, impridlo con printStackTrace
 * 
 * EL driver de la base de datos es MYSQL (jar) 
 * El usuario y la contraseña para conectarse a la base de datos
 * viene en un fichero de propiedades (parametros.properties)
 * 
 * 
 * 
 * 
 * PISTA: SE PARECE MUCHO AL MainLogin
 * 
 * 
 * 
 * 
 */
public class MainExamen {

}
