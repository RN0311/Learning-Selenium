# Learning-Selenium

-----
Selenium scripts to open chrome browser and login to facebook.<br >
## Requirements ##
* Firstly, to run a webdriver we need a browser and a selenium server jar file.<br >
  * [Download Selenium](http://www.seleniumhq.org/download/) <br >
* To run selenium webdriver in chrome browser, we need ChromeDriver.<br >
  * [Download ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)<br >
* Save the downloaded file to your local machine & specify, its location via webdriver.chrome.driver as below.<br >
 ```java
  System.setProperty("webdriver.chrome.driver", "path-of-chrome-driver" + "chromedriver.exe");
 ``` 
 ## Configure the script ##
There is a ``` main ``` method in the **LoginFacebook.java** script, edit your own Facebook username and password & you will get   output(shown below!) based on your own credentials. <br >

 ![LoginFacebook](https://github.com/RN0311/Learning-Selenium/blob/master/LoginFacebook.PNG)
 
