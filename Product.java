public class Product {
    int Pid;
    int price;
    int quantity;
    public int getPid() {
        return Pid;
    }
    public void setPid(int pid) {
        Pid = pid;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    @Override
    public String toString() {
        return "Product [Pid=" + Pid + ", price=" + price + ", quantity=" + quantity + ", getPid()=" + getPid()
                + ", getPrice()=" + getPrice() + ", getQuantity()=" + getQuantity() + "]";
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    Product(){
        
    }
    Product(int pid,int price,int quan){
        this.Pid=pid;
        this.price=price;
        quantity=quan;

    }
    
}
