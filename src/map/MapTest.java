package map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "王宏雷");
		System.out.println(map.get("name"));
	}
}
