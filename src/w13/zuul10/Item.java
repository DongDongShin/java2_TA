package w13.zuul10;

public class Item {

    private String name;
    private String description;
    private int weight;

    public Item(String itemName, String itemDescription, int itemweight) {
        this.name = itemName;
        this.description = itemDescription;
        this.weight = itemweight;
    }

    public String getLongDescription(){
        return name + " (" + weight + "Kg, " +description + ")";
    }
}
