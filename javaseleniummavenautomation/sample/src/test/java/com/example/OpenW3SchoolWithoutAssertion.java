package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenW3SchoolWithoutAssertion {

    public static void main(String[] args) throws InterruptedException, IOException {

        //Latest as per Google Chrome: 121.0.6167.161
        //Chrome Driver version: 
        System.setProperty("webdriver.chrome.driver", "D:\\Mano\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/html/default.asp");
        Thread.sleep(3000);

        // Get the URL of the current page
        String currentUrl = driver.getCurrentUrl();

        // Check the HTTP status code of the page
        int statusCode = getStatusCode(currentUrl);

        // Print the status code
        System.out.println("Status Code: " + statusCode);

        // Close the browser
        driver.quit();

        // Check if the status code is 200 (OK)
        if (statusCode == 200) {
            System.out.println("Test Case Passed: Page loaded successfully with status code 200.");
        } else {
            System.out.println("Test Case Failed: Page did not load successfully or returned a non-200 status code.");
        }
    }

    private static int getStatusCode(String urlString) throws IOException {
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
