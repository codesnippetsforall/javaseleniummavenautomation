package com.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenW3SchoolWithExtentReportAssertion {

    ExtentReports extent = new ExtentReports();
    ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");

    @Test
    private void f1(){
        ExtentTest ex = extent.createTest("F1 - Launch Browser and Website !");
        ex.log(Status.PASS, "F1 - Launch Browse");
        ex.pass("F1 pass - Launch Browse");
    }

    @Test
    private void f2(){
        ExtentTest ex = extent.createTest("F2 - Launch Browser and Website !");
        ex.info( "F2 info - Launch Browse");
        ex.pass("F2 pass - Launch Browse");
    }

    @Test
    private void f3(){
        ExtentTest ex = extent.createTest("F3 - Launch Browser and Website !");
        ex.info( "F3 info - Launch Browse");
        ex.skip( "F3 skip - Launch Browse");
    }

    @Test
    private void f4(){
        ExtentTest ex = extent.createTest("F4 - Launch Browser and Website !");
        ex.info( "F4 info - Launch Browse");
        ex.fail( "F4 fail - Launch Browse");
    }

    @Test
    private void f5(){
        ExtentTest ex = extent.createTest("F5 - Launch Browser and Website !");
        ex.info( "F5 info - Launch Browse");
        ex.warning("F5 warning - Launch Browse");
    }

    @BeforeTest
    public void beforeTest(){
        extent.attachReporter(spark);
    }

    @AfterTest
    public void afterTest(){
        extent.flush();
    }
}
