import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.inject.Inject;
@Entity
public class SpellCheckerImpl implements SpellChecker {
	private String dbUrl;
	@Id
	   private String user;
	   private Integer timeout;

	   @Inject
	   public SpellCheckerImpl(String dbUrl, 
	      String user, 
	      Integer timeout){
	      this.dbUrl = dbUrl;
	      this.user = user;
	      this.timeout = timeout;
	   } 

	   @Override
	   public void checkSpelling() { 
	      System.out.println("Inside checkSpelling." );
	      System.out.println(dbUrl);
	      System.out.println(user);
	      System.out.println(timeout);
	   }
}
