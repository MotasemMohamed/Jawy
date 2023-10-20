package TestCase.UAE;

import Pages.Dashboard;
import Pages.PaymentBundlePage;
import base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Premium_Package_UAE_English_Test extends TestBase {
    @DataProvider(name="userData")
    public static Object[][]userData()
    {
        return new Object[][]
                {
                        {"ae","From 10.00 AED/week","16.30 AED/month","Starting: 16.30 AED"},
                };
    }
    @Test( dataProvider = "userData",description = "This testcase is used to test the currency beside to amount in the dashboard and premium package page (In English)")
    public void Premium_Package_UAE_English(String Nationalitycode, String Currency,String Text1,String Text2)  {
        Dashboard dashobject = new Dashboard(driver);
        dashobject.ChangeLanguage();
        dashobject.ChangeCountry(Nationalitycode,Currency);
        dashobject.Open_Premium_Bundle();
        PaymentBundlePage paymentBundleobj = new PaymentBundlePage(driver);
        paymentBundleobj.Assert_For_Bundel_Currency(Text1,Text1,Text2);
        paymentBundleobj.BackToDashboard();
    }

}

