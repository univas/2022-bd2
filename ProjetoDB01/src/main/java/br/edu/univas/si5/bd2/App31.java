package br.edu.univas.si5.bd2;

import javax.persistence.EntityManager;

import br.edu.univas.si5.bd2.entities.Cargo;
import br.edu.univas.si5.bd2.entities.Department;
import br.edu.univas.si5.bd2.entities.Funcionario;
import br.edu.univas.si5.bd2.utils.HibernateUtil;

public class App31 {

	public static void main(String[] args) {

		EntityManager em = HibernateUtil.getEntityManager();
		Cargo objCargo = em.find(Cargo.class, 1); // busca cargo com pk 1
		System.out.println("Cargo: " + objCargo);
		
		Department objDep = em.find(Department.class, 1);// busca dep com pk 1
		System.out.println("Departamento: " + objDep);
		
		Funcionario objFun = em.find(Funcionario.class, 1);// busca func com pk 1
		if (objFun == null) {
			System.out.println("Não há funcionário com código 1. objFun is null.");
		} else {
			System.out.println("Funcionario: " + objFun);
		}
	}
}
