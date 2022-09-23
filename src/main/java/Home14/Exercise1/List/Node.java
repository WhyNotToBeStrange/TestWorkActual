package Home14.Exercise1.List;

public class Node<A> {
    private A value;
    private Node<A> next;

    public Node(A value, Node<A> next) {
        this.value = value;
        this.next = next;
    }

    public A getValue() {
        return value;
    }

    public void setValue(A value) {
        this.value = value;
    }

    public Node<A> getNext() {
        return next;
    }

    public void setNext(Node<A> next) {
        this.next = next;
    }
    public String toString(){
        return "Node:[Value="+value+"; Next="+next+"]";
    }
}

