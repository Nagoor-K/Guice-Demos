import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Providesmethod {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  Injector injector=Guice.createInjector(new checkModule());
	  
	  texteditor te=injector.getInstance(texteditor.class);
	  te.makespellcheck();
  }
}
