package tab.resources;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.dropwizard.views.View;
import tab.core.Card;
import tab.db.CardDAO;
import tab.views.HomePageView;


@Path("/")
@Consumes({MediaType.APPLICATION_JSON})
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;
    
    CardDAO cardDAO;
    
    /*
     * Template and defaultName is provided by config, when resource is initialized
     */
    public HelloWorldResource(String template, String defaultName, CardDAO cardDAO) {
        this.template = template;
        this.defaultName = defaultName;
        this.cardDAO = cardDAO; 
        this.counter = new AtomicLong();
    }
    

//	@GET
//	@Path("person")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Saying sayHello(@QueryParam("name") Optional<String> name) {
//	    final String value = String.format(template, name.orElse(defaultName));
//	    return new Saying(counter.incrementAndGet(), value);
//	}

	@GET
	@Path("TableauPortal")
	@Produces(MediaType.TEXT_HTML)
	public View getTabPortal() {
//			List<Card> cards = Arrays.asList(
//					new Card("NawmSaying","Link"),
//					new Card("NawmSaying2","Link2"),
//					new Card("NawmSaying3","Link3"),
//					new Card("NawmSaying4","Link4")
//					);

			List<Card> cards = cardDAO.getAll();
			
	        return new HomePageView("CASEY HABER", cards);
	        
	}
	
	

}
