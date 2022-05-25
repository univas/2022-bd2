package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Department;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App25 {

	public static void main(String[] args) {
		
		Department dep = new Department();
		dep.setName("Desenvolvimento");
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(dep);
		em.getTransaction().commit();
	}
}
