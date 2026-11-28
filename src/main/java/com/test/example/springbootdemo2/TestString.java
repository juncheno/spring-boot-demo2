package com.test.example.springbootdemo2;

public class TestString {
    public static void main(String[] args) {
        System.out.println(111);

//        String x1 = new String("bbbb");
//        String x2 = x1.intern();
//        System.out.println(x1 == x2);


        String x1 = new String("bbbb");     //
        String x2 = x1.intern();            //
        String x3 = "bbbb";                 //
        System.out.println("场景4 x1 == x2：" + (x1 == x2));//false
        System.out.println("场景4 x1 == x3：" + (x1 == x3));//false
        System.out.println("场景4 x2 == x3：" + (x2 == x3));//true


        String s1 = new String("aaaa");
        String s2 = new String("aaaa");
        String s3 = s1 + s2;                //
        String s4 = s3.intern();            //
        System.out.println("场景3 s3 == s4：" + (s3 == s4));            //true
        System.out.println("场景3 \"aaaa\" == s4：" + ("aaaaaaaa" == s4));   //true


    }
}
