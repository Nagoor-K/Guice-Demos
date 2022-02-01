import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

public class checkModule extends AbstractModule {
	@Override
	public void configure() {
		bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("My Data Base");;
	}
	
}
