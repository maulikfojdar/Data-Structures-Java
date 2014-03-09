package stacks;

public class StackImplementation {
	
	private int stackSize;
	private int[] stackArray;
	private int top;
	
	public StackImplementation(int size){
		
		this.stackSize = size;
		this.stackArray = new int[stackSize];
		this.top = -1;
	}
	
	public void push(int element) throws Exception{
		if(isFull(stackArray)){
			throw new Exception("Stack is full. Element not inserted.");
		}
		stackArray[++top] = element;
		System.out.println("Element inserted: "+element);	
	}
	
	public int pop() throws Exception{
		if(isEmpty(stackArray)){
			throw new Exception("Stack is empty. No element popped out.");
		}
		System.out.println("Removed element is: "+top);
		int temp = top--;
		return temp;
	}
	
	public int peek(){
		return stackArray[top];
	}

	public boolean isFull(int[] stackArray2) {
		
		return (top==stackSize-1);
	}
	
	public boolean isEmpty(int[] stackArray2) {
		
		return (top<0);
	}
	
	public static void main(String[] args){
		 StackImplementation stack = new StackImplementation(5);
	        try {
	            stack.push(4);
	            stack.push(8);
	            stack.push(3);
	            stack.push(89);
	            stack.pop();
	            stack.push(34);
	            stack.push(45);
	            stack.push(78);
	            stack.push(33);
	            stack.push(33);
	            stack.peek();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        try {
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	            stack.pop();
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }
		
	}
	
	
