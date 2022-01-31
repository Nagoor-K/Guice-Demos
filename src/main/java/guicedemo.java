import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class guicedemo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  
	  Injector injector=Guice.createInjector(new DemoModule());
	  greeter g=injector.getInstance(greeter.class);
	  g.say();
	  

//	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("khan");
//	  
//	  EntityManager em=emf.createEntityManager();
//	  
//	  em.getTransaction().begin();
//	  
//	  
//	  
//	  
//	  em.getTransaction().commit();
	  
	  
	  
	  
  }
}
