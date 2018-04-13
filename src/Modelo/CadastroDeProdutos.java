package Modelo;

import java.util.ArrayList;
import java.util.List;

public class CadastroDeProdutos {
	private static final String NomeProduto = null;
	private static String NomeDoProduto;
	private static float ValorUnitario;
	private static Integer QuantidadeEstoque;
	private static float ValorTotal;
	private static List<String> listaProdutos = new ArrayList<String>();
	
	public static String getNomeProduto() {
		return NomeDoProduto;
	}

	public static void setNomeProduto(String nomeProduto) {
		NomeDoProduto = nomeProduto;
	}

	public static float getValorUnitario() {
		return ValorUnitario;
	}

	public static void setValorUnitaio(float valorUnitario) {
		CadastroDeProdutos.ValorUnitario = valorUnitario;
	}

	public static Integer getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}

	public static void setQuantidadeEstoque(Integer quantidadeEstoque) {
		CadastroDeProdutos.QuantidadeEstoque = quantidadeEstoque;
	}

	public static float getValorTotal() {
		return ValorTotal;
	}

	public static void setValorTotal(float valorTotal) {
		CadastroDeProdutos.ValorTotal = valorTotal;
	}

	public static List<String> getListaProdutos() {
		return listaProdutos;
	}

	public static void setListaProdutos(List<String> listaProdutos) {
		CadastroDeProdutos.listaProdutos = listaProdutos;
	}

	private static void calcularValorTotal() {
		ValorTotal = (QuantidadeEstoque * ValorUnitario);
	}
	
	public static void cadastrar() {
		calcularValorTotal();
		listaProdutos.add("\nProduto:" + NomeDoProduto + "\nValor Unitário:" + ValorUnitario + "\nQuatidade em Estoque: "
				+ QuantidadeEstoque + "\nValor total:" + ValorTotal + "\n");
	}

}
