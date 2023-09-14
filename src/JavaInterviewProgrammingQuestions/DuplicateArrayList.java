package JavaInterviewProgrammingQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Paris");
		list.add("Adana");
		list.add("London");
		list.add("Paris");
		list.add("NYC");
		list.add("London");
		list.add("İstanbul");
		
		System.out.println(list);
		
		List<String> uniqueList = new ArrayList<>();
		
		for(String m: list) {
			
			if(!uniqueList.contains(m)) {
				
				uniqueList.add(m);
			}
		}
		
		System.out.println(uniqueList);
		
		System.out.println("-------------------------------------------------------");
		List<Integer> originalList = new ArrayList<>();
		originalList.add(1);
		originalList.add(2);
		originalList.add(3);
		originalList.add(2);
		originalList.add(4);
		originalList.add(1);

		Set<Integer> uniqueSet = new HashSet<>(originalList);
		List<Integer> uniqueList2 = new ArrayList<>(uniqueSet);

		System.out.println("Original List: " + originalList);
		System.out.println("List with Duplicates Removed: " + uniqueList2);
		
	}

}
