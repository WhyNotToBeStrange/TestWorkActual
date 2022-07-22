public class Work1 {
    public boolean sequence(int[] first, int[] second) {
        boolean flag = false;
            for (int i = 0; i < first.length-second.length+1; i++) {
                if (flag) {
                break;
                }
                    int count = i;
                    for (int j = 0; j < second.length; j++) {
                        int num = second[j];
                        if (num == first[count]) {
                            flag = false;
                            count++;
                        } else {
                            flag = true;
                            break;
                        }
                    }
                }
        if (flag) {
            System.out.println("Один масив из 2х являеться подпоследовательностью другого");
            return true;
        } else {
            System.out.println("Подпоследовательность не обнаружена");
            return false;
        }
    }

    public static void main(String[] args) {
        int[] first = {2,4,6,3,-1,1};
        int[] second = {4,6,3};
        Work1 findSequence = new Work1();
        findSequence.sequence(first,second);

    }
}
