package Exercises.Arithmetic;

import Exercises.CarpetCostCalculator.Carpet;

public class Product extends Carpet {
  protected  int itemNo;
   private String Name;
   private double price;
   protected int qty;

    public Product() {

    }

    public int getItemNo() {
        return itemNo;
    }

    public String getName() {
        return Name;
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

    public Product(int itemNo, String name) {
        this.itemNo = itemNo;
        Name = name;
    }

    public Product(int itemNo, String name, double price, int qty) {
        this.itemNo = itemNo;
        Name = name;
        this.price = price;
        this.qty = qty;
    }
    private void hello(){

    }
}
