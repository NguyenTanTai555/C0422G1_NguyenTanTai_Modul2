package ss11_tree_map.bai_tap.baitap1;

public class Product implements Comparable<Product>{
    private int id ;
    private String name ;
    private double price ;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product" +
                "\nid :" + id +
                "\nname :" + name +
                "\nprice :" + price ;
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice()-o.getPrice());
    }
}
