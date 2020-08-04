
public class StackOfObjects {
    private Node first;        // top of stack
    int size = 0;
    // linked list node helper data type
    private class Node {
        private Object item;
        private Node next;
    }

    // create an empty stack
    public StackOfObjects() {
        first = null;
    }
    public int getSize()
    {
    	return size;
    }

    // is the stack empty?
    public boolean isEmpty() { return (first == null); }

    // add an element to the stack
    public void push(Object item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        size++;
    }

    // delete and return the most recently added element
    public Object pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        Object item = first.item;      // save item to return
        first = first.next;  
        size--;// delete first node
        return item;                   // return the saved item
    }

    public Object peep()
	{
		 if (isEmpty()) throw new RuntimeException("Stack underflow");
		 Object item = first.item;
		 return item;
	}
    
    public static int sumElements(Object stack1)
	{
		int sum = 0;
		int i = 0;
		int[] temp = new int[4];
		
		//if (isEmpty()) throw new RuntimeException("Stack underflow");
       while(!((StackOfObjects) stack1).isEmpty())
       {
		Object item = ((StackOfObjects) stack1).pop();
		temp[i] = (int) item;
        sum += (int)item;
        i++;
       }
	((StackOfObjects) stack1).push(temp[3]);
	((StackOfObjects) stack1).push(temp[2]);
	((StackOfObjects) stack1).push(temp[1]);
	((StackOfObjects) stack1).push(temp[0]);
        return sum;
        
	}

    // a test client
    public static void main(String[] args) {
        StackOfObjects stack = new StackOfObjects();
        stack.push("TEST.");
      //System.out.println(stack.getSize());
        stack.push("THIS");
       // System.out.println(stack.getSize());
        System.out.println("Test to see if pop works: " + stack.pop());
        //System.out.println(stack.getSize());
        stack.push("A");
        System.out.println("Test to see if peep works: " + stack.peep());
        //System.out.println(stack.getSize());
        stack.push("IS");
        //System.out.println(stack.getSize());
        while (!stack.isEmpty()) {
            String s = (String) stack.pop();
            System.out.println(s);
          //  System.out.println(stack.getSize());
        }
        
        StackOfObjects stack1 = new StackOfObjects();
        stack1.push(4);
        stack1.push(3);
        stack1.push(2);
        System.out.println("\nTest to see if peep works: " + stack1.peep());
        stack1.push(1);
        System.out.println("Sum = " + sumElements(stack1));
        while (!stack1.isEmpty()) {
            int s = (int) stack1.pop();
            System.out.println(s);
        }
        
        StackOfObjects stack2 = new StackOfObjects();
        //stack2.push();
    }
}

