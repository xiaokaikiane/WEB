package Servlets;

import java.util.HashMap;
import java.util.Map;

public class DBUtils {
    private static Map<String,String> map=new HashMap<>();
    static {
        map.put("1","数学");
        map.put("2","语文");
        map.put("3","英语");
        map.put("4","化学");
    }
    public static String findById(String Id){
        return map.get(Id);
    }
}
