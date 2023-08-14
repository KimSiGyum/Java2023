package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		ArrayList<String> list = new ArrayList<>();

		list.add("김시겸");
		list.add("민지");
		list.add("하니");
		list.add("다니엘");
		list.add("해린");
		list.add("혜인");
		System.out.println(list.toString());
		list.remove("김시겸");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		System.out.println(list.size());
		System.out.println("-------------------------------------");
		//리스트에 들어있는 모든 데이터를 하나씩 출력하기.
		
		for (String s : list) {
			System.out.println(s);
		}
		list.clear();
		System.out.println("-------------------------------------");
		System.out.println("지운후 사이즈 : "+list.size());

		System.out.println("-------------------------------------");
		list.add("서울");
		list.add("로봇");
		list.add("로봇");
		list.add("로봇");
		list.add("로봇");
		if(list.contains("서울")== true); {
			System.out.println("서울을 포함하고 있음");
		}
	}

}
