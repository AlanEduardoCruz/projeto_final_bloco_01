package ecommerce.controller;

import java.util.ArrayList;
import ecommerce.repository.BicicletaRepository;

import ecommerce.model.Bicicleta;
import ecommerce.repository.BicicletaRepository;

public class Controller implements BicicletaRepository {

	private ArrayList<Bicicleta> listaProdutos = new ArrayList<Bicicleta>();
	int numero = 0;

	@Override
	public void cadastrar(Bicicleta bicicleta) {
		listaProdutos.add(bicicleta);
		System.out.println("\nA Bicicleta número: " + bicicleta.getNumero() + " foi castrada com sucesso!");

	}

	@Override
	public void listarTodas() {
		for (var item : listaProdutos) {
			item.visualizar();
		}

	}

	@Override
	public void atualizar(Bicicleta bicicleta) {
		var buscarNumero = buscarNaCollection(bicicleta.getNumero());
		if (buscarNumero != null) {
			listaProdutos.set(listaProdutos.indexOf(buscarNumero), bicicleta);
			System.out.println("Bicicleta atualizada com sucesso: " + bicicleta.getNumero());
		} else {
			System.out.println("O numero nao foi encontrado: " + bicicleta.getNumero());
		}
	}

	@Override
	public void deletar(int numero) {

		var buscarNumero = buscarNaCollection(numero);
		if (buscarNumero != null) {
			if (listaProdutos.remove(buscarNumero) == true) {
				System.out.println("Bicicleta excluida com sucesso!" + numero);
			}

		} else {
			System.out.println("O numero nao foi encontrado: " + numero);
		}

	}

	public int gerarNumero() {
		return ++numero;
	}

	public Bicicleta buscarNaCollection(int numero) {
		for (var buscarNumero : listaProdutos) {
			if (buscarNumero.getNumero() == numero) {
				return buscarNumero;
			}
		}
		return null;
	}

}
