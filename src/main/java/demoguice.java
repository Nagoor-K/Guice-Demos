import com.google.inject.Guice;
import com.google.inject.Injector;


public class demoguice {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

	  Injector injector=Guice.createInjector(new MyModule());
	  checkoutservices cos=injector.getInstance(checkoutservices.class);
	  cos.checkout();
  }
}
