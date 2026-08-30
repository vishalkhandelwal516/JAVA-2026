public class ProductInventory{
    public static void main(String[] args){
        Product p1 = new Product("A101", "Linen Shirt", 599); 
        Product p2 = new Product("A102", "Baggy Jeans", 2999, 50);
        Product p3 = new Product("A103", "Jacket", 5999.99, 80);
        System.out.println("Total Items: " + Product.getProductCount());

        System.out.println("=============================");

        System.out.println("--Product 1: Linen Shirt--");
        System.out.println("Quantity:" + p1.getQuantity());
        p1.sell(10); // no quantity to sell
        p1.restock(60);
        System.out.println("Quantity:" + p1.getQuantity());
        System.out.println("Total Price: Rs." + p1.getInventoryValue());
        p1.sell(60);
        System.out.println("Quantity:" + p1.getQuantity());

        System.out.println("=============================");

        System.out.println("--Product 2: Baggy Jeans--");
        p2.restock(50);
        System.out.println("Quantity:" + p2.getQuantity());
        System.out.println("Total Price: Rs." + p2.getInventoryValue());
        p2.sell(60); 
        System.out.println("Quantity:" + p2.getQuantity());

        System.out.println("=============================");

        System.out.println("--Product 3: Jacket--");
        p3.restock(0);
        System.out.println("Quantity:" + p3.getQuantity());
        System.out.println("Total Price: Rs." + p3.getInventoryValue());
        p3.sell(100); 
        System.out.println("Quantity:" + p3.getQuantity());

        System.out.println("=============================");

        







    }
}
