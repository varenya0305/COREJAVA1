

class Light {

	 public static void main(String[] args) { 
		/*int num = -8; Binary: 11111111 11111111 11111111 11111000 
		System.out.println(num >>> 2); Output: -2 (Binary: 11111111 11111111 11111111 11111110) */
	
		//Compute distance light travels using long variables.
		int lightspeed;
		long days;
		long seconds;
		long distance;
	
		//approximate speed of light in miles per second 
		lightspeed = 186000; 
		
		days = 1000; //specify number of days here
		
		seconds = days * 24 * 60 * 60; //convert to seconds
		
		distance = lightspeed * seconds; //compute distance
				
		System.out.print("In " + days);	
		System.out.print(" days light will travel about ");
		System.out.println(distance + " miles.");
		
		//The result could not have been held in an int variable (range: –2,147,483,648 to 2,147,483,647).
	}
}
