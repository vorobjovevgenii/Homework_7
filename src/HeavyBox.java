public class HeavyBox {
    private double weight;
    private String owner;

    public HeavyBox() {}

    public HeavyBox(Double weight, String owner){
        this.weight = weight;
        this.owner = owner;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    @Override
    public String toString(){
        return "owner = " + owner + "; weight = " + weight;
    }

}
