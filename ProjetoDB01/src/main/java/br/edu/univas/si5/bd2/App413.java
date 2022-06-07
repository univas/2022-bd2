package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App413 {

	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		user.setUsername("User Test");
		user.setPassword("123456");
		user.setActive(true);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jair");
		funcionario.setSexo("M");
		funcionario.setUsuario(user);
		
		EntityManager em = HibernateUtil.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(user);
		em.persist(funcionario);
		em.getTransaction().commit();
		
		System.out.println("Código do funcionario: " + funcionario.getRegistro());
	}
}
