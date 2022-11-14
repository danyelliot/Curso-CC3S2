public class PremiumFlight extends Flight {

    // Pregunta 7
    public PremiumFlight(String id) {
        super(id);
    }
    @Override
    public boolean addPassenger(Passenger passenger) {

        return false; // aun no añadimos la lógica de los pasajeros VIP , segun el TDD iniciamos en las pruebas
        // lo unico que hacemos es escribrir el diseño inicial
    }
    @Override
    public boolean removePassenger(Passenger passenger) {

        return false;
    }

}

