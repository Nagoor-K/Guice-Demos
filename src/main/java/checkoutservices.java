import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

import com.google.inject.Inject;

@Qualifier
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Paypal {}

public class checkoutservices {
	final Discounts discounts;
@Inject
  public checkoutservices(@Paypal Discounts discounts) {
    this.discounts = discounts;
  }
	public int checkout(int totalamount) {
		
		return totalamount-discounts.getdiscount();
	}
}
