package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
  public   WebDriver driver ;

    public homePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBookingBTn(){
        driver.findElement(By.xpath("//button[@class=\"btn btn-outline-primary float-right openBooking\"]")).click();
    }
    public void chooseDate(String date){
        driver.findElement(By.xpath("//div[@class=\"rbc-month-view\"]//div[@class=\"rbc-date-cell\"]//button[text()="+ date + "]")).click();
    }
    public void addFirstName(String name){
        driver.findElement(By.name("firstname")).sendKeys(name);
    }
    public void addLastName(String name){
        driver.findElement(By.name("lastname")).sendKeys(name);
    }
    public void addemail(String email){
        driver.findElement(By.name("email")).sendKeys(email);
    }
    public void addPhone(String phone){
        driver.findElement(By.name("phone")).sendKeys(phone);
    }
    public void clickBook(){
        driver.findElement(By.xpath("//button[@class=\"btn btn-outline-primary float-right book-room\"]")).click();
    }
}
