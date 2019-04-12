package guru.springframework.services;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello! Primary greeting service";
    }

    @Override
    public String getGermanGreeting() {
        return "Hallo! Primärer Begrüßungsdienst";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola! Servicio de Saludo Primario";
    }
}
