package sg.gov.cpf.javafoundation.day4.throwrethrow;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadBufferedException {

	public static void main(String[] args) {
		try {
			rethrowException();
		} catch (IOException e) {
			System.out.println("main method error" + e);

		}

	}

	public static void rethrowException() throws IOException {
		try {
			readFile();
		} catch (IOException e) {
			System.out.println("rethrow method error: " + e);
			throw e;
		}
	}

	public static void readFile() throws IOException {
		System.out.println("Execute ReadFile");
		BufferedReader br = new BufferedReader(new FileReader(new File("")));

		String contentLine = br.readLine();

		while (contentLine != null) {
			System.out.println(contentLine);
			contentLine = br.readLine();
		}
		br.close();
	}

}
