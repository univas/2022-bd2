package br.edu.univas.si5.bd2;

import java.util.Set;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App513 {

	public static void main(String[] args) {
		EntityManager em = HibernateUtil.getEntityManager();
		
		Cargo cargo = em.find(Cargo.class, 3);//Tester
		if(cargo == null) {
			System.out.println("Cargo 3 " + " é null.");
			return;
		}
		System.out.println("Cargo: " + cargo);
	
		Set<Funcionario> funcionarios = cargo.getFuncionarios();
		System.out.println("Funcionarios: " + funcionarios);	
	}
}
