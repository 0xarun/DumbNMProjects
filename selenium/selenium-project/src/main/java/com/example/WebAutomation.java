package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {
    public static void main(String[] args) {
        // Set path to the WebDriver executable
        System.setProperty("webdriver.chrome.driver", "/home/arun/Documents/122driver/driver/linux64/chromedriver");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open the Flipkart website
        driver.get("https://www.flipkart.com/");

        // Close the login popup if it appears
        try {
            WebElement closeButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
            closeButton.click();
        } catch (Exception e) {
            // Popup may not appear, ignore the exception
        }

        // Find the search input field
        WebElement searchInput = driver.findElement(By.name("q"));
        // Enter search query (e.g., "laptop")
        searchInput.sendKeys("laptop");

        // Find the search button and click on it
        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit']"));
        searchButton.click();

        // Close the browser after a delay (for demonstration purposes)
        try {
            Thread.sleep(5000); // 5 seconds delay before closing the browser
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
