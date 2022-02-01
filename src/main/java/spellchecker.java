import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.name.Named;

@ImplementedBy(spellcheckerimpl.class)
public interface spellchecker {
	public void checkspelling();
}


class spellcheckerimpl implements spellchecker{
	private String dburl;
	
	public spellcheckerimpl() {}
	
	@Inject
	public void setdburl(@Named("JDBC") String dburl) {
		this.dburl=dburl;
	}
@Override
  public void checkspelling() {
		System.out.println("Inside spell checking");
		System.out.println(dburl);
	}
	
}
