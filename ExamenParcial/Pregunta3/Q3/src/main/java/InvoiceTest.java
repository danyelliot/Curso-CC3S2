import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

    public class InvoiceTest{
        @Test
        void taxesForCompanies() {
            Invoice invoice = new InvoiceBuilder()
                    .asCompany()
                    .withCountry("NL")
                    .withAValueOf(2500.0)
                    .build();
            double calculatedValue = invoice.calculate();
            assertThat(calculatedValue).isEqualTo(250.0); // 2500 * 0.1 = 250
        }
}