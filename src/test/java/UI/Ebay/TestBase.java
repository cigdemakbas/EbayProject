package UI.Ebay;

import UI.Ebay.Utilities.Libraries.library.AppLibrary;

public class TestBase {
    private AppLibrary appLibrary;

    public TestBase() {
        appLibrary = new AppLibrary();
    }
    public AppLibrary getAppLibrary() {
        return appLibrary;
    }
}
