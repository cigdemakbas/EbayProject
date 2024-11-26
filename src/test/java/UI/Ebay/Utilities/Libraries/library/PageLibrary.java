package UI.Ebay.Utilities.Libraries.library;

import UI.Ebay.Pages.SearchBoxPages;

public class PageLibrary {
  private SearchBoxPages sbp;
  public PageLibrary(){
sbp= new SearchBoxPages();
  }

    public SearchBoxPages getSbp() {
        return sbp;
    }
}



