package lesson16;

import com.sun.source.tree.Tree;

import java.util.*;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String nameOfProduct, int value) {
        nameOfProduct = nameOfProduct.toLowerCase();
        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            products.put(nameOfProduct, value + currentValue);
        } else {
            products.put(nameOfProduct, value);
        }
    }

    public void printAllProducts() {
        for (Map.Entry<String, Integer> pr : products.entrySet()) {
            System.out.println(pr.getKey() + "-" + pr.getValue() + " грамм");
        }
    }

    public void printAllProducts2() {
        for (String prname : products.keySet()) {
            System.out.println(prname + "-" + products.get(prname) + " грамм");

        }
    }

    // взять продукт с холодильника - *
    // вывести на консоль какой продукт заканчивается (закончится самым первым) - *
    // вывести вес всех продуктов в холодильнике
    // вывести продукты и вес в отсортированном формате по названию
    // вывести продукты и вес в отсортированном формате по весу


    public void takeProduct(String nameOfProduct, int value) {
        nameOfProduct = nameOfProduct.toLowerCase();
        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            if (currentValue >= value) {
                products.put(nameOfProduct, currentValue - value);
                System.out.println("взял " + value + " грамм " + nameOfProduct);
            } else {
                System.out.println(nameOfProduct + " не хватает в холодильнике");
            }
        }
    }

    public void firstEndProduct() {
        Map.Entry<String, Integer> minEntry = Collections.min(products.entrySet(),
                Map.Entry.comparingByValue());
        System.out.println("заканчивающийся продукт - " + minEntry.getKey());
    }

    public void totalWeight() {
        int totalWeight = 0;
        for (int value : products.values()) {
            totalWeight += value;
        }
        System.out.println("вес продуктов -" + totalWeight + " грамм");
    }


    public void sortedByName() {
        List<Map.Entry<String,Integer>> sortedProduct = new ArrayList<>(products.entrySet());
        Collections.sort(sortedProduct,Map.Entry.comparingByKey());

        System.out.println("сортировка по названию ");
        for (Map.Entry<String, Integer> entry : sortedProduct) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " грамм");
        }
    }

    public void sortedByValue(){
        List<Map.Entry<String,Integer>> sordetList = new ArrayList<>(products.entrySet());
        Collections.sort(sordetList,Map.Entry.comparingByValue());

        System.out.println("сортировка по весу ");
        for (Map.Entry<String,Integer> entry : sordetList){
            System.out.println(entry.getKey() + " " + entry.getValue()+ " грамм");
        }
    }


}
