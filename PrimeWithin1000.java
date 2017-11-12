class PrimeWithin1000 {

	public static void main(String[] args) {

		final long startTime = System.currentTimeMillis();

		if(args.length != 1) {
			System.out.println("USAGE: <INT_TO_BE_CHECKED>");
			System.out.println("ONLY INTEGER TYPES ARE SUPPORTED.");
			System.exit(1);
		}

		int a;

		try {
			a = Integer.parseInt(args[0]);
		} catch (Exception e) {
			a = -1;
		}

		if(a == -1) {
			System.out.println("YOU HAVE NOT SUPPLIED AN INPUT THAT IS ABLE TO BE CONVERTED TO AN INTEGER.");
			System.exit(1);
		}

		if(returnPrime(a) == true) {
			System.out.println(a + " IS A PRIME INTEGER.");
		} else {
			System.out.println(a + " IS NOT A PRIME INTEGER.");
		}

		final long endTime = System.currentTimeMillis();

		System.out.println("Total execution time: " + (endTime - startTime) );

	}

	public static boolean returnPrime(int a) {

		if(a == 1) {
			return false;
		}

		for(int j = 2; j <= (int) Math.sqrt(a); j++) {
			if(a % j == 0) {
				return false;
			}
		}

		return true;

	}

}