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

// conditional statements for checking stock of artwork
    public void sellArtwork(Artwork artwork, Customer customer) {
        if (stock.contains(artwork)){
            stock.remove(artwork);
            customer.buyArtwork(artwork);
            till += artwork.getPrice();
        } else {
            System.out.println("Sorry we do not have that artwork");
        }
    }

    public double stock_take(){
        double total = 0;
        for (Artwork artwork : stock){
            total += artwork.getPrice();
        }
        return total;
    }

}


