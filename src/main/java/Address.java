import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private int dno;
	private String city;
	private String state;
	
	
	
	
	
	
	
  public Address() {
  }
public Address(int dno, String city, String state) {
    super();
    this.dno = dno;
    this.city = city;
    this.state = state;
  }
public int getDno() {
  return dno;}
  public void setDno(int dno) {
  this.dno = dno;}
  public String getCity() {
  return city;}
  public void setCity(String city) {
  this.city = city;}
  public String getState() {
  return state;}
  public void setState(String state) {
  this.state = state;}
	
	
}
