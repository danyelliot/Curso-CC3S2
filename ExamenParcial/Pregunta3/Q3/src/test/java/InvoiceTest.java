import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
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

    }