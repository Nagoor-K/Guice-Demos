import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class checkModule extends AbstractModule {
	@Override
	public void configure() {
		bind(spellchecker.class).toProvider(SpellcheckerProvider.class);
	}
	
}
