# LUMA_JavaSeleniumTestNGAllure
[![Java CI with Maven](https://github.com/NatalliaOwl/LUMA_JavaSeleniumTestNGAllure/actions/workflows/build.yml/badge.svg)](https://github.com/NatalliaOwl/LUMA_JavaSeleniumTestNGAllure/actions/workflows/build.yml)

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>README</title>
</head>
<body>

<h2>Overview</h2>
<p>This project is an automation testing framework for the LUMA web application, built using Java, Selenium WebDriver, TestNG for test management, and Allure for detailed reporting. It aims to ensure the application's functionality and performance through robust and efficient automated UI tests.</p>

<h2>Features</h2>
<ul>
    <li><strong>Java:</strong> The core programming language used for writing test scripts.</li>
    <li><strong>Selenium WebDriver:</strong> Used for browser automation, enabling interaction with the LUMA application's web elements.</li>
    <li><strong>TestNG:</strong> Provides advanced test configuration, management, and execution capabilities.</li>
    <li><strong>Allure:</strong> Integrated for generating detailed and visually appealing test reports.</li>
    <li><strong>Maven:</strong> Used for project build and dependency management.</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<p>Ensure you have the following installed:</p>
<ul>
    <li><strong>Java JDK:</strong> Version 17 or higher</li>
    <li><strong>Maven:</strong> For managing project dependencies and build lifecycle.</li>
    <li><strong>Selenium WebDriver:</strong> Compatible version for your browser.
    <li><strong>TestNG:</strong> Testing framework.</li>
    <li><strong>Allure:</strong> For generating test reports.</li>
</ul>

<h3>Installation</h3>
<ol>
<li><strong>Clone the Repository</strong></li>
<pre>
<code>git clone https://github.com/NatalliaOwl/LUMA_JavaSeleniumTestNGAllure.git</code>
</pre>

<li><strong>Navigate to the Project Directory</strong></li>
<pre>
<code>cd LUMA_JavaSeleniumTestNGAllure</code>
</pre>

<li><strong>Install Dependencies</strong></li>
<pre>
<code>mvn clean install</code>
</pre>
</ol>

<h3>Run All Tests</h3>
<pre>
<code>mvn test</code>
</pre>

<h3>Generate Allure Report</h3>
<pre>
<code>mvn allure:serve</code>
</pre>

<h2>Project Structure</h2>
<pre>
<code>
LUMA_JavaSeleniumTestNGAllure/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── lumaproject/
│   │               └── pages/
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── lumaproject/
│       │            └── base/
│       │            └── data/
│       │            └── test/
│       │            └── utils/
│       └── resources/ 
├── xmlsuits
├── pom.xml
└── README.md
</code>
</pre>
<ul>
    <li><strong>src/main/java:</strong> Contains the Page Object Model code.</li>
    <li><strong>src/test/java:</strong> Contains the test cases.</li>
    <li><strong>src/test/resources:</strong> Contains properties files.</li>
    <li><strong>pom.xml:</strong> Maven configuration file.</li>
    <li><strong>pom.xml:</strong> Maven configuration file.</li>
    <li><strong>README.md:</strong> Project documentation.</li>
</ul>

<h2>Usage</h2>
<ul>
    <li><strong>Writing Tests:</strong> Create your test classes in the <code>src/test/java/com/yourpackage/</code> directory.</li>
    <li><strong>Running Tests:</strong> Use TestNG annotations to configure and run your tests.</li>
    <li><strong>Viewing Reports:</strong> After running tests, generate and view reports using Allure commands.</li>
</ul>

<h2>Contact</h2>
<p>For any inquiries, please contact <a href="https://github.com/NatalliaOwl">NatalliaOwl</a>.</p>

</body>
</html>
