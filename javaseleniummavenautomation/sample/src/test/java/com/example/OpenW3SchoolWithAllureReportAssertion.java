package com.example;

import io.qameta.allure.Step;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenW3SchoolWithAllureReportAssertion {

    @Step("F1 - Launch Browser and Website !")
    @Test
    private void f1() {
        // Your test logic for F1
    }

    @Step("F2 - Launch Browser and Website !")
    @Test
    private void f2() {
        // Your test logic for F2
    }

    @Step("F3 - Launch Browser and Website !")
    @Test
    private void f3() {
        // Your test logic for F3
    }

    @Step("F4 - Launch Browser and Website !")
    @Test
    private void f4() {
        // Your test logic for F4
    }

    @Step("F5 - Launch Browser and Website !")
    @Test
    private void f5() {
        // Your test logic for F5
    }

    @BeforeMethod
    public void beforeMethod() {
        // Setup code
    }

    @AfterMethod
    public void afterMethod() {
        // Teardown code
    }
}
