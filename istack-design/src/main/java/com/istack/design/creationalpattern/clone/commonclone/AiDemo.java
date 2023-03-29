package com.istack.design.creationalpattern.clone.commonclone;

import java.util.Scanner;

public class AiDemo {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        String str;
        while(true){
            str=scanner.next();
            str=str.replace("吗","!");
            str=str.replace("没","!");
            str=str.replace("？","!");
            str=str.replace("？","!");
            System.out.println(str.length());
            System.out.println("修改前"+str);

        }
    }


}
