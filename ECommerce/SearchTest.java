import java.util.Arrays;
import java.util.Comparator;
public class SearchTest {
    public static void main(String[] args) {
        Product products[] = {
            new Product(
                101,
                "Laptop",
                "Electronics"
            ),
            new Product(
                102,
                "Shoes",
                "Fashion"
            ),
            new Product(
                103,
                "Mobile",
                "Electronics"
            )
        };
        System.out.println("Linear Search:");
        Product result1 =
        Search.linearSearch(products,"Mobile");
        if(result1 != null)
            result1.display();
        Arrays.sort(
            products,
            Comparator.comparing(p -> p.productName)
        );
        System.out.println("Binary Search:");
        Product result2 =
        Search.binarySearch(products,"Shoes");
        if(result2 != null)

            result2.display();
    }

}