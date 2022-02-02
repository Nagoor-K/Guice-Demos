import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.name.Named;

@ImplementedBy(spellcheckerimpl.class)
public interface spellchecker {
	public void checkspelling();
}


class spellcheckerimpl implements spellchecker{
	private String dburl="My data base postgresql";
	
	public spellcheckerimpl() {}
	
	@Inject(optional = true)
	public void setdburl(@Named("JDBC") String dburl) {
		this.dburl=dburl;
	}
@Override
  public void checkspelling() {
		System.out.println("Inside spell checking");
		System.out.println(dburl);
	}
	
}
