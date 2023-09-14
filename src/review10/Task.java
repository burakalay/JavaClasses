package review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {

		Set<String> africaLinked = new LinkedHashSet<>(); // Up-casting
		
				africaLinked.add("Morocco");
				africaLinked.add("Egypt");
				africaLinked.add("Senegal");
		
				System.out.println("Size -> " + africaLinked.size());
		
				// It will not add in the Set, because it already exists.
				boolean added = africaLinked.add("Egypt");
		
			System.out.println("Size -> " + africaLinked.size());
		
				// Can I add with index in a SET? -> NO
				// africaLinked.add(0, "Kenya");
		
				System.out.println("LinkedHashSet -> " + africaLinked);
		
				Set<String> africaHash = new HashSet<>(africaLinked);
				System.out.println("HashSet -> " + africaHash);
		
				Set<String> africaTree = new TreeSet<>();
				africaTree.addAll(africaLinked);
				System.out.println("TreeSet -> " + africaTree);
		
				int size = africaHash.size();
				boolean contains = africaHash.contains("China");
				boolean isEmpty = africaHash.isEmpty();
				boolean ableToRemove = africaHash.remove("China");
		
				System.out.println("I was able to remove China -> " + ableToRemove);
				// Note: We are NOT able to get/add/remove by index in a SET
		// africaHash.get(1);

		System.out.println("---- 1st way , for loop DOES NOT work in a SET----");
//		for (int i = 0; i < africaHash.size(); i++) {
//			africaHash.get(i);
//		}
	// Task until 12:55
		// Iterate africaHash using enhanced for loop and iterator

		
		for(String m: africaHash) {
			
			System.out.print(m+" ");
		}
		
		System.out.println();
		Iterator<String> m2 = africaHash.iterator();
		
		while(m2.hasNext()) {
			
			System.out.print(m2.next()+" ");
		}
		
	}

}
