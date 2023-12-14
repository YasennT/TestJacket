package bg.smg;

public class Jacket extends Clothes implements Comparable<Jacket>{
    private String brand, season;
    private int price;
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
        return 0;
    }
//    public int compare(Integer j1, Integer j2) {
//        j1.compare(this.price, j2.price);
//        return 0;
//    }

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

    public int getPrice() {
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