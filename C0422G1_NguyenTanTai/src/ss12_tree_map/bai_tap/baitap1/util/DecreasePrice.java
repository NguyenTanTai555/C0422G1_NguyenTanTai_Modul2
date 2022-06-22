package ss12_tree_map.bai_tap.baitap1.util;

import ss12_tree_map.bai_tap.baitap1.model.Product;

import java.util.Comparator;

public class DecreasePrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o2.getPrice()- o1.getPrice());
    }
}
