package Bank;

import java.util.List;

public class Customer {
    private List<Account> accounts;
    private Address address;

    public List<Account> getAccounts() {
        return accounts;
    }

    public Address getAddress() {
        return address;
    }

    public Customer(Address address) {
        this.address = address;
    }

    public void addAccount(Account accounts) {
        this.accounts.add(accounts);
    }

    public void updateAddress(Address address){
        this.address = address;
        accounts.forEach(account -> {
            account.updateAddress(address);
        });
    }
}
