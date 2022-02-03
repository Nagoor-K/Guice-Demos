import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DrawSquare implements DrawShape{
	@Id
	private int id;
	private String name;
	private int len;
	
	public int getId() {
  return id;}

  public void setId(int id) {
  this.id = id;}

  public String getName() {
  return name;}

  public void setName(String name) {
  this.name = name;}

  public int getLen() {
  return len;}

  public void setLen(int len) {
  this.len = len;}

  public void draw() {
		System.out.println("Drawing the Square.....");
	}
}
