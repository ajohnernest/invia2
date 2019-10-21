package TestSuites.BookingTicket_TestSuite;



import Browser_Automation.BrowserStories;
import Browser_Automation.TestStepDescription.LoginTS;


import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;


public class BookTicket extends BrowserStories {

    public BookTicket() {

        stepInstances = new Object[] {
                new LoginTS(),
        };

        stories = asList("BookHotel/Book_a_Trip.story");

        excluded = asList("");

        List<String> metaFilters = new ArrayList<String>();
        metaFilters.add(System.getProperty("metaFilters","+P1 +P2 +P3 -P4"));
        configuredEmbedder().useMetaFilters(metaFilters);

        configuredEmbedder().embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(true)
                .doIgnoreFailureInView(true).useThreads(1).useStoryTimeoutInSecs(50000);

    }
}

