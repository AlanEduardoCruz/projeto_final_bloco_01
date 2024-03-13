package ecommerce.repository;

import ecommerce.model.Bicicleta;

public interface BicicletaRepository {

	// Operações CRUD da Bicicleta

	public void cadastrar(Bicicleta bicicleta);

	public void listarTodas();

	public void atualizar(Bicicleta bicicleta);

	public void deletar(String modelo);

}
