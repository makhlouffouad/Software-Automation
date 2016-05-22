package search;

import base.CommonAPI;
import org.testng.annotations.Test;

/**
 * Created by dell on 5/22/2016.
 */
public class Login extends CommonAPI{

    @Test
    public void signIn(){
        typeByXpath("input[@id='email']","fawfaw@hotmail.com");
        typeByXpath("input[@id='pass']","inchalah5ir");
        clickByCss("#u_0_w");
    }
}
