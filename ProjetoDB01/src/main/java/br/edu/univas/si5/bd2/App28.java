package br.edu.univas.si5.bd2;

import java.util.Date;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App28 {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jonas");
		funcionario.setSexo("M");
		funcionario.setNascimento(new Date());
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(funcionario);
		em.getTransaction().commit();
		
		System.out.println("Código do funcionario: " + funcionario.getRegistro());
	}
}
