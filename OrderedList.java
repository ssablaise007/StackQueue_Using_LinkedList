package orderedList;

	
	public class OrderedList<T extends Comparable<T>> {

		INode<T> head;
		private int size;


		public void add(T value) {
		INode<T> newNode = new MyNode<T>(value);
		if (this.head == null) {
		head = newNode;
		size++;
		} else {
		if (value.compareTo(this.head.getKey()) < 0) {
		newNode.setNext(head);
		head = newNode;
		size++;
		return;
		}
		INode<T> currNode = head;
		INode<T> prevNode = head;
		if (null != currNode) {
		while ((null != currNode.getNext()) || (null != currNode.getKey())) {

		//match Condition
		if (value.compareTo(currNode.getKey()) <= 0) {
		prevNode.setNext(newNode);
		newNode.setNext(currNode);
		break;
		}
		prevNode = currNode;
		currNode = (INode<T>) currNode.getNext();
		if (currNode == null) {
		break;
		}
		}
		}
		prevNode.setNext(newNode);
		size++;
		}
		}


		public void remove(T value) {


		INode<T> currNode = head;
		INode<T> previousNode = head;


		if (currNode.getKey().compareTo(value) == 0) {
		head = (INode<T>) head.getNext();
		size--;
		return;
		}


		if (null != currNode) {
		while ((null != currNode.getNext()) || (null != currNode.getKey())) {
		if (currNode.getKey().compareTo(value) == 0) {
		previousNode.setNext(currNode.getNext());
		size--;
		break;
		}
		previousNode = currNode;
		currNode = (INode<T>) currNode.getNext();
		if (null == currNode) {
		return;
		}


		}
		}
		}


		public boolean search(T value) {
		int index = index(value);
		if (index >= 0) {
		return true;
		}
		return false;
		}


		public boolean isEmpty() {
		return this.size == 0;
		}


		public int size() {
		return this.size;
		}


		public int index(T value) {
		INode<T> currNode = head;
		int index = 0;
		if (null != currNode) {
		while ((null != currNode.getNext()) || (null != currNode.getKey())) {
		if (currNode.getKey().compareTo(value) == 0) {
		break;
		}
		currNode = (INode<T>) currNode.getNext();
		;
		if (null == currNode) {
		return -1;
		}
		index++;
		}
		}
		return index;
		}


		public T pop() {
		INode<T> currentNode = this.head;
		INode<T> previousNode = currentNode;
		while (currentNode.getNext() != null) {
		previousNode = currentNode;
		currentNode = (INode<T>) currentNode.getNext();
		}


		previousNode.setNext(null);
		size--;
		return (T) currentNode.getKey();
		}


		public T pop(int index) {
		if (head == null) {
		return null;
		}
		if (index == 0) {
		T key = head.getKey();
		head = (INode<T>) head.getNext();
		size--;
		return key;
		}
		int i = 0;
		INode currentNode = this.head;
		INode previousNode = currentNode;
		while ((null != currentNode.getNext()) || (null != currentNode.getKey())) {
		if (i == index) {
		previousNode.setNext(currentNode.getNext());
		size--;
		return (T) currentNode.getKey();
		}
		previousNode = currentNode;
		currentNode = (INode) currentNode.getNext();
		i++;
		}
		return null;
		}


		public void printNodes() {


		StringBuilder nodes = new StringBuilder("Node Keys : ");


		INode temp = this.head;
		while (temp != null) {
		nodes.append(temp.getKey());
		if (temp.getNext() != null) {
		nodes.append("->");
		}
		temp = (INode) temp.getNext();
		}
		System.out.println(nodes);
		}
		}

