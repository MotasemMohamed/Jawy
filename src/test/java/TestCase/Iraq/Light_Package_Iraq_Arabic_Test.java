package TestCase.Iraq;

import Pages.Dashboard;
import Pages.PaymentBundlePage;
import base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Light_Package_Iraq_Arabic_Test extends TestBase {
    @DataProvider(name="userData")
    public static Object[][]userData()
    {
        return new Object[][]
                {
                        {"iq","ابتداءا من 900.00 دينار عراقي/بالاسبوع","2.40 دينار عراقي/الشهر","إبتداءً من: 2.40 دينار عراقي"},
                };
    }
    @Test(dataProvider = "userData",description = "This testcase is used to test the currency beside to amount in the dashboard and Light package page (In Arabic)")
    public void Light_Package_Iraq_Arabic(String Nationalitycode, String Currency,String Text1,String Text2)  {
        Dashboard dashobject = new Dashboard(driver);
        dashobject.ChangeCountry(Nationalitycode,Currency);
        dashobject.Open_Light_Bundle();
        PaymentBundlePage paymentBundleobj = new PaymentBundlePage(driver);
        paymentBundleobj.Assert_For_Bundel_Currency(Text1,Text1,Text2);
        paymentBundleobj.BackToDashboard();
    }

}

