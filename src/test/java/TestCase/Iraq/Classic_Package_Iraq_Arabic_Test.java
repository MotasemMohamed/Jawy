package TestCase.Iraq;

import Pages.Dashboard;
import Pages.PaymentBundlePage;
import base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Classic_Package_Iraq_Arabic_Test extends TestBase {
    @DataProvider(name="userData")
    public static Object[][]userData()
    {
        return new Object[][]
                {
                        {"iq","ابتداءا من 900.00 دينار عراقي/بالاسبوع","900 دينار عراقي/أسبوع","900.00 دينار عراقي/بالاسبوع","إبتداءً من: 900.00 دينار عراقي"},
                };
    }
    @Test(dataProvider = "userData",description = "This testcase is used to test the currency beside to amount in the dashboard and in the Classic package page (In Arabic)")
    public void Classic_Package_Iraq_Arabic(String Nationalitycode, String Currency,String Text1,String Text2,String Text3)  {
        Dashboard dashobject = new Dashboard(driver);
        dashobject.ChangeCountry(Nationalitycode,Currency);
        dashobject.Open_Classic_Bundle();
        PaymentBundlePage paymentBundleobj = new PaymentBundlePage(driver);

        paymentBundleobj.Assert_For_Bundel_Currency(Text1,Text2,Text3);
        paymentBundleobj.BackToDashboard();
    }

}
