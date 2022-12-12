import java.util.ArrayList;

public class ShoppingList {
    ArrayList<Product> list = new ArrayList<Product>();

    public void add(Product product) {
        list.add(product);
    }

    public String toString() {
        String str = "";
        for (Product product : list ) {
            str += product.getName() + ", ";
        }
        return str;
    }

    public int total() {
        int count=0;
        for (Product product : list ) {
            count += product.getQuantity();
        }
        return count;
    }

public static void main(String[] args) {
    Product p1 = new Product("milk",2);
    Product p2 = new Product("apple",4);
    ShoppingList list1 = new ShoppingList();
    list1.add(p1);
    list1.add(p2);
    System.out.println(list1.toString());
    System.out.println(list1.total());
}  
}
