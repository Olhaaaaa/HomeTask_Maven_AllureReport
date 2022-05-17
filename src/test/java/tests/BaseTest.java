package tests;

import org.junit.After;
import org.junit.Before;
import util.DriverFactoryMultiton;

import java.io.IOException;

public class BaseTest {

    @Before
    public void profileSetUp() throws IOException {
        DriverFactoryMultiton.getInstance().setDriver();
        DriverFactoryMultiton.getInstance().getDriver();
        DriverFactoryMultiton.getInstance().getBrowserURL();
    }

    @After
    public void tearDown() {
        DriverFactoryMultiton.getInstance().driverClose();
    }

}
