package TestCase.Iraq;

import Pages.Dashboard;
import Pages.PaymentBundlePage;
import base.TestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Light_Package_Iraq_English_Test extends TestBase {
    @DataProvider(name="userData")
    public static Object[][]userData()
    {
        return new Object[][]
                {
                        {"iq","From 900.00 IQ/week","2.40 IQ/month","Starting: 2.40 IQ"},
                };
    }

    @Test(dataProvider = "userData",description = "This testcase is used to test the currency beside to amount in the dashboard and Light package page (In English)")
    public void Light_Package_Iraq_English(String Nationalitycode, String Currency,String Text1,String Text2)  {
        Dashboard dashobject = new Dashboard(driver);
        dashobject.ChangeLanguage();
        dashobject.ChangeCountry(Nationalitycode,Currency);
        dashobject.Open_Light_Bundle();
        PaymentBundlePage paymentBundleobj = new PaymentBundlePage(driver);
        paymentBundleobj.Assert_For_Bundel_Currency(Text1,Text1,Text2);
        paymentBundleobj.BackToDashboard();
    }

}

