package retry.failed.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderImplementation {

    @Test(dataProvider = "data-source")
    public void toolbarActionsOnShapes(String selectShape)
            throws InterruptedException {

        //Assert.assertTrue(false);

        if (selectShape.equalsIgnoreCase("Rectangle"))
            Assert.assertTrue(false);
        if (selectShape.equalsIgnoreCase("Circle"))
            Assert.assertTrue(false);
    }

    @DataProvider(name = "data-source")
    public Object[][] allShapes() {
        return new Object[][] { { "Rectangle" }, { "Circle" }, { "Triangle" }

        };

    }
}
