package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "\nHello World\t-Primary Bean-";
    }
}
