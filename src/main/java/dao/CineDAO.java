package dao;
import java.util.ArrayList;
import java.util.List;

import bean.Cine;
import bean.Pelicula;

public class CineDAO {
	
db.Db db = new db.Db("Cinestar");

public  String[][] getVerCines () { // sin parametro
	db.Sentencia ("call sp_getCines()");
	return db.getRegistros();
	}

public  String[] getVerCine(Object idCine) { // con parametro
	db.Sentencia (String.format("call sp_getCine(%s)",idCine));
	return db.getRegistro();
	}

public  String[][] getCineTarifas(Object idCine) {
	db.Sentencia (String.format("call sp_getCineTarifas(%s)",idCine));
	return db.getRegistros();
}

public  String[][] getCinePeliculas(Object idCine) {
	db.Sentencia (String.format("call sp_getCinePeliculas(%s)",idCine));
	return db.getRegistros();
}





}

