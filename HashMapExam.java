package s0828;

import java.util.HashMap;

public class HashMapExam {

	public static void main(String[] args) {
		//학번(정수), 이름(문자)
		//순서 없음
		HashMap<Integer, String> map = new HashMap<>();
		map.put(20302, "구예성");
		map.put(20303, "권순호");
		map.put(20304, "김동현");
		map.put(20306, "김시겸");
		
		System.out.println(map.toString());
		System.out.println(map.size());
		
		System.out.println(map.get(20303));
		map.put(20306, "김로봇");
		System.out.println(map.toString());
		
		for (Integer a : map.keySet()) {
			System.out.println(a);
		}
		
		for (String b : map.values()) {
			System.out.println(b);
		}
		
		for (Integer c : map.keySet()) {
			System.out.print("학번: "+ c);
			System.out.println(" 이름: "+ map.get(c));
		}
		
		map.remove(20306);
		System.out.println(map.toString());
		
		map.clear();
		System.out.println(map.toString());
		
	}

}
