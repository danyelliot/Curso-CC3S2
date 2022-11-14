# Pregunta 3 (5 puntos)

## Pregunta 1 (0.5 puntos) :¿Cuales son los problemas de este código de prueba?.

> Inicialmente el nombre de la prueba , no sigue una regla para definir a que realiza la prueba. Esto, aumentando lineas de codigo , clases y metodos generaria un grave error , de identificacion en las pruebas.
Adicionalmente que la clase Invoice(Factura) debe tener mas atributos que describan exactamente la factura que es lo que se supone que se trata de hacer. Y esto conlleva a que no se pueda reconocer de manera legible. De igual forma , el new BigDecimal era incorrecto el tipo de dato ya que inicialmente se definio como double.

<img src="https://i.imgur.com/bOzkWDz.png" >


## Pregunta 2 (1 punto) : Escribe una versión más legible de este código prueba. Recuerda llamarlo InvoiceTest.java

```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class InvoiceTest{
        @Test
        void taxesCompanies() {
            Invoice invoice = new InvoiceBuilder()
                    .asCompany()
                    .withCountry("NL")
                    .withAValueOf(2500.0)
                    .build();
            double calculatedValue = invoice.calculate(); //taxes = 0.1
            assertEquals(calculatedValue,250);  // 2500 * 0.1 = 250 -> esperado
            assertEquals("NL",invoice.Country());
            assertEquals(2500.0,invoice.Value());
        }
}
```

<img src="https://i.imgur.com/GZnEiYm.png">

<img src="https://i.imgur.com/DflcrEb.png">


## Pregunta 3 (1 punto) : Implementa InvoiceBuilder.java. Siéntete libre de personalizar sus constructores. Un truco común es hacer que el constructor construya una versión común de la clase sin requerir la llamada a todos los métodos de configuración.

```
public class InvoiceBuilder {
    private String country = "NL";
    private CustomerType customerType = CustomerType.PERSON;
    private double value = 500;
    public InvoiceBuilder withCountry(String country) {
        this.country = country;
        return this;
    }
    public InvoiceBuilder asCompany() {
        this.customerType = CustomerType.COMPANY;
        return this;
    }
    public InvoiceBuilder withAValueOf(double value) {
        this.value = value;
        return this;
    }
    public Invoice build() {
        return new Invoice(value, country, customerType);
    }

}

```
Se agrego metodos en Invoice , para que al realizar las pruebas de InvoiceBuilder pueda devolver los valores que estos establecen.

```
public String Country(){
        return this.country;
    }
    public double Value(){
        return this.value;
    }
    public CustomerType customerType(){
        return this.customerType;
    }
```



## Pregunta 4 (0.5 puntos) : Escribe en una línea una factura compleja. Muestra los resultados

```
@DisplayName("Factura Compleja")
@Test
    void complexTaxesCompanies(){

        Invoice facturaCompleja = new InvoiceBuilder()
                .withCountry("PE")
                .withAValueOf(8000.0)
                .build();
        double calculatedValue = facturaCompleja.calculate(); //taxes = 0.1
        assertEquals(calculatedValue,800); // 8000 * 0.1 = 800 -> esperado
        assertEquals("PE",facturaCompleja.Country());
        assertEquals(8000.0,facturaCompleja.Value()); // Por defecto value = 500

        }
```

<img src="https://i.imgur.com/TpM8cDK.png">

<img src="https://i.imgur.com/wfhYpPr.png" height = "600">


## Pregunta 5 (1 punto) : Agrega este listado en el código anterior y muestra los resultados

```
@DisplayName("métodos abreviados ")
    @Test
    void shortTaxesCompanies(){
    
        Invoice shortInvoice = new InvoiceBuilder()
                .asCompany()
                .fromTheUS();
        double calculatedValue = shortInvoice.calculate(); //taxes = 0.1
        assertEquals(calculatedValue,50);// Por defecto value = 500 -> 500 * 0.1 = 50
        assertEquals("US",shortInvoice.Country());
        assertEquals(500.0,shortInvoice.Value()); // Por defecto value = 500
            
        }
```

<img src="https://i.imgur.com/can2laX.png">

<img src="https://i.imgur.com/SAv2GWi.png">
https://i.imgur.com/SAv2GWi.png


## Pregunta 6 (1 punto): Agrega este listado en el código anterior y muestra los resultados .

```
@Test
    void taxesForCompanyAreTaxRateMultipliedByAmount() {
        double invoiceValue = 2500.0;
        double tax = 0.1;
        Invoice invoice = new InvoiceBuilder()
                .asCompany()
                .withCountry("NL")
                .withAValueOf(invoiceValue)
                .build();
        double calculatedValue = invoice.calculate();
        assertEquals(2500*0.1,invoiceValue * tax);
    }
```

<img src="https://i.imgur.com/4uITMVN.png">

<img src="https://i.imgur.com/JbAkx6j.png">

