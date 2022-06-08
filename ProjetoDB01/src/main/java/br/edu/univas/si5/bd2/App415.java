package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.entities.Usuario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App415 {

	public static void main(String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();
		Funcionario funcionario = em.find(Funcionario.class, 15);
		if (funcionario == null) {
			System.out.println("Funcionário 15 é null.");
			return;
		}
		System.out.println("Funcionario: " + funcionario);

		Usuario user = funcionario.getUsuario();
		System.out.println("Usuário: " + user);
	}
}
