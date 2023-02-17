import Bank.Account;
import Bank.Address;
import Bank.Customer;

public class Main {

    public static void main(String[] args){
//        Cart cart = new Cart();
//        Product applePencil = new Product("Apple Pencil", new Price(20, Currency.getInstance("INR")));
//        Product sonyHeadphone = new Product("Sony Wireless headphone", new Price(30, Currency.getInstance("USD")));
//        Item sonyHeadphoneDetails = new Item(sonyHeadphone,1);
//        cart.add(sonyHeadphoneDetails);
//        Item applePencilDetails = new Item(applePencil,2);
//        cart.add(applePencilDetails);
//        cart.remove(applePencilDetails.product.getName());
//
//        List<Product> competitorProducts = new ArrayList<Product>(Arrays.asList(applePencil,sonyHeadphone));
//
//        Cart cartTwo = new Cart();
//        cartTwo.add(sonyHeadphoneDetails);
//        cartTwo.add(applePencilDetails);
//        cartTwo.remove(applePencilDetails.product.getName());
//
//        System.out.println(cartTwo.equals(cart));
//
//        cart.showCartDetails();

        Address delhi = new Address("Delhi");
        Address pune = new Address("Pune");
        Customer customer = new Customer(delhi);
        Account account = new Account(pune);
        customer.addAccount(account);
        customer.updateAddress(delhi);
        System.out.println(customer.getAddress() + " " + customer.getAccounts());
    }
}
