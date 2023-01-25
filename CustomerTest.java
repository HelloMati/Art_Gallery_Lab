import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CustomerTest {

    @Test
    public void testGetName(){
        Customer customer = new Customer("Tim", 10);
        assertThat("Tim", customer.getName());
    }

    @Test
        public void testGetWallet() {
        Customer customer = new Customer("Tim", 10);
        assertThat("Tim", customer.getWallet());
        
    }

    private void assertThat(String tim, int wallet) {
    }


}
