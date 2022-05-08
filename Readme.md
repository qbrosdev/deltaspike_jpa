cdi eager initialization:
In Ejb we have @Startup that forces eager initialization. in JSF no built-in solution, but OmaniFces library introduces
@eager annotation.

In CDI (@ApplicationScoped)beans get lazy-instantiated the first time the bean is accessed, not when the web app is
started up. (we need an eager mechanisem in cdi).

@ApplicationScoped
public class ProvisioningDataForApplicationLifecycle {
    private final Map<String, User> users = new HashMap<>(); // + getter

    public void init(@Observes @Initialized(ApplicationScoped.class) Object init) {
        users.put("cdi", new User("cdi", "1.1"));
        users.put("deltaspike", new User("deltaspike", "1.3"));
    }

    public void destroy(@Observes @Destroyed(ApplicationScoped.class) Object init) {
        users.clear();
    }
}

https://stackoverflow.com/questions/3600534/how-do-i-force-an-application-scoped-bean-to-instantiate-at-application-startup

