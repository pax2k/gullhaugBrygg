package no.koteng.paxTube;

import org.apache.log4j.Logger;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxLink;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import java.io.Serializable;

public class ContactPage extends WebPage implements Serializable {
    private static Logger logger = Logger.getLogger(ContactPage.class.getName());

    public ContactPage(PageParameters parameters) {
        super(parameters);
        logger.info("Display ContactPage");

        add(new AjaxLink<String>("aboutPage") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                setResponsePage(AboutPage.class);
            }
        });

        add(new AjaxLink<String>("homePage") {
            @Override
            public void onClick(AjaxRequestTarget target) {
                setResponsePage(StartPage.class);
            }
        });
    }


}
