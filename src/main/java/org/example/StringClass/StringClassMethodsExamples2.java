package org.example.StringClass;

import java.util.Arrays;

public class StringClassMethodsExamples2 {
    public static void main(String[] args) {
        m4();// intern method
        m5();//equalsIgnoreCase
        m6();//toString()
        m7(); //compareToIgnoreCase ,compareTo
        m8();//concat()
        m9();
        m10();
    }
    public static void m4() {
        String s = new String("abc"); // heap
        String s1 = s.intern(); // is abc present in scp ? no. then add it to scp.
        String s2 = s.intern(); // is abc present in scp ? yes. then dont add it to scp. just return existing refrence from scp.

        System.out.println(s1 == s2); // true
        System.out.println(s == s2); // false
        System.out.println(s == s1); // false
    }
    // using equalIgnoreCase
    public static void m5() {
        String s = "Abc";
        String s1 = "ABC";
        System.out.println(s1.equals(s)); // false
        System.out.println(s1.equalsIgnoreCase(s)); // true
    }
    // toString() from object class overidden in string class
    public static void m6() {
        String s = new String("abc");
        System.out.println(s.toString());//Converts this string to a new character array.
    }
    public static void m7() {
        String s = new String("india is our country");
        System.out.println(s.charAt(0));//i
        System.out.println(s.charAt(19));//y

        String s1 = "Abc";
        String s2 = "ADef";
        System.out.println(s1.compareTo(s2)); //b -D =ASCII value (98 -68)= 30

        String s3 = "ABF";
        System.out.println(s1.compareToIgnoreCase(s3)); // c - f =  -3

        String s4 = "Abcdefghi";
        System.out.println(s1.compareToIgnoreCase(s4)); // s1.length() - s2.length()  3 -9 =-6


        String s5 = "Abfdefghi";
        System.out.println(s1.compareToIgnoreCase(s5)); // c - f
    }

    public static void m8() {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;
        String s4 = s1.concat(s2);

        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s3 == s4); // false ? why? findout // cause in s1+s2  there are two array of characters and it shows it one after anothor in the second the two arrays are combined to form a new array and reference of both the arrays are different .
        System.out.println(s3.equals(s4));
    }


    public static void m9() {
        String s1 = "abc def";
        boolean flag = s1.contains("de");
        System.out.println(flag); // true
        flag = s1.contains("fe");
        System.out.println(flag); // false
    }
    public static void m10() {
        String s = "abc abc";
        byte[] bytes = s.getBytes();
        System.out.println(bytes); //[B@75b84c92
        System.out.println(Arrays.toString(bytes)); //[97, 98, 99, 32, 97, 98, 99]

        int index = s.indexOf('b');
        System.out.println(index);//1
        index = s.lastIndexOf('b');
        System.out.println(index);//5

    }
}
