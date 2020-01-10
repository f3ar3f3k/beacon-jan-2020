package sg.gov.cpf.javafoundation.day4.module17.collection.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<CPFEmployee> {

	@Override
	public int compare(CPFEmployee arg0, CPFEmployee arg1) {
		// TODO Auto-generated method stub
		return arg0.getAge() - arg1.getAge();
	}

}
