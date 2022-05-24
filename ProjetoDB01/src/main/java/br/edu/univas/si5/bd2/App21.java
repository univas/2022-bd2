package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.TipoCargo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App21 {
	public static void main(String[] args) {
		// cria um objeto de teste
		Cargo cargo = new Cargo();
		cargo.setCodigo(4);
		cargo.setNome("Estagiário");
		cargo.setSalario(1500);
		cargo.setType(TipoCargo.ESTAGIARIO);
		
		// obter uma instância do EntityManager
		EntityManager em;
		em = HibernateUtil.getEntityManager();
		
		// persistir o objeto (dentro de uma transação)
		em.getTransaction().begin();// inicia a transação
		em.persist(cargo);
		em.getTransaction().commit();// finaliza a transação
	}
}
