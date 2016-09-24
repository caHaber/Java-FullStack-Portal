package tab;

import java.util.Map;

import org.skife.jdbi.v2.DBI;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import oracle.jdbc.driver.DMSFactory;
import tab.db.CardDAO;
import tab.health.TemplateHealthCheck;
import tab.resources.HelloWorldResource;

public class BIPortalApplication extends Application<BIPortalConfiguration> {

    public static void main(final String[] args) throws Exception {
        new BIPortalApplication().run(args);
    }

    @Override
    public String getName() {
        return "BIPortal";
    }

    @Override
    public void initialize(final Bootstrap<BIPortalConfiguration> bootstrap) {
        bootstrap.addBundle(new ViewBundle<BIPortalConfiguration>());
        bootstrap.addBundle(new AssetsBundle());
        
    }

    @Override
    public void run(final BIPortalConfiguration configuration,
                    final Environment environment) {
       

	    
	    final DBIFactory factory = new DBIFactory();
	    final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "oracle");
	    final CardDAO dao = jdbi.onDemand(CardDAO.class);
	    
    	final HelloWorldResource resource = new HelloWorldResource(
    	        configuration.getTemplate(),
    	        configuration.getDefaultName(),
    	        dao
    	    );
    	    
	    final TemplateHealthCheck healthCheck =
	            new TemplateHealthCheck(configuration.getTemplate());
	    
	    
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
        
        //This is not working for me, continue to get injection source issues
       
    }

}
