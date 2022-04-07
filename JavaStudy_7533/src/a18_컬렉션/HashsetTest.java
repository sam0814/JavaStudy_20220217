package a18_컬렉션;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetTest {

	public static void main(String[] args) {
		HashSet<String> strSet = new HashSet<String>();
		strSet.add("송새미");
		strSet.add("송새미2"); //순서가 없다
		strSet.add("송새미");
		strSet.add("송새미3");
		
		System.out.println(strSet);
		
		strSet.remove("송새미2");
		
		System.out.println(strSet);
		
		Iterator<String> ir = strSet.iterator();
		while(ir.hasNext()) {
			String str = ir.next();
			if(str.equals("송새미3")) {
				System.out.println(str);
			}
		}
	}

}
