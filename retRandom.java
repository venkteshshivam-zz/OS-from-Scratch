public void retRandom(String name)

	{
		int rnum = 6 + (int)(Math.random() * ((15 - 6) + 1));

	       /* Here (15-6) denotes the range of the variation and 6 in the starting is min value 
		 + 1 is used to include 15 in the specified range */
		

		 System.out.println(name+" "+ Integer.toString(rnum)); 

	       /* toString is an object class function and used to convert primitive type 
		    to reference type */
	}	