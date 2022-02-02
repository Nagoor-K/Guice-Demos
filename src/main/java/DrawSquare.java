import javax.persistence.Entity;
import javax.persistence.Id;

import com.google.inject.Inject;

@Entity
public class DrawSquare implements DrawShape {
	@Id
	private String id;
	private String location;
	private int room;
	
	
	
	public String getId() {
  return id;}



  public void setId(String id) {
  this.id = id;}



  public String getLocation() {
  return location;}



  public void setLocation(String location) {
  this.location = location;}



  public int getRoom() {
  return room;}



  public void setRoom(int room) {
  this.room = room;}


  @Inject
  public DrawSquare(String id,String location,int room){
	  super();
	  this.id=id;
	  this.location=location;
	  this.room=room;
	  }



public void draw() {
		System.out.println("Drawing Square");
	}
}
