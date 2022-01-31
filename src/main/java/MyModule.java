import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(Discounts.class).to(festivaldiscount.class);
		bind(festivaldiscount.class).to(normaldiscount.class);
	}
}
