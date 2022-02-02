import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.inject.Inject;
public class DrawRequet {
  
	
  public DrawRequet(DrawShape d) {
    super();
    this.d = d;
  }
	public void makeRequest() {
		d.draw();
	}
	
}
