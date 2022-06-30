package AnnotationTestNG;

import org.testng.annotations.*;

public class RunAnnotationTestNG {


    @Test
    public void test1() {
        System.out.println("Prosto Test");
    }

    @Test
    public void test() {
        System.out.println("Prosto Test 1");
    }

    @BeforeMethod
    public void testBeforeMethod() {
        System.out.println("Test " + " Before Method");
    }

    @AfterMethod
    public void testAfterMetod() {
        System.out.println("Test " + " After Method");
    }

    @BeforeClass
    public void testBeforeClass() {
        System.out.println("Test " + " Before Class");
    }

    @AfterClass
    public void testAfterClass() {
        System.out.println("Test " + " After Class");
    }

    @BeforeGroups
    public void testBeforeGroups() {
        System.out.println("Test " + " Before Group");
    }

    @AfterGroups
    public void testAfterGroups() {
        System.out.println("Test " + " After Group");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("Test " + " Before Test");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("Test " + " After Test");
    }

    @BeforeSuite
    public void testBeforeSuite(){
        System.out.println("Test " + " Before Suite");
    }

    @AfterSuite
    public void testAfterSuite(){
        System.out.println("Test " + " After Suite");
    }
}

