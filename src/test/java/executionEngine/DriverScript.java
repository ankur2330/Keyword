package executionEngine;

import config.ActionKeywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utility.ExcelUtils;

public class DriverScript {

    public static WebDriver driver = null;

    public static void main(String args[]) throws Exception {

        String sPath = "/home/achaudhary/Ideaprojects/Keyword/DataEngine.xlsx";

        ExcelUtils.setExcelFile(sPath,"Test");

        for(int iRow=1;iRow<9;iRow++){
            String sActionKeyword = ExcelUtils.getCellData(iRow,3);
            if(sActionKeyword.equals("openBrowser")){
                ActionKeywords.openBrowser();
            }
            else if (sActionKeyword.equals("navigate")){
                ActionKeywords.navigate();
            }
            else if(sActionKeyword.equals("click_MyAccount")){
                ActionKeywords.click_Myaccount();}
            else if(sActionKeyword.equals("input_Username")){
                ActionKeywords.input_Username();}
            else if(sActionKeyword.equals("input_Password")){
                ActionKeywords.input_Password();}
            else if(sActionKeyword.equals("click_Login")){
                ActionKeywords.clik_Login();}
            else if(sActionKeyword.equals("closeBrowser")){
                ActionKeywords.closeBrowser();}

        }

    }
}
