package no.koteng.paxTube;

import org.apache.log4j.Logger;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.io.Serializable;

public class StartPage extends WebPage implements Serializable {
    private static Logger logger = Logger.getLogger(StartPage.class.getName());

    public StartPage(PageParameters parameters) {
        super(parameters);
         logger.info("New visitor..");
    }


}
