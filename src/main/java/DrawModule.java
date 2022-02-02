import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class DrawModule extends AbstractModule{
	@Override
	public void configure() {
	}
	@Provides
	public DrawShape provideDrawShape() {
		String id="102";
		String location="Markapur";
		int room=120;
		DrawShape drawsquare=new DrawSquare(id, location, room);
		return drawsquare;
	}
}
