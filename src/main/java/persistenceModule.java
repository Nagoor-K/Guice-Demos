import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.AbstractModule;

public class persistenceModule extends AbstractModule{
	public void configure() {
		bind(EntityManagerFactory.class).toInstance(Persistence.createEntityManagerFactory("Eclipselink_JPA"));
		}
}
