import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.inject.Inject;
@Entity
public class DrawRequet {
	@Id
	private String Name;
	private String com;
	@Embedded
	  private DrawShape d;
	
	public String getName() {
  return Name;}
  public void setName(String name) {
  Name = name;}
  public String getCom() {
  return com;}
  public void setCom(String com) {
  this.com = com;}
  public int getAge() {
  return age;}
  public void setAge(int age) {
  this.age = age;}
  public DrawShape getD() {
  return d;}
  public void setD(DrawShape d) {
  this.d = d;}
  private int age;
  
  
	
	@Inject
  public DrawRequet(DrawShape d) {
    super();
    this.d = d;
  }
	public void makeRequest() {
		d.draw();
	}
	
}
