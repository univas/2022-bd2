package br.edu.univas.si5.bd2;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App62 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();

		String ql = "select f from Funcionario f "
				+ " where f.usuario.active = true AND f.cargo.nome = :nome_cargo";

		//Parte 1
		TypedQuery<Funcionario> queryFuncionario = em.createQuery(ql, Funcionario.class);
		queryFuncionario.setParameter("nome_cargo", "QA");

		List<Funcionario> funcionarios = queryFuncionario.getResultList();
		System.out.println("Funcionarios: " + funcionarios);
		
		//Parte 2
		String qlCargos = "select distinct f.cargo from Funcionario f" + 
				" where f.usuario.active = true";
		TypedQuery<Cargo> queryCargo = em.createQuery(qlCargos, Cargo.class);
		
		List<Cargo> cargos = queryCargo.getResultList();
		System.out.println("Cargos: " + cargos);
	}
}
