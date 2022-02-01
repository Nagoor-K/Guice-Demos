import com.google.inject.Inject;

public interface spellchecker {
	public void checkspelling();
}


class spellcheckerimpl implements spellchecker{
	private String name;
	private String company;
	private int age;
	
	@Inject
	public spellcheckerimpl(String name, String company, int age) {
    super();
    this.name = name;
    this.company = company;
    this.age = age;
  }
@Override
  public void checkspelling() {
		System.out.println("Inside spell checking");
		System.out.println(name);
		System.out.println(company);

		System.out.println(age);

	}
	
}
