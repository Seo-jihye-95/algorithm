package backjunTest19_queue;

class Node<T> {
	T data;
	Node<T> next;	// 다음 노드를 가리키는 역할을 하는 변수
 
	Node(T data) {
		this.data = data;
		this.next = null;
	}
}