import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class TextEditorModule extends AbstractModule {
	@Override
	   protected void configure() {} 

	   @Provides
	   public SpellChecker provideSpellChecker(){

	      String dbUrl = "jdbc:mysql://localhost:5326/emp";
	      String user = "user";
	      int timeout = 100;

	      SpellChecker SpellChecker = new SpellCheckerImpl(dbUrl, user, timeout);
	      return SpellChecker;
	   }
}
