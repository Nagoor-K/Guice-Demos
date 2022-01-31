import com.google.inject.Inject;

public class checkoutservices {
	final Discounts discounts;
@Inject
  public checkoutservices(Discounts discounts) {
    super();
    this.discounts = discounts;
  }
	public int checkout(int totalamount) {
		
		return totalamount-discounts.getdiscount();
	}
}
