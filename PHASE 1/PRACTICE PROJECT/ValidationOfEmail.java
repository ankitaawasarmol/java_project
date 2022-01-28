package com.sl.Assignments.PracticeProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmail {
	public static boolean isValidEmail(String email) {
	      String regex = "^(.+)@(.+)$";
	    //initialize the Pattern object
	         Pattern pattern = Pattern.compile(regex);
	         Matcher matcher = pattern.matcher(email);
	         return matcher.matches();

	         
	     }

	     public static void main(String[] args) {
	         List<String> emails = new ArrayList<String>();
	         // valid email addresses
	         emails.add("mohini@example.com");
	         emails.add("poojapawar@example.com");
	         emails.add("rahul@example.me.org");
	         //invalid email addresses
	         emails.add("raman.example.com");
	         emails.add("alvida..bob@example.com");
	         emails.add("manoj@.example.com");

	         for (String value : emails) {
	             System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	         }
	         
	         System.out.println("Enter any email address to check");
	         Scanner sc = new Scanner(System.in);
	         String input = sc.nextLine();
	         System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	         
	     }
	     
	}


