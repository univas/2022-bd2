package br.edu.univas.si5.bd2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App34 {

	public static void main(String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();
		String ql = "select c from Cargo c"; // define a consulta
		
		TypedQuery<Cargo> query = em.createQuery(ql, Cargo.class); // cria a query
		List<Cargo> cargos = query.getResultList();// executa a consulta
		System.out.println("Cargos: " + cargos); // imprimir os cargos
	}
}
