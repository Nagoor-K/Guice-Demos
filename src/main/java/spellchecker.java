import com.google.inject.ImplementedBy;
import com.google.inject.Inject;
import com.google.inject.name.Named;

@ImplementedBy(spellcheckerimpl.class)
public interface spellchecker {
	public void checkspelling();
}


class spellcheckerimpl implements spellchecker{
	@Override @calltracker
  public void checkspelling() {
		System.out.println("Inside spell checking");
	
	}
}