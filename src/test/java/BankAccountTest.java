import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setup() {
        bankAccount = new BankAccount("Maria", "Ali", "1/1/1", 1111, "Currents account", 20);
    }

    @Test
    public void canGetFirstName() {
        assertThat(bankAccount.getFirstName()).isEqualTo("Maria");
    }

    @Test
    public void canGetLastName() {
        assertThat(bankAccount.getLastName()).isEqualTo("Ali");
    }

    @Test
    public void canGetDateOfBirth() {
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("1/1/1");
    }

    @Test
    public void canGetAccountNumber() {
        assertThat(bankAccount.getAccountNumber()).isEqualTo(1111);
    }

    @Test
    public void canGetBalance() {
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void canSetFirstName() {
        bankAccount.setFirstName("Maria");
        assertThat(bankAccount.getFirstName()).isEqualTo("Maria");
    }


    @Test
    public void CanSetLastName() {
        assertThat(bankAccount.getLastName()).isEqualTo("Ali");
    }

    @Test
    public void canSetDateOfBirth() {
        assertThat(bankAccount.getDateOfBirth()).isEqualTo("1/1/1");
    }

    @Test
    public void canSetAccountNumber(){
        assertThat(bankAccount.getAccountNumber()).isEqualTo(1111);
    }

    @Test
    public void canSetBalance(){
        assertThat(bankAccount.getBalance()).isEqualTo(0);
    }

    @Test
    public void canDepositFunds() {
        //when
        int actual = bankAccount.calculateDeposit(10);
        //then
        int expected = 10;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void caWithdrawFunds() {
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
        double actual = bankAccount.calculateOverdraft( 100);
        //then
        double expected = -80;
        assertThat(actual).isEqualTo(expected);
    }

}