import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule{
	@Override
	public void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
	}
}
