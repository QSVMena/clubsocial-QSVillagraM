package Modells;

import java.util.Date;

public class Miembro extends PersonBase {
	public int NumberdeMembresia;
	public Date FechaDeEmisionMembresia;
	//(la fecha de vencimiento de la membresía es 
	//de 2 años exactos a partir de la fecha de emisión).
	public Date FechaVencimientoMembresia;
	
	public int getNumberdeMembresia() {
		return NumberdeMembresia;
	}
	public void setNumberdeMembresia(int numberdeMembresia) {
		NumberdeMembresia = numberdeMembresia;
	}
	public Date getFechaDeEmisionMembresia() {
		return FechaDeEmisionMembresia;
	}
	public void setFechaDeEmisionMembresia(Date fechaDeEmisionMembresia) {
		FechaDeEmisionMembresia = fechaDeEmisionMembresia;
	}
	public Date getFechaVencimientoMembresia() {
		return FechaVencimientoMembresia;
	}
	public void setFechaVencimientoMembresia(Date fechaVencimientoMembresia) {
		FechaVencimientoMembresia = fechaVencimientoMembresia;
	} 
	
	

}
