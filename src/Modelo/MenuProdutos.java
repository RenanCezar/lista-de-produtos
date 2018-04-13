package Modelo;

import java.util.Scanner;

public class MenuProdutos {
	static CadastroDeProdutos novoCadastro = new CadastroDeProdutos();
	static Scanner opMenu = new Scanner(System.in);
	static Scanner Entrada = new Scanner(System.in);
	static Integer ValorMenu = -1;
	static String Produto;
	static float Valor;
	static Integer Estoque;

	public static void main(String[] args) {	
		while (ValorMenu != 0) {
			if (ValorMenu == 1) {
				receberValores();
				novoCadastro.cadastrar();
				chamarMenu();
			}else if (ValorMenu == 2) {
				System.err.println(CadastroDeProdutos.getListaProdutos());
				chamarMenu();
			 }else if (ValorMenu == 3) {
				System.exit(0);
			 }else {
				chamarMenu(); 		
			 }
		}
	}
	
	private static void receberValores() {
		System.out.println("INFORME O NOME DO PRODUTO:");
		Produto = Entrada.next();
		CadastroDeProdutos.setNomeProduto(Produto);
		
		System.out.println("INFORME O VALOR UNITÁRIO DO PRODUTO:");
		Valor = Entrada.nextFloat();
		CadastroDeProdutos.setValorUnitaio(Valor);
		
		System.out.println("INFORME A QUANTIDADE DO PRODUTO EM ESTOQUE:");
		Estoque = Entrada.nextInt();
		CadastroDeProdutos.setQuantidadeEstoque(Estoque);
	}
	
	private static void chamarMenu() {
		System.err.println("**********************");
		System.err.println("MENU");
		System.err.println("1:CADASTRAR UM PRODUTO");
		System.err.println("2:IMPRIMIR LISTA DE PRODUTOS CADASTRADOS");
		System.err.println("3:SAIR");
		ValorMenu = opMenu.nextInt();
	}
}
