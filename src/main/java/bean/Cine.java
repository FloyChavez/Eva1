package bean;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	
int id,Salas,idDistrito;
String razonSocial,Direccion,Telefonos,Detalle;
boolean Eliminado,Valido;


public Cine() {}

public Cine(String[] aRegistro) {
	setRegistro(aRegistro);
}





public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getSalas() {
	return Salas;
}

public void setSalas(int salas) {
	Salas = salas;
}

public int getIdDistrito() {
	return idDistrito;
}

public void setIdDistrito(int idDistrito) {
	this.idDistrito = idDistrito;
}

public String getRazonSocial() {
	return razonSocial;
}

public void setRazonSocial(String razonSocial) {
	this.razonSocial = razonSocial;
}

public String getDireccion() {
	return Direccion;
}

public void setDireccion(String direccion) {
	Direccion = direccion;
}

public String getTelefonos() {
	return Telefonos;
}

public void setTelefonos(String telefonos) {
	Telefonos = telefonos;
}

public String getDetalle() {
	return Detalle;
}

public void setDetalle(String detalle) {
	Detalle = detalle;
}

public boolean isEliminado() {
	return Eliminado;
}

public void setEliminado(boolean eliminado) {
	Eliminado = eliminado;
}

public boolean isValido() {
	return Valido;
}

public void setValido(boolean valido) {
	Valido = valido;
}

public void setRegistro (String[] aRegistro) {
	Valido= aRegistro != null;
	if(aRegistro==null)return;
	id=Integer.parseInt(aRegistro[0]);
	razonSocial=aRegistro[1];
	Salas= Integer.parseInt(aRegistro[2]);
	idDistrito= Integer.parseInt(aRegistro[3]);
	Direccion= aRegistro[4];
	Telefonos= aRegistro[5];
	Eliminado= aRegistro[6].equals("true");
	Detalle= aRegistro[7];
}

public Object [] getRegistro(){
	return new Object[] {id,razonSocial,Salas,idDistrito,Direccion,Telefonos,Eliminado};
}

public List<Cine> getRegistros(String[][] mRegistros){
	if (mRegistros ==null) return null;
	List<Cine> lstCine = new ArrayList<>();
	for (String[] aCine : mRegistros)
		lstCine.add(new Cine(aCine));
	return lstCine;
}


}
