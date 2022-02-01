import com.google.inject.Provider;

public class SpellcheckerProvider implements Provider<spellchecker> {
	public spellchecker get() {
		String name="Nagoor Khan Patan";
		String company="Axelor";
		int age=21;
		spellchecker spellcheck=new spellcheckerimpl(name,company,age);
		
		return  spellcheck;
	}
}
