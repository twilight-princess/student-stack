// Honor Pledge: I pledge that I have neither 
// given nor receieved any help on this assignment.
// 
//
// daelevan

public class Stack<E> 
{
	// points to the top of the stack
	private Integer top; 
	// the size of our stack
	private Integer size;
	// array to emulate the stack
	 private E [] stack;
	
	// Define Constructor(s)/Methods here
	public Stack()
	{
		// Default size = 10
		size = 11; 
		stack = (E[]) new Object[size];	
	// Initialize the value of the top position
		top = -1; 
	}
	
	public Stack(Integer stackSize)
	{
		if(stackSize>0)
		{
			size = stackSize;
		}else{
			System.out.println("Invalid stack size!");
			System.out.println("Using default size of 10");
			
			size = 11;
		}
		top = -1;
		stack = (E[]) new Object[size];	
	}
	
	// checks to see is the stack is empty
	public boolean isEmpty()
	{
		return top == -1;
	}
	// checks to see if the stack is full
	public boolean isFull()
	{
		return top == size-1;
	}
	// retrieves the top data element of the stack w/o removal
	public E getTop()
	{
		return stack[top];
	}
	// pushes (stores) an element on the stack
	public void push(E dataElement)
	{
		// check to see if the stack is full, if not push the element
		if(isFull())
		{
			// we should throw an exception here
			System.out.println("Your Stack is full!");
		}else{
			// "push" the data element onto the stack
			stack[++top] = dataElement;
		}	
	}
	// removes (accesses) an element from the stack
	public E pop()
	{
		// check to see if stack is empty 
		if(!isEmpty())
		{
			// store the value of the data element
			E value = stack[top];
			// move pointer by decrimenting it
			top = top-1;
			// we should also null the value
			// return the popped data element
			return value;
		}else{
			// we should throw an exception here
			//return null;		
				System.out.println("Stack is empty - cannot pop!"); 
		}
	return null;
	}
	public void displayStack()
	{
		// loop throough stack array
		// print out values
		for(int i=0; i<=top; i++)
		{
			System.out.println(stack[i] + " , ");
		}
	}
	public E [] getStack()
	{
		return (E[]) stack;	
	}
}
