package bg.smg;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Jacket> jackets = new ArrayList<>();
        Jacket jacket1 = new Jacket("LV","prolet", 400);
        jackets.add(jacket1);
        Jacket jacket2 = new Jacket("Gucci","leto", 3000);
        jackets.add(jacket2);
        Jacket jacket3 = new Jacket("Nike","zima", 50);
        jackets.add(jacket3);
        Jacket jacket4 = new Jacket("Adidas","esen", 609);
        jackets.add(jacket4);
        Collections.sort(jackets.);
        for(int i=0; i<4; i++){
            jackets.get(i).sell();
        }
    }
}
