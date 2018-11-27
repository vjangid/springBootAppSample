package com.dcf.com.dcf.sample;


import com.dcf.service.TestService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MockitoSampleTests {

    /**
     * Test1.
     */
    //@Mock
    private TestService service;

 //   @Test
    public void testSimpleInt() {
        // create mock
        TestService test = Mockito.mock(TestService.class);

        // define return value for method getUniqueId()
        Mockito.when(test.getUniqueId()).thenReturn(43);

        // use mock in test....
        Assert.assertEquals(test.getUniqueId(), 43);
    }

    /**
     * Test more than one return value.
     */
    // Demonstrates the return of multiple values
  //  @Test
    public void testMoreThanOneReturnValue() {
        Iterator i = Mockito.mock(Iterator.class);
        Mockito.when(i.next()).thenReturn("Mockito").thenReturn("is neat!!");
        String result = i.next() + " " + i.next();
        Assert.assertEquals("Mockito is neat!!", result);
    }

    /**
     * Test return value dependent on method parameter.
     */
    //@Test
    public void testReturnValueDependentOnMethodParameter() {
        Comparable c = Mockito.mock(Comparable.class);
        Mockito.when(c.compareTo("Mockito")).thenReturn(1);
        Mockito.when(c.compareTo("Eclipse")).thenReturn(2);
        // assert
        Assert.assertEquals(1, c.compareTo("Mockito"));
    }

    /**
     * Test return value in dependent on method parameter.
     */
  //  @Test
    public void testReturnValueInDependentOnMethodParameter() {
        Comparable c = Mockito.mock(Comparable.class);
        Mockito.when(c.compareTo(Matchers.anyInt())).thenReturn(-1);
        Assert.assertEquals(-1, c.compareTo(9));
    }

   // @Test
    public void testVerify() {
        // create and configure mock
        TestService test = Mockito.mock(TestService.class);
        Mockito.when(test.getUniqueId()).thenReturn(43);

        // call method testing on the mock with parameter 12
        test.testing(12);
        test.getUniqueId();
        test.getUniqueId();
        test.someMethod("Hello World");
        test.someMethod("called at least once");
        test.someMethod("called at least twice");
        test.someMethod("called five times");
        test.someMethod("called at most 3 times");

        // now check if method testing was called with the parameter 12
        Mockito.verify(test).testing(Matchers.eq(12));

        // was the method called twice?
        Mockito.verify(test, Mockito.times(2)).getUniqueId();

        // other alternatives for verifiying the number of method calls for a
        // method
        Mockito.verify(test, Mockito.never()).someMethod("never called");
        Mockito.verify(test, Mockito.atLeastOnce()).someMethod("called at least once");

        //	Will all fail because we didn't met the conditions.
        Mockito.verify(test, Mockito.atLeast(2)).someMethod("called at least twice");
        Mockito.verify(test, Mockito.times(5)).someMethod("called five times");
        Mockito.verify(test, Mockito.atMost(3)).someMethod("called at most 3 times");
    }
}
