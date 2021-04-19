package com.balazsholczer.vigenere;
import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream.
		System.out.print("Enter a string Press enter to take an input for key\n");
		String str= sc.nextLine();
		String ke=sc.nextLine();
		VigenereCipher vigenereCipher = new VigenereCipher();
		String cipherText = vigenereCipher.encrypt(str, ke);
	
		System.out.println("Cipher text: "+cipherText);
		
		String plainText = vigenereCipher.decrypt(cipherText, ke);
		System.out.println("Plain text is: "+plainText);
	}
}
