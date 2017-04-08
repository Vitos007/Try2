package HomeworkLecture8;


import java.util.*;

public class AnagramSorter {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("done", "none", "node", "neno", "onion", "deno", "gram", "ramg", "nioon");
        Set<String> stringsNew = new HashSet<String>(strings);
        System.out.println(Arrays.toString(stringsNew.toArray()));
    }

}
