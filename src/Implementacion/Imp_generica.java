package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Clientes;
import Interface.Metodos;

public class Imp_generica implements Metodos{

	
	List<Clientes> lista = new ArrayList<Clientes>();
	
	@Override
	public void guardar(Clientes cliente) {
		// TODO Auto-generated method stub
		boolean bandera = false;
		for (Clientes c : lista) {
			if ((c.getNumCuenta() == cliente.getNumCuenta()) || c.getNumCliente() == cliente.getNumCliente() ) {
				System.out.println("EL NUMERO DE TARJETA YA EXISTE O EL NUMERO DE CLIENTE YA EXISTE");
				bandera = true;
				break;
			}
		}
		if (bandera == false) {
			lista.add(cliente);
			System.out.println("SE GUARDO CORRECTAMENTE");

		}

	}
	

	
	public Clientes buscarpornumero(Clientes cliente) {
		// TODO Auto-generated method stub
		
		boolean bandera = false;
		Clientes objEncontrar = null;
		
		for(Clientes c : lista) {
			
			if (c.getNumCuenta() == cliente.getNumCuenta()) {
				
				objEncontrar = c;
				//System.out.println("se encontro: " + objEncontrar);
				bandera = true;
				break;
				
			}
		}
		if(bandera == false) {
			System.out.println("no se encontro o hubo un error");
		}
		
		return objEncontrar;
		
	}


	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}


	
	public Clientes buscarxnumerocuenta(int numCuenta) {
		
		boolean bandera = false;
		Clientes objEnco = null;
		
		for(Clientes c : lista) {
			
			if(c.getNumCuenta()==(numCuenta)) {
				objEnco = c;
				
				
				bandera = true;
				break;
				//por si hay mas registros con el mismo nombre
				
			}
			
		}
		
		if(bandera == false) {
			
			System.out.println("no se encontro");
		}
		return objEnco;
	}





	
	

}
