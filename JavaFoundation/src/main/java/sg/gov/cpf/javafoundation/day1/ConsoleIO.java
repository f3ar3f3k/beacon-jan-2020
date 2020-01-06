package sg.gov.cpf.javafoundation.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleIO {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter a word: ");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String word;
		word=input.readLine();
		System.out.println(word);
		
		String n;
		n=input.readLine();
		int num=Integer.parseInt(n);
		System.out.println(num);
		
	}

}
