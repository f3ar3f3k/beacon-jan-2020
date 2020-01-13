package sg.gov.cpf.javafoundation.day5.module20;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(HelloWorldFinalMethod.class)
public class HelloWorldFinalMethodServiceTest {

	@Mock
	HelloWorldFinalMethod helloWorldMock;
	
	@Test
	public void greetingsTest() {
		HelloWorldFinalMethodService hwService = new HelloWorldFinalMethodService(helloWorldMock);
		
		Mockito.when(helloWorldMock.sayHelloMethod()).thenReturn("Hello World!");
		
		String message = hwService.greetings();
		
		assertEquals("Hello World!", message);
		
		verify(helloWorldMock, Mockito.times(1)).sayHelloMethod();
		
	}

}
