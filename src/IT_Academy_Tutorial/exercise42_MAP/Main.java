package IT_Academy_Tutorial.exercise42_MAP;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] str = "гриша полина рома гриша полина рома папа мама сын папа папа сын гриша гриша".split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            Integer count = map.get(str[i]);
            if(count == null) {
                map.put(str[i], 1);
            } else {
                ++count;
                map.put(str[i], count);
            }
        }
        for (String key: map.keySet())
        {
            Integer value = map.get(key);
            System.out.println(key + " --> " + value);
        }

    }
}
