package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App26 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jair");
		funcionario.setSexo("M");
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
		
		System.out.println("Código do funcionario: " + funcionario.getRegistro());
	}
}
