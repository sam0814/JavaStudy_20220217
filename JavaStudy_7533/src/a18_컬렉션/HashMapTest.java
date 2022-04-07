package a18_컬렉션;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("가", "송새미1");
		hashMap.put("나", "송새미2");
		hashMap.put("다", "송새미3");
		hashMap.put("라", "송새미4");
		hashMap.put("마", "송새미5");
		
		System.out.println(hashMap);
		System.out.println();
		System.out.println(hashMap.get("다"));
		System.out.println(hashMap.containsValue("송새미4"));
		System.out.println(hashMap.remove("라"));
		System.out.println(hashMap);
		System.out.println(hashMap.replace("마", "송새미6"));
		System.out.println(hashMap);
		

	}

}
