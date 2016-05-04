package search;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 4/28/2016.
 */
public class ItemSearch extends CommonAPI {

    @Test
    public void dropDownSearch() throws InterruptedException{

        List<WebElement> list = new ArrayList<WebElement>();
        list = getListOfWebElements("searchDropdownBox option");
        WebElement element = driver.findElement(By.id("searchDropdownBox"));
        for(int i=0; i<list.size(); i++){
            selectOptionByVisibleText(element,list.get(i).getText());
            System.out.println(list.get(i).getText());
            takeEnterKeysByXpath("//*[@id='nav-search']/form/div[2]/div/input");
            Thread.sleep(2000);
            element = driver.findElement(By.id("searchDropdownBox"));
            list = getListOfWebElements("searchDropdownBox option");

        }
    }



}
