package linkedList;

public class UnOrderedList <T extends Comparable<T>> {


public INode<T> head;
public INode<T> tail;


private int size;


// Default Constructor
public UnOrderedList() {


}


public void add(T value) {


INode<T> node = new MyNode<T>(value);
if (this.head == null) {
this.head = node;
}
if (this.tail == null) {
this.tail = node;
} else {
INode<T> temp = head;
this.head = node;
this.head.setNext(temp);
}
size++;
}


public void append(T value) {
INode<T> newNode = new MyNode<>(value);
if (this.head == null) {
this.head = newNode;
}
if (this.tail == null) {
this.tail = newNode;
} else {
this.tail.setNext(newNode);
this.tail = newNode;
}


size++;
}


public boolean remove(T value) {


INode<T> currNode = head;
INode<T> previousNode = head;


if (head.getKey().compareTo((StringBuilder) value) == 0) {
head = head.getNext();
size--;
return true;
}


if (null != currNode) {
while ((null != currNode.getNext()) || (null != currNode.getKey())) {

//match condition
if (currNode.getKey().compareTo((StringBuilder) value) == 0) {
previousNode.setNext(currNode.getNext());
//In case of Last element
if (currNode == this.tail) {
this.tail = previousNode;
}
size--;
return true;

}
previousNode = currNode;
currNode = currNode.getNext();
if (null == currNode) {
return false;
}


}
}
return false;
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


public  int index(T value) {
INode<T> currNode = (INode<T>) head;
int index = 0;
if (null != currNode) {
//Traversing
while ((null != currNode.getNext()) || (null != currNode.getKey())) {
//Match condition
if (currNode.getKey().compareTo((StringBuilder) value) == 0) {
break;
}
currNode = currNode.getNext();
if (null == currNode) {
return -1;
}
index++;
}
}
return index;
}


public T pop() {


INode<T> temp = this.head;
while (temp.getNext() != this.tail) {
temp = temp.getNext();
}
this.tail = temp;
temp = temp.getNext();
tail.setNext(null);
size--;
return (T) temp.getKey();
}


public T pop(int index) {
if (head == null) {
return null;
}
if (index == 0) {
T key = (T) head.getKey();
head = head.getNext();
size--;
return key;
}
int i = 0;
INode<T> currentNode = this.head;
INode<T> previousNode = currentNode;
while ((null != currentNode.getNext()) || (null != currentNode.getKey())) {
//match the index
if (i == index) {
previousNode.setNext(currentNode.getNext());
size--;
return (T) currentNode.getKey();
}
previousNode = currentNode;
currentNode = currentNode.getNext();
i++;
}
return null;
}


public void insert(int index, T value) {
INode<T> newNode = new MyNode<>(value);
if (index == 0) {
newNode.setNext(head);
head = newNode;
size++;
return;
} else {
INode<T> nodeAtPreviousIndex = head;
for (int i = 0; i < index - 1; i++) {
nodeAtPreviousIndex = nodeAtPreviousIndex.getNext();
//If the element we are trying insert at the tail position
if(i == (index - 2)) {
nodeAtPreviousIndex.setNext(newNode);
tail = newNode;
size++;
return;
}
}
newNode.setNext(nodeAtPreviousIndex.getNext());
nodeAtPreviousIndex.setNext(newNode);

size++;
}
}


public void printNodes() {


StringBuilder nodes = new StringBuilder("Node Keys : ");


INode<T> temp = this.head;
while (temp != null) {
nodes.append(temp.getKey());
if (temp != tail) {
nodes.append("->");
}
temp = temp.getNext();
}
System.out.println(nodes);
}

public T get(int index) {
if (head == null) {
return null;
}
INode<T> currNode = head;
int i = 0;
if (null != currNode) {
while ((null != currNode.getNext()) || (null != currNode.getKey())) {
if (i == index) {
return (T) currNode.getKey();
}
currNode = currNode.getNext();
i++;
}
}
return null;
}
}