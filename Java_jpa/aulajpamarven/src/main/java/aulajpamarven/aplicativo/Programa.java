package aulajpamarven.aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

//		Pessoa p1 = new Pessoa(null,"Carlos da Silva", "carlos@gmail.com");
//		Pessoa p2 = new Pessoa(null,"Joaquim Torres", "joaquin@gmail.com");
//		Pessoa p3 = new Pessoa(null,"Ana Maria", "ana@gmail.com");

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
		
//      incluir os dados no banco de dados.		
//		em.getTransaction().begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		em.getTransaction().commit();
//		System.out.println("Pronto");
//		em.close();
//		emf.close();
		
//		buscar dados no banco de dados		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
//		EntityManager em = emf.createEntityManager();
		
//		Pessoa p = em.find(Pessoa.class, 2);
		
//		System.out.println(p);
//		System.out.println("Pronto");
//		em.close();
//		emf.close();

//		removendo dados no banco de dados
//		as entidades são monitoradas pelo hibernate para deletar uma pessoa, por exemplo
//		ou a pessoa foi adicionada e deletada sem fechar o banco de dados ou tem que
//		buscar primeiro antes de deletar		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto");
		em.close();
		emf.close();
}
}
