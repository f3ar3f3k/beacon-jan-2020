package sg.gov.cpf.javafoundation.day5.module20;

public class MyDatabaseService {

	MyDatabase myDb;
	
	public MyDatabaseService(MyDatabase myDatabase) {
		myDb = myDatabase;
	}
	
	public boolean connectToLiveDB() {
		return myDb.connect();
	}
	
	public static void main(String[] args) {
		MyDatabase myDatabase = new MyDatabase();
		
		MyDatabaseService myDbService = new MyDatabaseService(myDatabase);
		myDbService.connectToLiveDB();
	}
	
}
