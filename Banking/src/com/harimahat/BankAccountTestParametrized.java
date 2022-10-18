package com.harimahat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.provider.MethodSource;


import java.util.Arrays;
import java.util.Collection;

public class BankAccountTestParametrized {
    private  BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParametrized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @BeforeEach
    public void setAccount(){
        account= new BankAccount("Hari", "Mahat", 1000.0, BankAccount.CHECKING);
        System.out.println("Running a Test...");
    }

    @ParameterizedTest()
    @MethodSource("testConditions")
    public  void getBalance() {
        account.deposit(amount, branch);
        assertEquals(expected, account.getBalance());

    }
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {100.00,true,1100.0},
                {200.00, true, 1200},
                {325.00, true, 1325},
                {489.93, true, 1489.93}
        });
    }


}
