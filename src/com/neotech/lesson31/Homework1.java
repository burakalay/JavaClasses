package com.neotech.lesson31;

import java.util.Collection;
import java.util.Iterator;
/**
 * Create a map of car models that you have in your garage and for each model the number of car you have.
So the Key is the model and the value is the number of cars. Use LinkedHashMap.
For example:
"BMW" -> 2
"Mercedes" -> 3
"Audi" -> 3
"Ferrari" -> 1

- Check how many entries you have.
- Update the number of Audis to 5.
- Add a new model with any number of cars.
- Check how many Ferraris you have.
- Check if you have Honda in your map.
- Remove Mercedes from the map.
- Get all models from the map. (use keySet() method)

Note: After each step print the map.


 */
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Homework1 {

	public static void main(String[] args) {

		Map<String, Integer> cars = new LinkedHashMap();

		cars.put("BMW", 2);
		cars.put("Mercedes", 3);
		cars.put("Audi", 3);
		cars.put("Ferrari", 3);

		System.out.println(cars);
		System.out.println("The entries of Cars map is: " + cars.size());

		cars.replace("Audi", 5);
		System.out.println(cars);
		cars.put("Tesla", 10);
		System.out.println(cars);
		boolean checkFerrari = cars.containsKey("Ferrari");
		System.out.println(checkFerrari);

		cars.remove("Mercedes");
		System.out.println(cars);
		boolean checkHonda = cars.containsKey("Honda");
		System.out.println(checkHonda);

		Set<String> keys = cars.keySet();
		System.out.println(keys);

		Collection<Integer> values = cars.values();
		System.out.println(values);
		// how many ferrari in the cars map?
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			int c = 0;

			String count = it.next();
			if (count.contains("Ferrari")) {

				c++;
				System.out.println("The number of Ferraris is: " + c);
			}

		}

	}

}
