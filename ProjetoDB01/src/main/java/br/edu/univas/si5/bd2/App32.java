package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App32 {

	public static void main(String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();
		
		int pkCargo = 2;
		Cargo objCargo = em.find(Cargo.class, pkCargo);// busca o cargo pela pk
		if (objCargo != null) { // se achar, faz update
			objCargo.setNome("Gerente"); // modifica o nome e salário
			objCargo.setSalario(5000f);
			
			em.getTransaction().begin();
			em.merge(objCargo); // faz o update
			em.getTransaction().commit();
		} else {
			System.out.println("Cargo " + pkCargo + " não encontrado.");
		}
	}
}
