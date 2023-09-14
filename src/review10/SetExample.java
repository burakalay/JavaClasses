package review10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	    // Collection
		// List | Set | Queue (Three interfaces inheriting Collection)
	
		// ArrayList | LinkedList (Two classes implementing List Interface)
		// HashSet | LinkedHashSet | TreeSet (Three classes implementing Set Interface)
	
		// 1. List preserves the insertion order, but SET does NOT
		// 2. List contains duplicates, but SET contains UNIQUE object
	
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
		
				System.out.println("---- 1st way, for loop DOES NOT work in a SET----");
//				for (int i = 0; i < africaHash.size(); i++) {
//					africaHash.get(i);
//				}
		
				// Task
				// Iterate africaHash using enhanced for loop and iterator
		
				System.out.println("---- 2nd way, enhanced/advanced for loop----");
				for (String country : africaHash) {
					System.out.println(country);
				}
		
				System.out.println("---- 3rd way, using iterator----");
				Iterator<String> itCountry = africaHash.iterator();
				while (itCountry.hasNext()) {
					String country = itCountry.next();
					System.out.println(country);
				}
		
		
		
	}

}
