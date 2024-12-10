package UI.Ebay.Utilities.Libraries.library;

import UI.Ebay.Pages.FooterEbayAboutPages;
import UI.Ebay.Pages.SearchBoxPages;

public class PageLibrary {
  private SearchBoxPages sbp;
  private FooterEbayAboutPages fep;
  public PageLibrary(){
sbp= new SearchBoxPages();
fep=new FooterEbayAboutPages();
  }

    public SearchBoxPages getSbp() {
        return sbp;
    }
    public FooterEbayAboutPages getFep(){
    return fep;
    }
}



