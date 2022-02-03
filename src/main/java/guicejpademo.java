import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class guicejpademo {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  Injector injector=Guice.createInjector(new MyModule());
	  DrawSquare drawshape=injector.getInstance(DrawSquare.class);
	  drawshape.setId(101);
	  drawshape.setName("Square");
	  drawshape.setLen(10);
	  drawshape.draw();
	  
	  EntityManagerFactory emf=Persistence.createEntityManagerFactory("khan");

	  EntityManager em=emf.createEntityManager();

	  em.getTransaction().begin();

	  em.persist(drawshape);

	  em.getTransaction().commit();
	  
  }
}
