package com.lloydsbank;

import org.junit.jupiter.api.Test;

import static com.lloydsbank.App.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * test always true
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * test always 10
     */
    @Test
    public void test_shouldAnswerWithTen()
    {
        int answer = 10;
        assertEquals(10, answer );
    }

    /**
     * test always false
     */
    @Test
    public void test_shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void test_sayHello_should_return_Hello_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Hello World!";

        // Act
        actualResponse = sayHello();
        // Assert
        assertEquals( expectedResponse, actualResponse);
    }

     @Test
    public void test_sayGoodBye_should_return_Goodbye_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Goodbye World!";

        // Act
        actualResponse = sayGoodbye();
        // Assert
        assertEquals( expectedResponse, actualResponse);
    }
     
    @Test
    public void test_sayHello_should_return_World()
    {
        // Arrange
        String actualResponse = "";
        String expectedResponse = "Hello World!";

        // Act
        actualResponse = sayHelloToSomeone("World!");
        // Assert
        assertEquals( expectedResponse, actualResponse);
    }
}

