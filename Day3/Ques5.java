import java.util.ArrayList;
class Store{
static String storeName;
static String storeLocation;
static  void setStoreDetails(String storeName, String storeLocation)
{
Store.storeName=storeName;
Store.storeLocation=storeLocation;
}
 void  displayStoreDetails()
{
System.out.println("The name of the Store is:"+storeName);
System.out.println("The Location of the Store is:"+storeLocation);
}
ArrayList<Product> productDetails=new ArrayList<>();
void addProduct(Product product)
{
productDetails.add(product);
}
void displayProductDetails()
{
for(Product  products:productDetails)
{
products.displayProduct();
}
}
}
class Product
{
int product_id;
String name;
int price;
int quantity;
Product(int product_id,String name,int price,int quantity)
{
this.product_id=product_id;
this.name=name;
this.price=price;
this.quantity=quantity;
}
void displayProduct()
{
System.out.println("Product Id is: \t "+this.product_id +"\nProduct name:\t" +this.name+"\nProduct price:\t"+this.price+"\nProduct Quantity :\t"+this.quantity);
}
}
public class Ques5
{
public static void main(String []args)
{
Store myStore=new Store();
myStore.setStoreDetails("Janapriya","Chennai");
myStore.displayStoreDetails();
Product obj1=new Product(1,"Perfume",200,2);
Product obj2=new Product(2,"Soap",100,3);
Product obj3=new Product(3,"Moisturizer",700,4);
Product obj4=new Product(4,"Toner",400,3);
myStore.addProduct(obj1);
myStore.addProduct(obj2);
myStore.addProduct(obj3);
myStore.addProduct(obj4);
System.out.println("\n -------- product details----\n");
myStore.displayProductDetails();
}
}



