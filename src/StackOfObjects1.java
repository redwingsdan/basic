import StackOfObjects.Node;


public class StackOfObjects1 {
	private Object [] a1 = new Object[1];
	int size = 1;
	StackOfObjects1()
	{
		a1 = new Object [2];
		size = a1.length;
	}
	   public boolean isEmpty() { return (first == null); }

	    // add an element to the stack
	    public void push(Object item) {
	        Node oldfirst = first;
	        first = new Node();
	        first.item = item;
	        first.next = oldfirst;
	    }

	    // delete and return the most recently added element
	    public Object pop() {
	        if (isEmpty()) throw new RuntimeException("Stack underflow");
	        Object item = first.item;      // save item to return
	        first = first.next;            // delete first node
	        return item;                   // return the saved item
	    }
	    
	public Object peep()
	{
		 if (isEmpty()) throw new RuntimeException("Stack underflow");
		 
	}
	
}
