package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App33 {

	public static void main(String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();

		int pkCargo = 1;
		Cargo objCargo = em.find(Cargo.class, pkCargo);// busca o cargo pela pk
		if (objCargo != null) { // se achar, faz delete
			em.getTransaction().begin();
			em.remove(objCargo); // remove o cargo
			em.getTransaction().commit();
		} else {
			System.out.println("Cargo " + pkCargo + " não encontrado.");
		}
	}
}
