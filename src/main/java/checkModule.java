import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;

public class checkModule extends AbstractModule {
	@Override
	public void configure() {
		bind(spellchecker.class).to(spellcheckerimpl.class);
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(calltracker.class), new calltrackservices());
	}
	
}
