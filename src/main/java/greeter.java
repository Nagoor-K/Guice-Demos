import javax.persistence.Entity;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
class DemoModule extends AbstractModule{
	@Provides
	static Integer provideCount() {
		return 3;
	}
	
	@Provides
	static String provideMessage() {
		return "Hello world";
	}
}
public class greeter {
	private String message;
	private int count;
	@Inject
	greeter(String message,int count){
		this.message=message;
		this.count=count;
	}
	void sayHello() {
		for(int j=0;j<count;j++) {
			System.out.println(message);
		}
	}
}
