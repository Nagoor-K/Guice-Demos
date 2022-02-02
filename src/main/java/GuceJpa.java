import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuceJpa {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Injector injector=Guice.createInjector(new DrawModule());
	  
	  DrawRequet drequest=injector.getInstance(DrawRequet.class);
	  drequest.setName("Nagoor");
	  drequest.setCom("Axelor");
	  drequest.setAge(21);
	  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("khan");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  em.getTransaction().begin();
	  
	  em.persist(drequest);
	  
	  
	  em.getTransaction().commit();
  }
}
