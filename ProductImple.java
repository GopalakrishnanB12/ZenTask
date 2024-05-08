import java.util.Scanner;
public class ProductImple {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Product pro[]=new Product[2];        
        int maxid=0;
        System.out.println("Add five product information: Pid,Price,quantity");
        
        for(int i=0;i<2;i++){
            System.out.println("Enter Product id: ");
            int id=s.nextInt();
            System.out.println("Enter Price of the Product: ");
            int price=s.nextInt();
            System.out.println("Enter no of quantity: ");
            int quantity=s.nextInt();
            pro[i]=new Product(id,price,quantity);
        }
        productWithHighestPrice(pro, maxid);
        System.out.println("Amount spent on all products: "+amountSpentOnAllProducts(pro));

        
        
        
        


    }
    

    public static void productWithHighestPrice(Product[] pro,int maxid){
        for(int i=0;i<pro.length;i++){
            if(pro[i].price>maxid){
                maxid=pro[i].price;
            }
            maxid=pro[i].Pid;
        }
        System.out.println("Product ID which has the largest price: " + maxid);

    }
    public static int amountSpentOnAllProducts(Product pro[]){
        int total=0;
        for(int i=0;i<pro.length;i++){
            total+=(pro[i].price*pro[i].quantity);
        }
        return total;
    }
    
}
