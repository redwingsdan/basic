
public class StackOfIntegers extends StackOfObjects {

	public int sumElements(Object stack1)
	{
		int sum = 0;
		Object temp = null;
		Object temp1 = null;
		Object temp2 = null;
		Object temp3 = null;
		if (isEmpty()) throw new RuntimeException("Stack underflow");
       while(!((StackOfObjects) stack1).isEmpty())
       {
		Object item = ((StackOfObjects) stack1).pop();
		temp = item;
        sum += (int)item;
        temp1 = temp;
        temp2 = temp1;
        temp3 = temp2;
       }
	((StackOfObjects) stack1).push(temp3);
	((StackOfObjects) stack1).push(temp2);
	((StackOfObjects) stack1).push(temp1);
	((StackOfObjects) stack1).push(temp);
        return sum;
        
	}
}