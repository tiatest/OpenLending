package com.openlending.utilities;

import com.openlending.pages.Google_Page;
import com.openlending.pages.LinkedIN_Page;

public class Pages {
    private Google_Page google_page;
    private LinkedIN_Page linkedIN_page;


    public Google_Page getGoogle_page() {
        if (google_page == null) {
            google_page = new Google_Page();
        }
        return google_page;
    }

    public LinkedIN_Page getLinkedIN_page() {
        if (linkedIN_page == null) {
            linkedIN_page = new LinkedIN_Page();
        }
        return linkedIN_page;
    }
}
