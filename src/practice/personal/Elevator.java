package practice.personal;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {
        int floor=9;
		int elevator1=12;
		int elevator2=8;
		
		int sub1 = Math.abs(floor - elevator1); // mutlak değer 4
		int sub2 = Math.abs(floor-elevator2); // mutlak değer 8
		
		Scanner scanner =new Scanner(System.in);
		
		
		System.out.println("Press the button for elevator: Up/Down");
		
		String call = scanner.nextLine();
        
		if(call.equalsIgnoreCase("Up") && sub2<sub1) {
			
			System.out.println("Elevator is coming from floor: "+elevator2);
			
			}
		      else if(call.equalsIgnoreCase("Up") && sub1<sub2) {
			
			     System.out.println("Elevator is coming from floor: "+elevator1);
			
			    }
		
		else if(call.equalsIgnoreCase("Down") && sub1<sub2) {
			
			System.out.println("Elevator is coming from floor: "+elevator1);
		} else if(call.equalsIgnoreCase("Down") && sub2<sub1) {
			
			System.out.println("Elevator is coming from floor: "+elevator2);
		}else {
			
			System.out.println("Invalid input");
		}
 
		System.out.println("Press the floor you wanna go: ");
		
		int targetfloor = scanner.nextInt();
		
		  if(targetfloor<floor) {
			  
			  System.out.println("The elevator going down to "+targetfloor);
			  
		  }
		  
		  else if(targetfloor>floor) {
			  
			  System.out.println("The elevator going up to "+targetfloor);
		  }
		  
		  else {
			  
			  System.out.println("Invalid input");
		  }
		  
		  scanner.close();
		
	
		
	}

}
