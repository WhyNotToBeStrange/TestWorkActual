package Home9.AddSystem;

public class AddUtill {
    public static Object[] addIn(Object[] first, Object addTo) {
        if (first.length == 0) {
            return new Object[]{addTo};
        } else {
            Object[] array = new Object[first.length + 1];
            for (int i = 0; i < first.length; i++) {
                array[i] = first[i];
            }
            array[first.length] = addTo;
            return array;
        }
    }
}
