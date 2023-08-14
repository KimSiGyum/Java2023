package s0814;

import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("김동현");
		list.add("김재우");
		list.add("권순호");
		
		System.out.println(list.toString());
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		list.addFirst("김기훈");
		list.addLast("박승철");
		System.out.println("---------------------------");
		for (String s : list) {
			System.out.println(s);
		}
	}

}
