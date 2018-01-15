public abstract class Ride {
    private static int height;
    private double price;
    private int minAge;

    public Ride(double price, int minAge, int height){
        this.price = price;
        this.minAge = minAge;
        this.height = height;
    }


    public double getPrice() {
        return this.price;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public static int getHeight() {
        return height;
    }
}
