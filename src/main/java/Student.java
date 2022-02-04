import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String fname;
	private String lname;
	@OneToOne(targetEntity = Address.class)
	@JoinColumn(name = "adress")
	private Address adress;
	
  public int getId() {
  return id;}
  public void setId(int id) {
  this.id = id;}
  public String getFname() {
  return fname;}
  public void setFname(String fname) {
  this.fname = fname;}
  public String getLname() {
  return lname;}
  public void setLname(String lname) {
  this.lname = lname;}
  public Address getAdress() {
  return adress;}
  public void setAdress(Address adress) {
  this.adress = adress;}
}
