package IFCallback;

public class Truck {

    ComputeWeight []things =  new ComputeWeight[3];
    protected double sumWeight=0;

    public double getSumWeight() {
        return sumWeight;
    }

    Truck(){
        things[0]=new Television();
        things[1]=new Computer();
        things[2]=new WashMachine();
        for (int i=0; i<things.length; i++){
            sumWeight+=things[i].computeWeight();
        }
    }


    public static void main(String[] args) {
        Truck truck=new Truck();
        System.out.println("货车装在的货物质量为："+truck.getSumWeight()+"kg.");
    }
}
