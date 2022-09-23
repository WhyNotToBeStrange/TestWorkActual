package Home12.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void count() {
        LinkedList testList = new LinkedList<>();
        assertEquals(0,testList.count());
        testList.headAdd(1);
        testList.addNew(1,2);
        testList.tailAdd(3);
        testList.addNew(3,4);
        assertEquals(4,testList.count());

    }

    @Test
    void isElse() {
        LinkedList testList = new LinkedList<>();
        assertTrue(testList.isElse());
        testList.headAdd(1);
        testList.tailAdd(2);
        assertFalse(testList.isElse());

    }

    @Test
    void tailAdd() {
        LinkedList testList = new LinkedList<Integer>();
         Integer[] expected = new Integer[]{1,2,3,4,5} ;
         testList.addNew(0,1);
         testList.addNew(1,2);
         testList.addNew(2,3);
         testList.addNew(3,4);
         testList.tailAdd(5);
         Object[] set;
         set=testList.listNodes();
         assertArrayEquals(expected,set);
    }

    @Test
    void headAdd() {
        LinkedList testList = new LinkedList<Integer>();
        Integer[] expected = new Integer[]{0,1,2,3,4} ;
        testList.addNew(0,1);
        testList.addNew(1,2);
        testList.addNew(2,3);
        testList.addNew(3,4);
        testList.headAdd(0);
        Object[] set;
        set=testList.listNodes();
        assertArrayEquals(expected,set);
    }

    @Test
    void addNew() {
        LinkedList testList = new LinkedList<Integer>();
        Integer[] expected = new Integer[]{1,2,3,4,5} ;
        testList.headAdd(1);
        testList.tailAdd(2);
        testList.tailAdd(4);
        testList.tailAdd(5);
        testList.addNew(2,3);
        Object[] set;
        set=testList.listNodes();
        assertArrayEquals(expected,set);

    }

    @Test
    void swapElements() {
        LinkedList testList = new LinkedList<Integer>();
        Integer[] expected = new Integer[]{1,2,4,3,5};
        testList.headAdd(1);
        testList.headAdd(2);
        testList.headAdd(3);
        testList.headAdd(4);
        testList.headAdd(5);
        testList.swapElements(2,3);
        Object[] set;
        set=testList.listNodes();
        assertArrayEquals(expected,set);


    }

    @Test
    void deleteHead() {
        LinkedList testList = new LinkedList<Integer>();
        Integer[] expected = new Integer[]{2,3,4,5} ;
        testList.addNew(0,1);
        testList.addNew(1,2);
        testList.addNew(2,3);
        testList.addNew(3,4);
        testList.addNew(4,5);
        testList.deleteHead();

        Object[] set;
        set=testList.listNodes();
        assertArrayEquals(expected,set);
    }

    @Test
    void deleteTail() {
        LinkedList testList = new LinkedList<Integer>();
        Integer[] expected = new Integer[]{1,2,3,4} ;
        testList.addNew(0,1);
        testList.addNew(1,2);
        testList.addNew(2,3);
        testList.addNew(3,4);
        testList.addNew(4,5);
        testList.deleteTail();

        Object[] set;
        set=testList.listNodes();

        assertArrayEquals(expected,set);

    }

    @Test
    void delete() {
        LinkedList testList = new LinkedList<Integer>();
        Integer[] expected = new Integer[]{1,2,4,5} ;
        testList.headAdd(1);
        testList.addNew(1,2);
        testList.addNew(2,3);
        testList.addNew(3,4);
        testList.addNew(4,5);
        testList.delete(2);

        Object[] set;
        set=testList.listNodes();
        assertArrayEquals(expected,set);

    }
}