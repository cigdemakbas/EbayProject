package UI.Ebay.Utilities.Libraries.library;


import UI.Ebay.Utilities.Driver;

public class FlowsLibrary {

    public void navigateToUrl(String url){
        Driver.getDriver().get(url);
    }

    public String getCurrentPageTitle(){
       return Driver.getDriver().getTitle();
    }

    public String getCurrentPageUrl(){
        return Driver.getDriver().getCurrentUrl();
    }
}
