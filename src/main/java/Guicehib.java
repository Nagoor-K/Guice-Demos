import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Guicehib {
	@Inject
	private static EntityManagerFactory emf;
	private static EntityManager em;

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  Injector injector=Guice.createInjector(new persistenceModule());
	  em=emf.createEntityManager();
	  em.getTransaction().begin();
	  Student student=injector.getInstance(Student.class);
	  
	  

  }
}
