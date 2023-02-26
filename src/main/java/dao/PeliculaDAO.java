package dao;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import bean.Pelicula;

public class PeliculaDAO {
	
db.Db db = new db.Db("Cinestar");

public String [][] getPeliculas (Object id) {
	db.Sentencia (String.format("call sp_getPeliculas(%s)",id));
	return db.getRegistros(); 
}

public String [] getPelicula(Object idPelicula) {
	db.Sentencia (String.format("call sp_getPelicula(%s)",idPelicula));
	String[] aPelicula = db.getRegistro();
	if (aPelicula == null) return null;
	aPelicula[2] = new SimpleDateFormat("EEEE dd 'de' MMMMM 'de' yyyy").format (new Date(aPelicula[2]));
	
	db.Sentencia (String.format("select getGenerosDetalle('%s')",aPelicula[4]));
	aPelicula[4] = db.getCampo();
	
	return aPelicula; 
}
}

