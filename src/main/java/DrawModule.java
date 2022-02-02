import com.google.inject.AbstractModule;

public class DrawModule extends AbstractModule{
	@Override
	public void configure() {
		bind(DrawShape.class).to(DrawSquare.class);
	}
}
