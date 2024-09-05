package FailTestcase;

import org.testng.Assert;
 import org.testng.annotations.Test;

public class TestcaseExample {

@Test
    public void TestCase1()
    {
         Assert.assertTrue(false);
        System.out.println("testcase 1");
    }
@Test
    public void TestCase2()
    {
        Assert.assertTrue(false);
        System.out.println("testcase 2");
    }
@Test
    public void TestCase3()
    {
        System.out.println("testcase 3");
    }
@Test
    public void TestCase4()
    {
        System.out.println("testcase 4");
    }
}
