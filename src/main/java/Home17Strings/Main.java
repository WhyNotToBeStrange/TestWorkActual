package Home17Strings;

public class Main {
    public static void main(String[] args) {
        String string ="Up up right,right,right Down Down left flag svvsv dvnsov sdvnk sdwqqql ogjger- efvm;fkfkd:";
        StringUtill stringUtill = new StringUtill();

        System.out.println(stringUtill.counterOfMarks(string));
        System.out.println(stringUtill.replaceLatter(string,4,"a"));
        System.out.println(stringUtill.countTheSameWords(string));
        System.out.println(stringUtill.SameHeadAndTailLetter(string));
    }
}
