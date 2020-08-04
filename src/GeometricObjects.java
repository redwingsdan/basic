public abstract class GeometricObjects implements Comparable {
private String color = "white";
private boolean filled;
private java.util.Date dateCreated;
protected GeometricObjects() {
dateCreated = new java.util.Date();
}
protected GeometricObjects(String color, boolean filled) {
dateCreated = new java.util.Date();
this.color = color;
this.filled = filled;
}
public String getColor() { return color; }
public void setColor(String color) { this.color = color; }
public boolean isFilled() { return filled; }
public void setFilled(boolean filled) { this.filled = filled; }
public java.util.Date getDateCreated() { return dateCreated; }
public String toString() {
return "created on " + dateCreated + "\ncolor: " + color +
" and filled: " + filled + "\narea :";
}

//public static GeometricObject max(GeometricObject o1, GeometricObject o2)
//{
//	if(((Comparable) o1).compareTo(o2) > 0)
//		return o1;
//	else 
//		return o2;
//}
}

