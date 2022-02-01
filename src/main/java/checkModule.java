import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class checkModule extends AbstractModule {
	@Override
	public void configure() {
		
	}
	@Provides
	public  spellchecker provideSpellchecker() {
		String name="Nagoor Khan";
		String company="Axelor";
		int age=21;
		spellchecker spellchecke=new spellcheckerimpl(name,company,age);
		return spellchecke;
	}
}
