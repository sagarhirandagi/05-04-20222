import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Q2 {
    public static void main(String[] args){
		Map<String, Integer> map = new HashMap<>();
		map.put("Tom", 500);
		map.put("Jerry", 300);
		map.put("Sagar", 600);
		map.put("ABC", 200);
		map.forEach((k,v)->System.out.println(k+"="+v));
		System.out.println("After Sorting by value");
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(Entry.comparingByValue());
		list.forEach(System.out::println);
	}
    
}
