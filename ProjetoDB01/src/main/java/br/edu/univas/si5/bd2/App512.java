package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App512 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		Cargo cargo = em.find(Cargo.class, 3);//Tester
		if(cargo == null) {
			System.out.println("Cargo 3 " + " é null.");
			return;
		}

		Usuario user = em.find(Usuario.class, "User Test");
		if(user == null) {
			System.out.println("Usuário \"User Test\" " + " é null.");
			return;
		}
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jonas");
		funcionario.setSexo("M");
		
		funcionario.setUsuario(user);
		funcionario.setCargo(cargo);
		
		em.getTransaction().begin();
		em.persist(user);
		em.persist(funcionario);
		em.getTransaction().commit();
		
		System.out.println("Código do funcionario: " + funcionario.getRegistro());
	}
}
