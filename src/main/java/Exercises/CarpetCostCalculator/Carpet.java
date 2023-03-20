package Exercises.CarpetCostCalculator;

import Exercises.Arithmetic.Product;
import Exercises.Arithmetic.Quadratic;

public class Carpet  {
    Carpet c=new  Product();
    public Carpet() {
    }


    protected double cost;

    public Carpet(double cost) {
        this.cost = cost;

        if(cost>0){
            this.cost=0;
        }
        else this.cost=cost;
    }

    public double getCost(){
        return cost;
    }
    public void inheritance(){
        System.out.println();
        
    }

}
