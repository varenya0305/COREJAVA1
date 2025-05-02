
class NoBody {
	public static void main(String[] args) {
		int i, j;
		
		i = 100;
		j = 200;
		
		//find midpoint between i and j
		while(++i < --j); //No body in this loop
		
		System.out.println("The midpoint is " + i);
	}
}
