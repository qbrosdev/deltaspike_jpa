import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Test {

    @Inject
    Main main;

    @PostConstruct
    void initMethod() {
//        main.addPerson();
    }


}
