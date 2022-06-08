package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App414 {

	public static void main(String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();

		Usuario user = em.find(Usuario.class, "User Test");
		if (user == null) {
			System.out.println("Usuário \"User Test\" " + " é null.");
			return;
		}
		System.out.println("Usuário: " + user);

		Funcionario funcionario = user.getFuncionario();

		System.out.println("Funcionario: " + funcionario);
	}
}
