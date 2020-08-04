public class ComparableRectangle extends Rectangle
implements Comparable {
/** Construct a ComparableRectangle with specified properties */
public ComparableRectangle(double width, double height) {
super(width, height);
}
/** Implement the compareTo method defined in Comparable */
public int compareTo(Object o) {
if (getArea() > ((ComparableRectangle)o).getArea())
return 1;
else if (getArea() < ((ComparableRectangle)o).getArea())
return -1;
else
return 0;
}


public static void main(String[] args) {
ComparableRectangle rectangle1 = new ComparableRectangle(2, 5);
ComparableRectangle rectangle2 = new ComparableRectangle(3, 6);
System.out.println((Object)Max.max(rectangle1, rectangle2));
System.out.println("Bigger area is: " +(Object)((ComparableRectangle) Max.max(rectangle1, rectangle2)).getArea());
}

}
