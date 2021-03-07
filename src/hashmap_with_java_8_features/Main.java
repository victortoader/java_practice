package hashmap_with_java_8_features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Product> productsByName= new HashMap<>();

        Product eBike=new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road Bike", "A bike for competition");
        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        Product nextPurchase = productsByName.get("E-Bike");
        System.out.println("A bike with a battery" == nextPurchase.getDescription());

        Product nextPurchase2 = productsByName.get("Car");
        System.out.println(nextPurchase2 != null);

        Product chocolate = new Product("Cholocate", "At least buy chocolate");
        productsByName.put(null, chocolate);
        System.out.println(productsByName.get(null).getName());
        productsByName.remove("E-Bike");

        productsByName.containsKey("E-bike"); //o(1)

        productsByName.containsValue(eBike); //o(n)

        //iteration

        for (String key: productsByName.keySet()) {
            Product product = productsByName.get(key);
        }
        // prior to java 8

        for(Map.Entry<String, Product> entry: productsByName.entrySet()) {
            Product product = entry.getValue();
            String key = entry.getKey();
        }


        //new java 8 features
        System.out.println("Java 8 new features START");
        productsByName.forEach((key, product) ->{System.out.println("Key:" + key + "Product"+product.getDescription());});
        System.out.println("Java 8 new features END");


        Product chocolate3 = new Product("chocolate", "something sweet");
        Product defaultProduct = productsByName.getOrDefault("horse carriage", chocolate);

        productsByName.putIfAbsent("E-Bike", chocolate);

       // if (productsByName)
        Product eBike2=new Product("E-Bike", "A bike with a battery");
        eBike2.getTags().add("sport");
        productsByName.merge("E-bike", eBike2, Product::addTagsOfOtherProduct);



        for (Map.Entry<String, Product> entry: productsByName.entrySet()) {
            Product product = entry.getValue();
            String key = entry.getKey();
        }

        List<Product> productList=new ArrayList<>(productsByName.values());

        HashMap<Product, Integer> priceByProduct = new HashMap<>();
        priceByProduct.put(eBike, 900);

    }
}
