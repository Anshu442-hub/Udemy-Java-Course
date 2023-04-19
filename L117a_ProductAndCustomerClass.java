package com.company;
class Product {
    private String itemNo;
    private String name;
    private double price;
    private int qty;
    //Constructor
    public Product(String itemno) {
        this.itemNo=itemno;
    }
    public Product(String itemno,String name) {
        this.itemNo=itemno;
        this.name=name;
    }
    public Product(String itemno, String name, double price, int qty) {
        this.itemNo=itemno;
        this.name=name;
        setPrice(price);
        setQty(qty);
    }
    // Getter and setter method
    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public String toString(){
        return "Item no : "+itemNo+"\nProduct Name : "+name+"\nProduct price : "+price+"\nQuantity : "+qty;
    }

}
class Customer {
    private String custId;
    private String name;
    private String address;
    private String phone;

    //Constructors
    public Customer(String custId,String name) {
        this.custId=custId;
        this.name=name;
    }
    public Customer(String custId,String name,String address,String phone) {
        this.custId=custId;
        this.name=name;
        setAddress(address);
        setPhone(phone);
    }

    //Getter and setter method
    public String getCustId() {
        return custId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public void setAddress(String address) {
        this.address=address;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }

    public String toString(){
        return "Customer id : "+custId+"\nCustomer Name : "+name+"\nAddress : "+address+"\nContact no : "+phone;
    }
}
public class L117a_ProductAndCustomerClass {
    public static void main(String[] args) {
        Product p1=new Product("P0021");
        Product p2=new Product("P0031","Oats");
        Product p3=new Product("P0032","Peas",20.0,2);

        Customer c1=new Customer("C0045","Raj Singh");
        Customer c2=new Customer("C0090","Priya Singh","Raja Bazar","1234567890");


        System.out.println(p1);
        System.out.println("---------------------------");
        System.out.println(p2);
        System.out.println("---------------------------");
        System.out.println(p3);
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println(c1);
        System.out.println("---------------------------");
        System.out.println(c2);

    }
}
