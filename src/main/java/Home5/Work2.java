package Home5;

public class Work2 {
    public Work2(int[] array) {

    }

    private static int searchLength(int number) {
        int length = 0;
        while (number != 0) {
            number =  number / 10;
            length++;
        }
        return length;
    }
        public int findLongest(int[] array){
            int maxValue = 0;
            int longest = searchLength(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (longest < searchLength(array[i])) {
                    longest = searchLength(array[i]);
                    maxValue = i;
                }
            }
            return array[maxValue];
        }
        public int findShortest(int[] array){
            int minValue = 0;
            int shortest = searchLength(array[0]);
            for (int i = 1; i < array.length; i++) {
                if (shortest > searchLength(array[i])) {
                    shortest = searchLength(array[i]);
                    minValue = i;
                }

            }
            return array[minValue];
        }

        public int findLongestLength(int[] array){


            return searchLength(findLongest(array));
        }
    public int findShortestLength(int[] array){


        return searchLength(findShortest(array));
    }

    public static void main(String[] args) {

        int array[] = {-7, 111, 22, 333, 4, 88888, 777777, 666};
        Work2 finder = new Work2(array);
        System.out.println("Максимальное число-" + finder.findLongest(array) + "  его длина=" + finder.findLongestLength(array));
        System.out.println("Минимальное число-" + finder.findShortest(array) + "  его длина=" + finder.findShortestLength(array));
    }
}
