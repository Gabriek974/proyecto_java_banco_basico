package Dominio;

public class Clientes {

	private long numCliente;
	private int numCuenta;
	private String nombre;
	private String apellidop;
	private String apellidom;
	private String numcelular;
	private float dineroCuenta;
	
	
	public Clientes() {
	}


	public Clientes(long numCliente, int numCuenta, String nombre, String apellidop, String apellidom,
			String numcelular, float dineroCuenta) {
		this.numCliente = numCliente;
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.apellidop = apellidop;
		this.apellidom = apellidom;
		this.numcelular = numcelular;
		this.dineroCuenta = dineroCuenta;
	}


	@Override
	public String toString() {
		return "Clientes [numCliente=" + numCliente + ", numCuenta=" + numCuenta + ", nombre=" + nombre + ", apellidop="
				+ apellidop + ", apellidom=" + apellidom + ", numcelular=" + numcelular + ", dineroCuenta="
				+ dineroCuenta + "]";
	}


	public long getNumCliente() {
		return numCliente;
	}


	public void setNumCliente(long numCliente) {
		this.numCliente = numCliente;
	}


	public int getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidop() {
		return apellidop;
	}


	public void setApellidop(String apellidop) {
		this.apellidop = apellidop;
	}


	public String getApellidom() {
		return apellidom;
	}


	public void setApellidom(String apellidom) {
		this.apellidom = apellidom;
	}


	public String getNumcelular() {
		return numcelular;
	}


	public void setNumcelular(String numcelular) {
		this.numcelular = numcelular;
	}


	public float getDineroCuenta() {
		return dineroCuenta;
	}


	public void setDineroCuenta(float dineroCuenta) {
		this.dineroCuenta = dineroCuenta;
	}


	
	
	
	
	
	
}
