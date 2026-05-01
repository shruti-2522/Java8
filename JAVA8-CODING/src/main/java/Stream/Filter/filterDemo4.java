package Stream.Filter;

import java.util.ArrayList;
import java.util.List;


public class filterDemo4 {
    public static void main(String[] args) {
        List<Product> productList=new ArrayList<>();
        productList.add(new Product(1,"Iphone",75000));
        productList.add(new Product(1,"Samsung",85000));
        productList.add(new Product(1,"Google Pixel",150000));


        productList.stream()
                .filter(p->p.price>25000)
                .forEach(pr-> System.out.println(pr.price));
    }
}
