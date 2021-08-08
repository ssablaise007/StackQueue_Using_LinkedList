package stakoperations;
import java.util.Scanner;  
public class Stack {

	    int top;   
	    int maxsize = 5;  
	    int[] arr = new int[maxsize];  
	      
	      
	    boolean isEmpty()  
	    {  
	        return (top < 0);  
	    }  
	    Stack()  
	    {  
	        top = -1;  
	    }  
	    boolean push (Scanner sc)  
	    {  
	        if(top == maxsize-1)  
	        {  
	            System.out.println("Overflow !!");  
	            return false;  
	        }  
	        else   
	        {  
	            System.out.println("Enter Value");     //top=-1, top=0, a[0]=inserted_value1, top=1, a[1]=inserted_value.... 
	            int val = sc.nextInt();  
	            top++;  
	            arr[top]=val;  // arr[0]=10, arr[1]=20, arr[2]=30, arr[3]=40, arr[4]=50
	            System.out.println("Item pushed");  
	            return true;  
	        }  
	    }  
	    boolean pop ()  
	    {  
	        if (top == -1)  
	        {  
	            System.out.println("Underflow !!");  
	            return false;  
	        }  
	        else   
	        {  
	            top --;    // LIFO=> top=5, 4=> stack_values, top 3-> stack_values
	            System.out.println("Item popped");  
	            return true;  
	        }  
	    }  
	    void display ()  
	    {  
	        System.out.println("Printing stack elements .....");  
	        for(int i = top; i>=0;i--)  
	        {  
	            System.out.println(arr[i]);  
	        }  
	    }  
	}  
	