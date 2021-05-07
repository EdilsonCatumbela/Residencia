package Models;

import java.util.Scanner;

public class CadastroResidencia {
	private static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);

		Residencia residencia = new Residencia();
		System.out.println("FORMULARIO DO ATESTADO DE RESIDENCIA");
		System.out.println("Informe o nome do Administrador");
		residencia.setNomeAdmin(scan.nextLine());
		System.out.println("Informe o nome da pessoa");
		residencia.setNomePessoa(scan.nextLine());
		System.out.println("Informe o número da casa");
		residencia.setnCasa(scan.nextLine());
		System.out.println("Informe o Bairro");
		residencia.setBairro(scan.nextLine());
		System.out.println("Informe o nome do distrito ou comuna");
		residencia.setNomeDistrito(scan.nextLine());
		System.out.println("Informe o Município");
		residencia.setMunicipio(scan.nextLine());
		System.out.println("Informe a Província");
		residencia.setProvincia(scan.nextLine());
		System.out.println("Informe o efeito");
		residencia.setEfeito(scan.nextLine());
		
		
		
		residencia.print();
		
		
		

	}

}
