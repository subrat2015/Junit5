package com.subrat.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class GreetingImplTestWithMackito {

    @Mock
    private GreetingService greetingService;

    @InjectMocks // this will create a object of GreetingImpl class without creating new operator
    private GreetingImpl greeting;

    @Test
    public void greetShouldRetunAValidOutput() {
        System.out.println("greetShouldRetunAValidOutput");
        when(greetingService.greet("Junit")).thenReturn("Hello Junit");
        String result = greeting.greet("Junit");
        Assertions.assertNotNull(result);
        Assertions.assertEquals("Hello Junit", result);
    }

    @Test
    public void greetShouldThrowAnException_For_NameIsNull() {
        System.out.println("greetShouldThrowAnException_For_NameIsNull");
        doThrow(IllegalArgumentException.class).when(greetingService).greet(null);
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            greeting.greet(null);
        });
    }

    @Test
    public void greetShouldThrowAnException_For_NameIsBlank() {
        System.out.println("greetShouldThrowAnException_For_NameIsBlank");
        doThrow(IllegalArgumentException.class).when(greetingService).greet("");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            greeting.greet("");
        });
    }
}
