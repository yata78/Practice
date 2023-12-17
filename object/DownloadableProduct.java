package object;

public class DownloadableProduct {
    public String title;
    public String description;
    public double price;
    public double sizeMb;
    public String extension;

    public DownloadableProduct(String title, String description, double price,double sizeMb, String extension){
        this.title = title;
        this.description = description;
        this.price = price;
        this.sizeMb = sizeMb;
        this.extension = extension;
    }

    public double getFInalPrice(Tax taxObject){
        return this.price * (1 + taxObject.federalTax + taxObject.stateTax + taxObject.localTax);
    }
}

class Main{
    public static void main(String[] args){
        DownloadableProduct product1 = new DownloadableProduct("A hero returns - Remastered", "A movie about a hero who saves the world.", 23.5, 13000, "mp4");

    }
}
