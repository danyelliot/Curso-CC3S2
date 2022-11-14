import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @DisplayName("Pruebas de vuelo Economico : Pasajeros (Regular , VIP) ")
    @Nested
    class EconomyFlightTest {

        private Flight economyFlight;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("ID_vuelo_regular");
        }

        @Test
        public void testEconomyFlightRegularPassenger() {
            Passenger pasajero1 = new Passenger("Carlos Malvaceda", false);

            assertEquals("ID_vuelo_regular", economyFlight.getId()); //Debe mostrar el id del vuelo Economy
            assertEquals(true, economyFlight.addPassenger(pasajero1)); // pasajero Regular en vuelo Economy (True)
            assertEquals(1, economyFlight.getPassengersList().size()); // cantidad de pasajeros en vuelo Economy = 1
            assertEquals("Carlos Malvaceda", economyFlight.getPassengersList().get(0).getName()); // mostrar nombre de pasajero 0 en vuelo Economy = Carlos M.
            assertEquals(true, economyFlight.removePassenger(pasajero1));// remover pasajero regular de vuelo Economy = true , ya que no es VIP
            assertEquals(0, economyFlight.getPassengersList().size()); // cantidad de pasajeros en vuelo Economy = 0  , ya que removieron al unico pasajero
        }

        @Test
        public void testEconomyFlightVipPassenger() {
            Passenger pasajero2 = new Passenger("Dany Elliot", true);

            assertEquals(true, economyFlight.addPassenger(pasajero2)); // pasajero VIP en vuelo Economy (True)
            assertEquals(1, economyFlight.getPassengersList().size()); // cantidad de pasajeros en vuelo Economy = 1
            assertEquals("Dany Elliot", economyFlight.getPassengersList().get(0).getName()); // mostrar nombre de pasajero 0 en vuelo Economy = Dany Elliot
            assertEquals(false, economyFlight.removePassenger(pasajero2)); // remover pasajero regular de vuelo Economy = false , ya que es VIP
            assertEquals(1, economyFlight.getPassengersList().size());// cantidad de pasajeros en vuelo Economy = 1  , ya que no removieron al VIP
        }
    }

    @DisplayName("Pruebas de vuelo Negocios : Pasajeros (Regular , VIP)")
    @Nested
    class BusinessFlightTest {
        private Flight businessFlight;

        @BeforeEach
        void setUp() {
            businessFlight = new BusinessFlight("ID_vuelo_business");
        }

        @Test
        public void testBusinessFlightRegularPassenger() {
            Passenger pasajero1 = new Passenger("Carlos Malvaceda", false);

            assertEquals("ID_vuelo_business", businessFlight.getId()); //Debe mostrar el id del vuelo Business
            assertEquals(false, businessFlight.addPassenger(pasajero1)); // pasajero Regular en vuelo Business (False)
            assertEquals(0, businessFlight.getPassengersList().size()); // cantidad de pasajeros en vuelo Business = 0
            assertEquals(false, businessFlight.removePassenger(pasajero1));
            // remover pasajero1 (Carlos Malvaceda) de vuelo Business = false , ya que no esta en el vuelo)
            assertEquals(0, businessFlight.getPassengersList().size()); // // cantidad de pasajeros en vuelo Business = 0 , no se agrego ni se quito a nadie
        }

        @Test
        public void testBusinessFlightVipPassenger() {
            Passenger pasajero2 = new Passenger("Dany Elliot", true);
            assertEquals(true, businessFlight.addPassenger(pasajero2)); // pasajero VIP en vuelo Business (true)
            assertEquals(1, businessFlight.getPassengersList().size()); // cantidad de pasajeros en vuelo Business = 1
            assertEquals(false, businessFlight.removePassenger(pasajero2)); // remover pasajero VIP del vuelo Business = false , VIP no se puede eliminar
            assertEquals(1, businessFlight.getPassengersList().size()); // cantidad de pasajeros en Business = 1 , el VIP no se puede eliminar
        }
    }

}
