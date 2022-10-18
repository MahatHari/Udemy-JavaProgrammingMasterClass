package com.harimahat;


import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    // assertNotEquals or assertEquals
    // assertArrayEquals -> same length, exact elements in same order
    // assertNull or assertNotNull -> test null
    // assertTrue or assertFalse
    // assertSame() and assertNotSame()-> to check whether two instances are the exact same instance
    // assertSame method compares the object references
    // assertThat()-> compares actual value against a matcher.( a Junit(^4.4) matcher class)
    private  BankAccount account;
    private static int count;
        @org.junit.jupiter.api.BeforeAll // same as BeforeClass in Junit4.4
        public static void beforeClass(){
            System.out.println("This executes before any test Cases. Count = "+count++);
        }

    /** Setup for every test*/

    @org.junit.jupiter.api.BeforeEach
    public  void setUp(){
         account= new BankAccount("Hari", "Mahat", 1000.00, BankAccount.CHECKING);
        System.out.println("Runnig a test ...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {

        double balance= account.deposit(200, true);
       assertEquals(1200, balance, 0);
       assertEquals(1200, account.getBalance(), 0);
    }

    @org.junit.jupiter.api.Test
    void withdraw_branch() {
        double balance= account.withdraw(600, true);
        assertEquals(400, balance, 0);
    }
    @Test
    void withdraw_notBranch() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(501, false);
        });
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {

        double balance= account.withdraw(200, true);
        assertEquals(800, account.getBalance(), 0);
        balance= account.deposit(500, true);
        assertEquals(1300, account.getBalance());

    }
    @Test
    void getBalance_deposit() {
        double balance= account.deposit(500, true);
        assertEquals(1500, account.getBalance());

    }
    @Test
    public void isChecking(){
        double balance= account.deposit(500, true);
        assertTrue( account.isChecking());
    }
    @AfterAll // same as AfterClass in Junit 4
    public static void afterClass(){
        System.out.println("This executes after  any test Cases. Count= "+count++);
    }
    @AfterEach // run after each test
    public void tearDown(){
        System.out.println("Count = "+count++);
    }

}