import com.google.inject.Inject;

public class texteditor {
	private spellchecker spellcheck;
@Inject
  public texteditor(spellchecker spellcheck) {
    this.spellcheck = spellcheck;
  }
public void makespellcheck() {
	spellcheck.checkspelling();
}
}
