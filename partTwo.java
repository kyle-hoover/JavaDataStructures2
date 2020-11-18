public static void toPower() {
    Scanner myScanner = new Scanner(System.in);
		ArrayList<Integer> toPower = new ArrayList<Integer>();
		
		System.out.println("What would you like to set the array size as?");
		Integer size = Integer.parseInt(myScanner.nextLine());
		
		System.out.println("What would you like to set the power as?");
		Integer power = Integer.parseInt(myScanner.nextLine());
		
		for (int i = 0; i < size; i++) {
			toPower.add(i);
		}
		//this creates an array indexed 0, 1, 2, 3... up to size variable
		
		int a = 0;
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i : toPower) {
			a = (int) Math.pow(i, power);	//for each index (i) in toPower, a is that index powered to the power variable
			b.add(a);	//a is then pushed to the new array b
		}
		
		System.out.println(b);
		
		myScanner.close();
}
