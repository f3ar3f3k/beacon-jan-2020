package sg.gov.cpf.javafoundation.day5.module20;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyDatabaseServiceTest {
	
	@Mock
	MyDatabase dbMock;

	@Test
	public void connectToDbTest() {
		MyDatabaseService myDbService = new MyDatabaseService(dbMock);
		
		Mockito.when(dbMock.connect()).thenReturn(true);
		
		assertTrue(myDbService.connectToLiveDB());
		
		Mockito.verify(dbMock, Mockito.times(1)).connect();
	}

}
