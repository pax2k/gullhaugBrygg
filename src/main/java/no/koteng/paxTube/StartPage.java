package no.koteng.paxTube;

import org.apache.log4j.Logger;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.io.Serializable;

public class StartPage extends WebPage implements Serializable {
    private static Logger logger = Logger.getLogger(StartPage.class.getName());

    public StartPage(PageParameters parameters) {
        super(parameters);

        logger.info("Display StartPage");

        add(new AjaxLink<String>("aboutPage") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                setResponsePage(AboutPage.class);
            }
        });

        add(new AjaxLink<String>("contactPage") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                setResponsePage(ContactPage.class);
            }
        });
    }


}
