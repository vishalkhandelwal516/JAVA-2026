public class Product 
{
    private String code, name;
    private int quantity=0;
    private double unitPrice;
    private static int ProductCount=0;
    Product(String code, String name, double unitPrice){
        if (code==null || code.isBlank()){
            this.code = "not fetched";
        } else {
            this.code = code;
        }
        if (name==null || name.isBlank()){
            this.name = "not fetched";
        } else {
            this.name = name;
        }
        if (unitPrice>0){
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Unit Price cannot be zero/ negative.");
        }
        ProductCount++;
        
    }
    Product(String code, String name, double unitPrice, int quantity){
        if (code==null || code.isBlank()){
            this.code = "not fetched";
        } else {
            this.code = code;
        }
        if (name==null || name.isBlank()){
            this.name = "not fetched";
        } else {
            this.name = name;
        }
        if (unitPrice>0){
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Unit Price cannot be zero/ negative.");
        }
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative !");
        }
        ProductCount++;
        
    }

    public String toString(){
        return "Item code: " + code + " |Name: " + name + " |Unit Price per item: Rs."+ unitPrice + " |Quantity: " + quantity;
    }

    void restock(int amount){
    if(amount>0){
        quantity +=amount;
        System.out.println("Restocking Successfully !");
    } else {
        System.out.println("You entered a 0 value to restock !");
    }
    }


    void sell(int amount){
    if(amount<=quantity){
        quantity -=amount;
        System.out.println("Selling Successfully !");
    } else {
        System.out.println("Cannot sell more than the quantity available !");
    }
    }

    double getInventoryValue(){
        return unitPrice*quantity;
    }

    int getQuantity(){
        return quantity;
    }

    static int getProductCount(){
        return ProductCount;
    }

}
