package Home12.List;

public class LinkedList<A> {
    private Node<A> head;
    private Node<A> tail;
    private int count;

    public LinkedList() {

    }

    public LinkedList(A[] nums) {
        for (A a : nums) {
            tailAdd(a);
        }
    }
    public int count(){
        return count;
    }

    private Node<A> getByIndex(int index) {
        Node<A> a = head;
        for (int i = 0; i < index; i++) {
            a = a.getNext();
        }
        return a;
    }

    private boolean isHead(int index) {
        return index == 0;
    }

    private boolean isTail(int index) {
        return index == count;
    }

    private void deleteIndexFinder(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index-" + index + " count-" + count);
        }
    }

    private void addIndexFinder(int index) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException("Index-" + index + " count-" + count);
        }
    }

    private void replaceIndexFind(int first, int second) {
        deleteIndexFinder(first);
        deleteIndexFinder(second);
    }

    public boolean isElse() {
        return head == null;
    }
    private boolean isNotElse(){
        return !isElse();
    }

    public void tailAdd(A nums) {
        if (isElse()) {
            headAdd(nums);
        }
        tail = getByIndex(count - 1);
        tail.setNext(new Node<>(nums, null));
        count++;
    }

    public void headAdd(A nums) {
        head = new Node<>(nums, head);
        count++;
    }

    public void addNew(int index,A nums){
        addIndexFinder(index);
        if(isHead(index)){
            headAdd(nums);
        }else if(isTail(index)){
            tailAdd(nums);
        }else{
            Node<A> a= getByIndex(index-1);
            a.setNext(new Node<>(nums,a.getNext()));
            count++;
        }
    }

    public void swapElements(int first,int second){
        replaceIndexFind(first, second);

        Node<A> firstElement= getByIndex(first-1);
        Node<A> secondElement= getByIndex(second-1);
        if(firstElement==secondElement){
            return;
        }
        Node<A> firstElementOld= getByIndex(first-1);
        Node<A> secondElementOld= getByIndex(second-1);
        if(isHead(first)){
            head= secondElement;
        }else{
            firstElementOld.setNext(secondElement);
        }
        Node<A> a = secondElement.getNext();
        secondElement.setNext(firstElement.getNext());
        firstElement.setNext(a);
    }

    public void deleteHead(){
        if(isNotElse()){
            head=head.getNext();
            count++;
        }
    }

    public void deleteTail(){
        if(count==1){
            deleteHead();
        }else if (isNotElse()){
            Node<A> b = getByIndex(count-2);
            b.setNext(null);
            count--;
        }
    }

    public void delete(int index){
        deleteIndexFinder(index);
        if(isHead(index)){
          deleteHead();
        }else if (isTail(index)){
            deleteTail();
        }else {
            Node<A> a = getByIndex(index-1);
            a.setNext(getByIndex(index-1).getNext().getNext());
        }
    }

    public String toString() {
        String string = "List:[ ";
        Node<A> temp = head;
        while (temp != null) {
            if (temp.getNext() == null) {
                string += temp.getValue().toString();
            } else {
                string += temp.getValue().toString() + ", ";
            }
            temp = temp.getNext();
        }
        string += "]!";
        return string;
    }
   // private void emptyCheck()
}
