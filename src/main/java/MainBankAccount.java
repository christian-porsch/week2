public class MainBankAccount {

    public static void main(String[] args) {

        BankAccount firstAccount = new BankAccount("123", 2000, "JohnsAccount", "john@aol.com", "0401234");
        System.out.println(firstAccount.getNumber());
        System.out.println(firstAccount.getCustomerName());
        firstAccount.depositFunds(5000);
        firstAccount.withdrawalFunds(1000);

    }


}
