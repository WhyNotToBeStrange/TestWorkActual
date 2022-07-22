public class Work4 {
    public String Matrix(int num ,int step ) {
        String res = "";
        int count = 0;
        int n = 1;
        for (int i = 0; i < step; i++) {
            for(int j=0;j< step;j++)
                if (n <= num) {
                    res += n + " ";
                    n++;
                    count++;
                    if(count==step){
                        count=0;
                        res += "\n";
                    }
                }
                else {
                    res += "0 ";
                }
            }

        return res;
    }

    public static void main(String[] args) {
        Work4 show = new Work4();
        String res = show.Matrix(21, 5);
        System.out.println(res);
    }
}
