package bg.smg;

public class Jacket extends Clothes implements Comparable<Jacket>{
    private String brand, season;
    private double price;
    public Jacket(){}
    public Jacket(String brand, String season, int price) {
        this.brand = brand;
        this.season = season;
        this.price = price;
    }

    @Override
    public void sell() {
        System.out.println("Prodadeno za " + getPrice() + " lv");
    }
    @Override
    public int compareTo(Jacket o) {
        return Double.compare(this.price, o.price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "brand='" + brand + '\'' +
                ", season='" + season + '\'' +
                ", price=" + price +
                '}';
    }


}
