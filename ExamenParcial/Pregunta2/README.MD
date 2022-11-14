# Pregunta 2 ( 12 puntos)
## Pregunta 1 (0.5 puntos): Ejecuta el programa y presenta los resultados y explica qué sucede.

Salida :

>`Lista de pasajeros de vuelos de negocios: Cesar`

>`Lista de pasajeros de vuelos economicos: Jessica`

Explicación : 

- Se crean objetos para los vuelos (economyFlight , businessFlight) de tipo Flight con sus atributos respectivos.
- Se crean objetos para los pasajeros (cesar , jessica ) de tipo Passenger con sus atributos respectivos.
- Se prueba los metodos con los requerimientos establecidos , como :
- Añadir un pasajero(Cesar) a un vuelo de negocios , como el posee el atributo boolean VIP = True se le permite añadirlo.
- Retirar un pasajero(Cesar) de un vuelo de negocios , pero no se puede eliminar ya que es VIP.
- Añadir un pasajero(jessica) a un vuelo de negocios , como ella posee el atributo boolean VIP = False (no es VIP), no se le permite añadirla.
- Añadir un pasajero(jessica) a un vuelo de economico , como se permite añadir a cualquier tipo de pasajero a los vuelos economy , se le añade.
- Finalmente se imprime la lista con los nombres de pasajeros de cada tipo de vuelo. Resultando lo esperado inicialmente en la prueba manual del código.

<img src="https://i.imgur.com/5urmwQ8.png" height="600">

## Pregunta 2 (1 punto) : Si ejecutamos las pruebas con cobertura desde IntelliJ IDEA,¿cuales son los resultados que se muestran?,¿Por qué crees que la cobertura del código no es del 100%?

> La cobertura del codigo muestra un 66% en todas las clases , 80% en los métodos y los demas valores en la imagen. Ahora , la cobertura no es del 100% ya que inicialmente la clase Airport no se utiliza mientras que la clase Flight y Passenger si , pero el método  getFlightType() no se cubre en la parte de las pruebas. Al igual que el método addPassenger() , parte de los casos en sus lineas de código no son cubiertas como el ` switch (flightType) ` y su caso predeterminado `default:
                throw new RuntimeException("Tipo desconocido: " + flightType);`
Al igual que `removePassenger` y el mismo caso predeterminado `default :` en el `switch`.

>Debido a esto el coverage no es del el 100% .

<img src="https://i.imgur.com/dEsonJz.png" height = "200">

<img src="https://i.imgur.com/eRB9VeB.png" height = "600">


## Pregunta 3 (0.5 punto) : ¿ Por qué John tiene la necesidad de refactorizar la aplicación?.

> Una razón principal es el hecho de no cubrir todos los casos posibles que puedan tener los métodos , ademas tener exceso de código como la clase Aeropuerto que si bien antes de realizar el TDD servia para probar manualmente los tipos de pasajeros , esto se reemplaza por las pruebas. 
Tambien haciendo referencia a los métodos addPassenger() en sus lineas que no se ejecutan , estas tienen relacion con el tipo de vuelo que se brinda , ya que solamente tenemos como tipos de vuelo VIP y regular . Entonces seria innecesario agregar un caso mas ya que este no se ejecutaria nunca. 


## Pregunta 4 (0.5 puntos) : Revisa la Fase 2 de la evaluación y realiza la ejecución del programa y analiza los resultados.

> Se ha utiliza la jerarquia en las clases , reemplazando el metodo flightType() . Adicionalmente se elimino la clase Airport que ya no era necesaria debido a que en las pruebas se cubre todos los posibles casos de tipo de vuelo(2) y tipo de pasajero(2).
> En cada nueva clase de tipo de vuelo(Business y Economy) que se extiende de la clase abstracta Flight() , al momento de realizar pruebas si utiliza todos los casos posibles que se describieron en la prueba anterior y posteriormente se vera si cubre el 100% con la cobertura.

<img src="https://i.imgur.com/odjpRBu.png" height = "600">

> Como se mencionó anteriormente , con la refactorización del código se logro cubrir el 100% de la cobertura de todo el código.

<img src="https://i.imgur.com/cB47rgM.png" >

## Pregunta 5 (3 puntos) : La refactorización y los cambios de la API se propagan a las pruebas. Reescribe el archivo Airport Test de la carpeta Fase 3. 

```
public class AirportTest {
…
}
```
Y responde las siguientes preguntas:
- ¿Cuál es la cobertura del código ?
- ¿ La refactorización de la aplicación TDD ayudó tanto a mejorar la calidad del código?.

### Respuesta 

> La cobertura del código es del 100% 

> Sí , se evidencia en la manera de entender el mecanismo de funcionamiento de las clases leyendo el código , además de estructura de mejor manera el funcionamiento y la distribución de los tipos de vuelo (EconomyFlight() ,BusinessFlight) que heredan de la clase abstracta Flight() mediante el polimorfismo. Esto conllevara a que el código se pueda escalar , quiza añadiendo nuevos tipos de vuelo o agregando otras funcionalidades sin necesidad de alterar la funcionalidad base del programa.

<img src = "https://i.imgur.com/UGAm5pL.png">

```
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


```
<img src = "https://i.imgur.com/Dksvi2X.png" height = "250">

<img src = "https://i.imgur.com/DmFGcYV.png" height = "500">



## Pregunta 6 (0.5 puntos) : ¿En qué consiste está regla relacionada a la refactorización?. Evita utilizar y copiar respuestas de internet. Explica como se relaciona al problema dado en la evaluación.

> Al momento de escribir código similar , se esta duplicando . Y esto se puede tolerar hasta cierto punto , pero si se vuelve a escribir código similar por tercera vez esto ya conlleva a que es necesario refactorizar el código . Ya que al tener las mismas instrucciones en común se cae en la redundancia y esto conlleva problemas a futuro porque al quere cambiar algo , por mas pequeño que sea. Como este pequeño cambio se aplica a una parte que se duplica de otra y otra (se triplica) se debe realizar la refactorizacion a las instrucciones y esto provoca un mal mantenimiento o un excesivo uso de tiempo y recurso para realizar pequeños cambios. Y según va aumentando el hecho de repetir las instrucciones. Mas sera la carga de trabajo al realizar el mantenimiento del código , por eso la regla de tres. Duplicar , se tolera . Triplicar , ya no. Se refactoriza en este caso.

>Y aplicado a nuestro problema , al ya tener practicamente duplicado las pruebas para los tipos vuelo Economy y Business , al añadir un nuevo tipo de vuelo se tendria que realizar las mismas pruebas que en Economy y Business , y no seria lo indicado según la regla de Tres. Por lo tanto debemos refactorizar las pruebas que usamos.


## Pregunta 7 (1 punto) : Escribe el diseño inicial de la clase llamada PremiumFlight y agrega a la Fase 4 en la carpeta producción.

```
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
```


## Pregunta 8 (2 puntos): Ayuda a John e implementa las pruebas de acuerdo con la lógica comercial de vuelos premium de las figuras anteriores. Adjunta tu código en la parte que se indica en el código de la Fase 4. Después de escribir las pruebas, John las ejecuta.

```
// Completa la prueba para PremiumFlight de acuerdo a la logica comercial dada. Pregunta 8

    @DisplayName("Dado que hay un vuelo Premium")
    @Nested
    class PremiumFlightTest{

        private Flight premiumFlight;
        private Passenger jessica;
        private Passenger cesar;

        @BeforeEach
        void setUp() {
            premiumFlight = new PremiumFlight("3");
            jessica = new Passenger("Jessica", false);
            cesar = new Passenger("Cesar", true);
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero regular")
        class RegularPassenger {

            @Test
            @DisplayName("Entonces no puede agregarlo o eliminarlo de un vuelo de Premium")
            public void testPremiumFlightRegularPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero regular y un vuelo de negocios",
                        () -> assertEquals(false, premiumFlight.addPassenger(jessica)), // jessica no es VIP
                        () -> assertEquals(0, premiumFlight.getPassengersList().size()), // tamaño = vacio
                        () -> assertEquals(false, premiumFlight.removePassenger(jessica)), //no puede eliminar ,a quien no añadio
                        () -> assertEquals(0, premiumFlight.getPassengersList().size()) // sigue siendo nula la cantidad de pasajeros
                );
            }
        }

        @Nested
        @DisplayName("Cuando tenemos un pasajero VIP")
        class VipPassenger {

            @Test
            @DisplayName("Luego puedes agregar y tambien eliminar de un vuelo de Premium")
            public void testBusinessFlightVipPassenger() {
                assertAll("Verifica todas las condiciones para un pasajero VIP y un vuelo de negocios",
                        () -> assertEquals(true, premiumFlight.addPassenger(cesar)), // Cesar es VIP , se puede agregar
                        () -> assertEquals(1, premiumFlight.getPassengersList().size()), // Cesar es un pasajero , entonces cantidad = 1
                        () -> assertEquals(true, premiumFlight.removePassenger(cesar)), // Si se puede eliminar un pasajero sea VIP o regular
                        () -> assertEquals(0, premiumFlight.getPassengersList().size()) // Al eliminar a Cesar que es VIP , cantidad  = 0
                );
            }
        }

    }


```

<img src="https://i.imgur.com/XH72sPo.png" >

> Los resultados de las pruebas salen en rojo , debido a que no existe aun lógica en el caso de eliminar o agregar a un pasajero VIP . Nos deberia devolver True , pero por defecto al construir el diseño inicial de PremiumFlight() es devolvernos False , por esa razón nos aparece error en esa parte. 

<img src="https://i.imgur.com/fSASXIJ.png" height="500">


## Pregunta 9 (2 puntos): Agrega la lógica comercial solo para pasajeros VIP en la clase PremiumFlight.
Guarda ese archivo en la carpeta Producción de la Fase 5.
```
public class PremiumFlight extends Flight {
…
}
Ejecuta el código anterior copiando la respuesta de la pregunta 8 en la carpeta de Pruebas de la Fase 5.
```

### Respuesta 

```
public class PremiumFlight extends Flight {

    public PremiumFlight(String id) {
        super(id);
    }
    @Override
    public boolean addPassenger(Passenger passenger) {
        if (passenger.isVip()) {
            return passengers.add(passenger);
        }
        return false;
    }
    @Override
    public boolean removePassenger(Passenger passenger) {
        if (passenger.isVip()) {
            return passengers.remove(passenger);
        }
        return false;
    }
}
```
> La ejecución en la carpeta Pruebas con la logica comercial añadidad a la clase PremiumFlight , ahora si ejecuta de manera correcta el agregar y eliminar a un pasajero VIP , ya que anteriormente solo devolvia False . Ahora con la logica si es VIP se puede agregar y retorna True , y a pesar de ser VIP tambien se puede eliminar en el vuelo Premium.

<img src = "https://i.imgur.com/6Oz4Z9Y.png">

<img src = "https://i.imgur.com/GFOCPfq.png" height = "600">


## Pregunta 10 (1 punto) Ayuda a John a crear una nueva prueba para verificar que un pasajero solo se puede agregar una vez a un vuelo de manera que John ha implementado esta nueva característica en estilo TDD.

### Respuesta

La prueba completa se encuentra en [Airport Test](https://github.com/danyelliot/Curso-CC3S2/blob/main/ExamenParcial/Pregunta2/ArchivosPregunta2/Fase5/Pruebas/AirportTest.java "AirportTest Fase 5")

```
@DisplayName("Entonces no puedes agregarlo a un vuelo Premium mas de una vez.")
@RepeatedTest(5)
    public void testBusinessFlightVipPassengerAddedOnlyOnce(RepetitionInfo repetitionInfo) {
        for (int i = 0; i < repetitionInfo.getCurrentRepetition(); i++) {
            premiumFlight.addPassenger(cesar);
        }
        assertAll("Verifica que un pasajero VIP se pueda agregar a un vuelo de Premium} solo una vez",
            () -> assertEquals(1, premiumFlight.getPassengersSet().size()),
            () -> assertTrue(premiumFlight.getPassengersSet().contains(cesar)),
            () -> assertTrue(new ArrayList<>(premiumFlight.getPassengersSet()).get(0).getName().equals("Cesar"))
        );
    }
```

<img src = "https://i.imgur.com/wFKZhPJ.png">


<img src = "https://i.imgur.com/YGuwrTL.png" height="800">