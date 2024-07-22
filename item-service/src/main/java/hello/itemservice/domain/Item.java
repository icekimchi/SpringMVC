package hello.itemservice.domain;

import lombok.Data;

@Data
public class Item {

    private long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    private Item(){

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
