package Ebay.Utilities.Libraries.library;

import Ebay.Pages.SearchBoxPages;

public class PageLibrary {
  private SearchBoxPages sbp;
  public PageLibrary(){
sbp= new SearchBoxPages();
  }

    public SearchBoxPages getSbp() {
        return sbp;
    }
}



