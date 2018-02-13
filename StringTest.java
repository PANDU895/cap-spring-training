package com.sri;

import java.util.Formatter;

public class StringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "srikan-th-";
		String s1 = "srikan-th-";
		String s2 = new String("srikan-th-");
		String s3 = new String("srikan-th-");
		System.out.println("char at index base:"+s.charAt(0));
		System.out.println("charector code avlue at index :"+s.codePointAt(4));
		System.out.println("charector code avlue before index :"+s.codePointBefore(5));
		System.out.println("count of code point in between :"+s.codePointCount(0,10));//doutb *
		System.out.println("---------------------");
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s3.compareTo(s2));
		System.out.println(s== s1);
		System.out.println(s==s2);
		System.out.println(s3==s2);
		System.out.println("---------------------");
		String s4 = s.concat(s1);
		System.out.println(s);
		System.out.println(s4);
		System.out.println(s.contains("srik"));
		System.out.println(s.contentEquals("srikan-th-"));// what is different between to equals
		char[] Str1 = {'h', 'e', 'l', 'l', 'o'};
		System.out.println(String.copyValueOf(Str1, 1,2));
		System.out.println(s.endsWith("th-"));
		/*Formatter fmt = new Formatter(s);
		fmt.format("PI = %f%n", Math.PI);*/
		System.out.println(s.format("%s = %d", "jeo",35));// not understand
		System.out.println(s.getBytes());// not understand and getChars also
		System.out.println(s.hashCode());
		System.out.println(s.indexOf("k",4));
		String s5 = s.intern();
		System.out.println(s.intern()); // why it is
		System.out.println("------------is empty---------------");
		System.out.println(" ".isEmpty());
		System.out.println("".isEmpty());
		
	}

}
