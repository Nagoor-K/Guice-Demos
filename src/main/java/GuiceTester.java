import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceTester {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

	  Injector injector = Guice.createInjector(new TextEditorModule());
      TextEditor editor = injector.getInstance(TextEditor.class);
      editor.makeSpellCheck();
//      System.out.print(editor);
      
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("khan");
	  
	  EntityManager em=emf.createEntityManager();
	  
	  em.getTransaction().begin();
	  
	  em.persist(editor);
	  
	  
	  em.getTransaction().commit();
  }
}
