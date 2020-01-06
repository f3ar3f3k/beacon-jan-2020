package sg.gov.cpf.javafoundation.day1;

import java.util.Calendar;
import java.util.Locale;

public class FormattingOutput {

	public static void main(String[] args) {
		long num =345141;
		
		System.out.format("%d%n", num);
		System.out.format("%9d%n", num);
		System.out.format("%09d%n", num);
		System.out.format("%+09d%n", num);
		System.out.format("%,09d%n", num);

		double num2=31.5656;
		System.out.format("%f%n%n", num2);
		System.out.format("%.3f%n", num2);
		System.out.format("%09f%n", num2);
		
		System.out.format(Locale.FRANCE,"%-10.4f%n", num2);
	
		Calendar c = Calendar.getInstance();
		System.out.format("%tB %te, %tY%n", c,c,c);
		System.out.format("%tl:%tM %tp%n", c,c,c);
		System.out.format("%tD%n", c);
		
		char A = '\u0055';
		System.out.format("%c%n", A);
		
		Boolean b = null;
		System.out.format("%b%n", b);
	}
}
