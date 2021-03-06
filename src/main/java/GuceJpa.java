import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuceJpa {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Injector injector=Guice.createInjector(new DrawModule());
	  
	  DrawSquare dsquare=injector.getInstance(DrawSquare.class);
	  
	  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("khan");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  em.getTransaction().begin();
	  
	  em.persist(dsquare);
	  
	  em.getTransaction().commit();
  }
}
