package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        for(int i = 0; i <friendArray.length; i++) {
        	String a = sc.nextLine();
        	String[] sArray = a.split(" ");
        	
        	
        	Friend people = new Friend();		
        	people.setName(sArray[0]);
        	people.setHp(sArray[1]);
        	people.setSchool(sArray[2]);
        	
        	friendArray[i] = people; 			
        }
        
        
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }
        
        
        
        

        sc.close();
    }

}
