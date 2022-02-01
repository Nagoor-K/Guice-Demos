import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(String.class).annotatedWith(Names.named("default discount")).toInstance("you will get default discount of 120 rupees");
	}
}
