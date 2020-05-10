package co.ukbbc.hooks;

import co.ukbbc.common.Browsers;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Browsers {

@Before
    public void setup(){
    launchBrowser("Chrome");
}

@After
    public void tearDown(){
    //closeBrowser();
}
}
