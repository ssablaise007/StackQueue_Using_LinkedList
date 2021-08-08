package stakoperations;

	public class UC3MyStackTest {
		public static void main(String[] args) {

		INode myFirstNode = new MyNode<Integer>(70);

		INode mySecondNode = new MyNode<Integer>(30);

		INode myThirdNode = new MyNode<Integer>(56);



		MyStack myStck = new MyStack();

		myStck.push(myFirstNode);

		myStck.push(mySecondNode);

		myStck.push(myThirdNode);



		myStck.printStack();

		System.out.println("Size : " + myStck.size());

		System.out.println("IsFull : " + myStck.isFull());

		System.out.println("IsEmpty : " + myStck.isEmpty());



		System.out.println("Peek : " + myStck.peek().getKey());



		myStck.push(new MyNode<>(80));



		System.out.println("Pop-1 " + myStck.pop().getKey());

		System.out.println("Pop-2 " + myStck.pop().getKey());

		System.out.println("Pop-3 " + myStck.pop().getKey());



		System.out.println("Size : " + myStck.size());

		System.out.println("IsFull : " + myStck.isFull());

		System.out.println("IsEmpty : " + myStck.isEmpty());



		System.out.println("Pop-4 " + myStck.pop());



		}
		}
	
}
