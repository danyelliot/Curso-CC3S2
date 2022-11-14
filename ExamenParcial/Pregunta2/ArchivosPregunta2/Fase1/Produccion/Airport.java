public class Airport {

    public static void main(String[] args) {
        Flight economyFlight = new Flight("1", "Economico");
        Flight businessFlight = new Flight("2", "Negocios");

        Passenger cesar = new Passenger("Cesar", true);
        Passenger jessica = new Passenger("Jessica", false);

        businessFlight.addPassenger(cesar);
        businessFlight.removePassenger(cesar);
        businessFlight.addPassenger(jessica);
        economyFlight.addPassenger(jessica);

        System.out.println("Lista de pasajeros de vuelos de negocios:");
        for (Passenger passenger : businessFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }

        System.out.println("Lista de pasajeros de vuelos de negocios:");
        for (Passenger passenger : economyFlight.getPassengersList()) {
            System.out.println(passenger.getName());
        }
    }
}
