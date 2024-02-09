package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenW3SchoolWithTestNGAssertion {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\Tester\\ChromeDriver\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test(description = "Test to check if the page loads successfully with a status code of 200.")
    public void testPageLoad() throws InterruptedException, IOException {
        // Navigate to the URL
        driver.get("https://www.w3schools.com/html/default.asp");

        // Pause for a few seconds to allow the page to load (you may use WebDriverWait instead)
        Thread.sleep(3000);

        // Get the URL of the current page
        String currentUrl = driver.getCurrentUrl();

        // Check the HTTP status code of the page
        int statusCode = getStatusCode(currentUrl);

        // Assert that the status code is 200 (OK)
        Assert.assertEquals(statusCode, 200, "Failed to load the page. Status code is not 200.");

        // Provide additional information in case of failure
        System.out.println("Page loaded successfully with status code 200.");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }

    private int getStatusCode(String urlString) throws IOException {
        // Create a URL object from the given URL string
        URL url = new URL(urlString);

        // Open a connection to the URL
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Get the HTTP status code
        int statusCode = connection.getResponseCode();

        // Close the connection
        connection.disconnect();

        return statusCode;
    }
}