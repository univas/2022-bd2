package br.edu.univas.si5.bd2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App61 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		String ql = "select f from Funcionario f where f.usuario.active = true";

		TypedQuery<Funcionario> queryFuncionario = em.createQuery(ql, Funcionario.class);

		List<Funcionario> funcionarios = queryFuncionario.getResultList();
		System.out.println("Funcionarios: " + funcionarios);
	}
}
