import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class Providesmethod {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
	  
	  Injector injector=Guice.createInjector(new checkModule());
	  
	  texteditor te=injector.getInstance(texteditor.class);
	  te.makespellcheck();
	 
	  texteditor te1=injector.getInstance(texteditor.class);
	  te1.makespellcheck();
	  
	   System.out.println(te==te1);
  }
}
