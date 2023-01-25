import java.util.ArrayList;
import java.util.Arrays;

public class Gallery {

    private String name;
    private double till;
    private ArrayList<Artwork> stock;

    public Gallery(String name) {
        this.name = name;
        this.till = 0;
        this.stock = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Artwork> getStock() {
        return stock;
    }

    public void addArtwork(Artwork artwork) {
        stock.add(artwork);
    }


    public void sellArtwork(Artwork artwork, Customer customer) {
    }
}


