package Home12;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1,2,3,4,5,6,7,8};
        LinkedList<Integer> numsList = new LinkedList<>(numbers);
        LinkedList<Integer> checkList = new LinkedList<>();
        System.out.println(numsList.count());
        System.out.println(checkList.count());
        System.out.println(checkList.isElse());
        System.out.println(numsList.isElse());
        numsList.headAdd(0);
        numsList.tailAdd(9);
        numsList.addNew(10,10);
        System.out.println(numsList);
        numsList.deleteTail();
        numsList.deleteHead();
        numsList.delete(5);
        System.out.println(numsList);
        numsList.swapElements(1,5);
    }
}
