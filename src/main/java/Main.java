import DAO.PersonDAO;
import Entity.Person;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.sql.DriverManager;
import java.sql.SQLException;


/* where should we put @Transactional > https://stackoverflow.com/a/28736612/3593084*/

@ApplicationScoped
public class Main {

    @Inject
    PersonDAO baseDAO;

    void initialize(@Observes @Initialized(ApplicationScoped.class) Object playload) {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("ERRRRRRRRRRRRRRRRR");
        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        addPerson();
    }

    public void addPerson() {
        Person person = new Person();
        person.setName("dust");
        baseDAO.create(person);
    }

}
