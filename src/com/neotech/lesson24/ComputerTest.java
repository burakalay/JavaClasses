package com.neotech.lesson24;

public class ComputerTest {

	public static void main(String[] args) {

		Computer c1 = new Apple();
		c1.Download();
		c1.Process();
		c1.Render();
		c1.Upload();
		
		Apple c2 = new Apple();
		c2.Price();
		
		System.out.println("-----------------------");
		
		Computer c3 = new Lenovo();
		c3.Download();
		c3.Process();
		c3.Render();
		c3.Upload();
		
		Lenovo c4 = new Lenovo();
		c4.Design();
		System.out.println("-----------------------");
		Computer c5 = new HP();
		c5.Download();
		c5.Process();
		c5.Upload();
		c5.Render();
		
		HP c6 = new HP();
		c6.CoolingDown();
		System.out.println("-----------------------");
		
		Computer c7 = new DELL();
		c7.Download();
		c7.Process();
		c7.Render();
		c7.Upload();
		
		DELL c8 = new DELL();
		c8.Quality();
		
		
		System.out.println("-----------------------");
		
		
		Computer[] computers= {c1,c3,c5,c7};
		
		for(Computer c: computers) {
			
			c.Download();
		}
		
	}

}
