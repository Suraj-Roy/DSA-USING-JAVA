class StringBuillder  {

	public static void main(String[] args) {
		String s = "java Strings";

		StringBuilder res = new StringBuilder(s);

		System.out.println("1.display "+res);

		System.out.println("2.reverse() "+res.reverse());

		res.reverse();

		System.out.println("3.append() "+res.append(" appended"));

		System.out.println("4.delete() "+res.delete(0,5));

		System.out.println("4.insert() "+res.insert(0,"java "));

		System.out.println("5.replace() "+res.replace(5, 12, "Replaced"));


		//Thses are some common method used in StringBuilder and String we will discuss it in String section.

		/*
			1.int capacity() 

			2.char charAt(int index) 

			3.void ensureCapacity(int minimumCapacity)

			4.void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)

			5.int indexOf(String str)

			6.int indexOf(String str, int fromIndex)

			7.int lastIndexOf(String str)

			8.int lastIndexOf(String str, int fromIndex)

			9.int length()

			10.void setCharAt(int index, char ch)

			11.void setLength(int newLength)

			12.CharSequence subSequence(int start, int end)

			13.String substring(int start)

			14.String substring(int start, int end)

			15.String toString()



		*/









	}
	
}