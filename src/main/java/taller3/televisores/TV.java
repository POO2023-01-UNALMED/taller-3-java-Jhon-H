package taller3.televisores;

public class TV {
	private static int numTV;

	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	Control control;

	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
    TV.numTV++;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setCanal(int canal) {
    if (!this.estado) return;
		if (canal > 120 || canal < 1) return;
		this.canal = canal;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setControl(Control control) {
		this.control = control;
	}

	public void setVolumen(int volumen) {
    if (!this.estado) return;
		if (volumen > 7 || volumen < 0) return;
		this.volumen = volumen;
	}

	public Marca getMarca() {
		return this.marca;
	}

	public int getCanal() {
		return this.canal;
	}

	public int getPrecio() {
		return this.precio;
	}

	public Control getControl() {
		return this.control;
	}

	public int getVolumen() {
		return this.volumen;
	}

	public static int getNumTV() {
		return TV.numTV;
	}

	public static void setNumTV(int numTv) {
		TV.numTV = numTv;
	}

	public void turnOn() {
		this.estado = true;
	}

	public void turnOff() {
		this.estado = false;
	}

	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if (!this.estado) return;
		if (this.canal == 120) return;
		this.canal ++;
	}
	
	public void canalDown() {
		if (!this.estado) return;
		if (this.canal == 1) return;
		this.canal --;
	}
	
	public void volumenUp() {
		if (!this.estado) return;
		if (this.volumen == 7) return;
		this.volumen ++;
	}
	
	public void volumenDown() {
		if (!this.estado) return;
		if (this.volumen == 0) return;
		this.volumen --;
	}
}
