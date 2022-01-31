import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(Discounts.class).annotatedWith(Names.named("gpay")).to(festivaldiscount.class);
	}
}
