package studyjava;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("001","kim");
        map.put("002","hyun");
        map.put("003","choi");
        map.put("001","adsf");

        System.out.println(map.size());
        System.out.println(map.get("001"));
        System.out.println(map.get("002"));

        Set<String> keys = map.keySet();
        Iterator<String> iter = keys.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            String value = map.get(key);
            System.out.println(key + " "+ value);

        }
    }
}
