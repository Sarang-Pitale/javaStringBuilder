package com.sample;

public class Demo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("This is my string");
        sb.append(" with String Buffer");
        sb.insert(3,"abcd");
        sb.replace(3,6,"");
        sb.reverse();
        System.out.println(sb);
    }
}
