package ReplitChallenges;

public class GrowthSize {

	public static void main(String[] args) {
		
		int treesize=0;
		
		for(int i=1; i<=10; i++) {
			int growth;
			if(i<=3) {
				growth=1;
				} else {
					growth=2;
				}
		treesize+=growth;
		System.out.println("year " + i + " - growth " + growth + " cm");
        System.out.println("tree size: " + treesize + "cm\n");
		}
	}

}
