import com.google.inject.Inject;

public class DrawReq {
	private DrawShape drawshape;
 @Inject
  public DrawReq(DrawShape drawshape) {
    super();
    this.drawshape = drawshape;
  }
	
  public void makereq() {
	  drawshape.draw();
  }
}
