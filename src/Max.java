
public class Max {
/** Return the maximum of two objects */
public static Object max
(
Object o1, Object o2
) {
if ((
(Comparable)o1
).compareTo(o2) > 0)
return o1;
else
return o2;
}
}
