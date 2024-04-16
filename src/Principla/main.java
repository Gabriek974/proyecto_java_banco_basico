package Principla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dominio.Clientes;
import Implementacion.Imp_generica;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner lectura = null;

			List<Clientes> listaclientes = new ArrayList<Clientes>();

			long numCliente;
			int numCuenta;
			String nombre;
			String apellidop;
			String apellidom;
			String numcelular;
			float dineroCuenta;

			Clientes cliente = null;

			int menuPrincipal, subMenu;

			Imp_generica imp = new Imp_generica();

			do {
				System.out.println("Menu principal");
				System.out.println("1---ALTA");
				System.out.println("2---CONSULTAR SALDO");
				System.out.println("3---DEPOSITO EN EFECTIVO");
				System.out.println("4---RETIRAR EFECTIVO");
				System.out.println("5---SALIR");
				lectura = new Scanner(System.in);
				menuPrincipal = lectura.nextInt();

				if(menuPrincipal<=0||menuPrincipal >= 6) {
					System.out.println("ingresa una opcion valida");
				}
				
				else if(menuPrincipal>1 || menuPrincipal<=5) {
					switch (menuPrincipal) {
					case 1:
						try {

							System.out.println("Ingrese el numero del cliente: ");
							lectura = new Scanner(System.in);
							numCliente = lectura.nextLong();

							System.out.println("Ingrese el numero de cuenta: ");
							lectura = new Scanner(System.in);
							numCuenta = lectura.nextInt();

							System.out.println("Ingrese el nombre: ");
							lectura = new Scanner(System.in);
							nombre = lectura.nextLine();

							System.out.println("Ingrese el primer apellido: ");
							lectura = new Scanner(System.in);
							apellidom = lectura.nextLine();

							System.out.println("Ingrese el segundo apellido: ");
							lectura = new Scanner(System.in);
							apellidop = lectura.nextLine();

							System.out.println("Ingrese el numero celular: ");
							lectura = new Scanner(System.in);
							numcelular = lectura.nextLine();

							System.out.println("Ingrese la cantidad de dinero del cliente: ");
							lectura = new Scanner(System.in);
							dineroCuenta = lectura.nextInt();

							cliente = new Clientes(numCliente, numCuenta, nombre, apellidop, apellidom, numcelular,
									dineroCuenta);
							imp.guardar(cliente);

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("Error al guardar");
						}

						break;

					case 2:

						try {
							System.out.println("Ingrese el numero de cuenta: ");
							lectura = new Scanner(System.in);
							numCuenta = lectura.nextInt();

							System.out.println("Tu saldo en tu cuenta es:");
							System.out.println(imp.buscarxnumerocuenta(numCuenta).getDineroCuenta());
						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("hubo un error al buscar el cliente");
						}

						break;

					case 3:

						try {
							System.out.println("Ingrese el numero de cuenta: ");
							lectura = new Scanner(System.in);
							numCuenta = lectura.nextInt();

							System.out.println("Tu saldo en tu cuenta es:");
							System.out.println(imp.buscarxnumerocuenta(numCuenta).getDineroCuenta());

							try {
								int rel, sum;
								System.out.println("ingrese la cantidad a depositar");
								lectura = new Scanner(System.in);
								rel = lectura.nextInt();

								if (rel < 0 || rel > 10000) {
									System.out.println("no puedes realizar depositos menor a 0 y mayo a 10000");
								} else if (rel > 0 || rel <= 10000) {
									sum = (int) (cliente.getDineroCuenta() + rel);

									cliente.setDineroCuenta(sum);

									System.out.println("saldo actualizado");

									System.out.println("Tu saldo en tu cuenta es:");
									System.out.println(imp.buscarxnumerocuenta(numCuenta).getDineroCuenta());
								}
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("error al realizar el deposito");
							}

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("hubun un error al buscar el cliente");
						}

						break;

					case 4:

						try {
							System.out.println("Ingrese el numero de cuenta: ");
							lectura = new Scanner(System.in);
							numCuenta = lectura.nextInt();

							System.out.println("Tu saldo en tu cuenta es:");
							System.out.println(imp.buscarxnumerocuenta(numCuenta).getDineroCuenta());

							try {
								int rel, res;
								System.out.println("ingrese la cantidad a retirar");
								lectura = new Scanner(System.in);
								rel = lectura.nextInt();

								if (rel > cliente.getDineroCuenta() || rel <=0 || rel >10000) {
									System.out.println("no tienes saldo sufisiente en tu cuenta o no puedes realizar retiros menores a 0 y mayores a 10000");
								} else if (rel < cliente.getDineroCuenta()) {
									res = (int) (cliente.getDineroCuenta() - rel);

									cliente.setDineroCuenta(res);

									System.out.println("saldo actualizado");

									System.out.println("Tu saldo en tu cuenta es:");
									System.out.println(imp.buscarxnumerocuenta(numCuenta).getDineroCuenta());
								}
							} catch (Exception e) {
								// TODO: handle exception
								System.out.println("error al realizar retiro");
							}

						} catch (Exception e) {
							// TODO: handle exception
							System.out.println("error al buscar el cliente");
						}

						
						break;

					case 5:
						System.out.println("hasta luego");
						break;
					}
				}
				
				

			} while (menuPrincipal < 6);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("hubo algun error introduce una opcion valida");
		}
		

	}

}
