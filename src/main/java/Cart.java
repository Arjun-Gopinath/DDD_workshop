import java.util.*;

public class Cart {
    private final List<Item> items;
    private final List<Item> removedProducts;

    public void getProducts() {
//        products =
//        items.forEach(item -> {
//            for (int i = 0; i <= item.quantity; i++) {
//                pro
//            }item.quantity
//        });
    }

    Cart(){
        this.items = new ArrayList<>();
        this.removedProducts = new ArrayList<>();
    }

    public void add (Item product){
        this.items.add(product);
    }

    public void remove(String productName){
        Iterator<Item> iterator = this.items.iterator();
        while(iterator.hasNext()){
            Item productDetails = iterator.next();
            if(Objects.equals(productDetails.product.getName(), productName)){
                removedProducts.add(productDetails);
                iterator.remove();
            }
        }
    }

    public void showCartDetails(){
        System.out.println("Added Products : " + Arrays.toString(new List[]{items}));
        System.out.println("Removed Products : " + Arrays.toString(new List[]{removedProducts}));
    }

}
