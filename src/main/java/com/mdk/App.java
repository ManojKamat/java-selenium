package com.mdk;

import org.openqa.selenium.WebDriver;

public final class App {
    private App() {
    }

    public static void main(final String[] args) throws Exception {
        final Browser obj = new Browser();

        final String baseUrl = "http://demo.guru99.com/test/newtours/";
        final String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        final WebDriver driver = obj.getDriver();

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print the
         * result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        // close Fire fox
        driver.close();
    }
}
