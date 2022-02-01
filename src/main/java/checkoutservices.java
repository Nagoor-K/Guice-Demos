import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class checkoutservices {
	private String defaultdiscount;
@Inject
  public checkoutservices(@Named("default discount")String defaultdiscount) {
    this.defaultdiscount = defaultdiscount;
  }
	public void checkout() {
		
		System.out.println(defaultdiscount);
	}
}
