package Home17Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class StringUtill {

    public Map countTheSameWords(String inputs) {
        Map<String, Integer> word = new HashMap<>();
        Pattern pattern = Pattern.compile("\\b(\\w+)\\b");
        Matcher matcher = pattern.matcher(inputs);
        while (matcher.find())
            if (word.containsKey(matcher.group())) {
                word.put(matcher.group(), word.get(matcher.group()) + 1);
            } else {
                word.put(matcher.group(), 1);
            }
        return word;
    }


    public int counterOfMarks(String inputs){
        int count=0;
        Pattern pattern = Pattern.compile("[,.!@?/&_:;)]");
        Matcher matcher= pattern.matcher(inputs);
        while(matcher.find()){
            count++;
        }
        return count;

    }

    public String replaceLatter(String inputs, int index,String newinput){
        StringBuilder result = new StringBuilder(inputs);
        Matcher matcher= Pattern.compile("\\b(\\w{}"+index+"})(\\w)(\\w)\\b").matcher(result);
        while (matcher.find()){
            result.replace(matcher.start(4),matcher.end(4),newinput);
        }
        return result.toString();
    }
    public Set SameHeadAndTailLetter(String inputs){
        Set<String> word = new HashSet<>();
        Pattern pattern = Pattern.compile("\\s(\\w)(\\w+)(\\w1)\\s");
        Matcher matcher = pattern.matcher(inputs);
        while (matcher.find()){
            word.add(matcher.group());
        }
        return word;
    }
}
