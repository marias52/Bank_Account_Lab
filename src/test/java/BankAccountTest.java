import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;


    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("maria", "Ali", "1/1/1", 1111, "currents account", 20);
    }

    @Test
    public void deposit() {
        //when
        int actual = bankAccount.calculateDeposit(10);
        //then
        int expected = 10;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void withdrawal() {
        //when
        int actual = bankAccount.calculateWithdrawal(10);
        //then
        int expected = -10;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void interestToPay() {
        //when
        double actual = bankAccount.calculateInterestToPay(100, 0.05);
        //then
        double expected = -5;
        assertThat(actual).isEqualTo(expected);
    }
    // account holder would need to pay £5 of interest when borrowing £100

    @Test
    public void interestGained() {
        //when
        double actual = bankAccount.calculateInterestGained(1000, 0.01);
        //then
        double expected = 10;
        assertThat(actual).isEqualTo(expected);
    }
    // account holder would receive £10 when they have £1000 in their account

    @Test
    public void payInterest() {
        //when
        double actual = bankAccount.calculatePayInterest("savings account", 100);
        //then
        double expected = 105;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void overdraft() {
        //when
        double actual = bankAccount.calculateOverdraft("savings account", 100);
        //then
        double expected = 105;
        assertThat(actual).isEqualTo(expected);

}