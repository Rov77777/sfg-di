package guru.springframework.sfgdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {

        System.out.println("\nGreetingServiceImpl.sayGreeting():");
        return "\nHello World 7";
    }
}
