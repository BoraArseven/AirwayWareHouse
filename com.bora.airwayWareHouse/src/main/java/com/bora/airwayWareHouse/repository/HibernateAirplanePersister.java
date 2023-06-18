package com.bora.airwayWareHouse.repository;

import java.util.List;
import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.bora.airwayWareHouse.model.Airplane;

//Thanks to https://openclassrooms.com/ to show how to combine hibernate with repository pattern.
public class HibernateAirplanePersister implements AirplaneRepository {

    protected Session session = null;
    protected SessionFactory sessionFactory = null;
    /** Creates a registry from the configuration file, uses that to build a session factory, and then creates a session to use to communicate with the database */
    public HibernateAirplanePersister() {

        File configFile = new File("hibernate.cfg.xml");
        
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure(configFile) 
                .build();

        sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
                
        session = sessionFactory.openSession();

    }
    
    /** Implementes the 'Create' method of the CRUD interface. For hibernate this is the same as the update, so delegates to that
     */
 
    
    /** Implements the 'Read' method of the CRUD interface,
     * returning the database entry that has the given ID */

    /** Implements the 'Update' method of the CRUD interface,
     * copying (or inserting) the given customer into the 
     * database */
  

    /** Implements the 'Delete' method of the CRUD interface,
     * removing the given customer from the database */
  

	@Override
	public List<Airplane> findAll() {
		return session.createQuery("SELECT a FROM Airplanes a", Airplane.class).getResultList();  
	}

	@Override
	public Airplane findbyId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Airplane airplane) {
	 session.update(airplane);
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Airplane airplane) {
		session.beginTransaction();
		session.delete( airplane ) ;
		session.getTransaction().commit();
	}

}