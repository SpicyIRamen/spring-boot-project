package se.iths.springbootproject.entity;

import javax.persistence.*;

@Entity
public class ConsumablesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long consumablesid;

    private String Fruit;
    private String Meat;
    private String Vegetables;

    @ManyToOne
    @JoinColumn(name = "backpack_backpackid")
    private BackpackEntity backpack;

    public BackpackEntity getBackpack() {
        return backpack;
    }

    public void setBackpack(BackpackEntity backpack) {
        this.backpack = backpack;
    }

    public ConsumablesEntity(String fruit, String meat, String vegetables) {
        Fruit = fruit;
        Meat = meat;
        Vegetables = vegetables;
    }
    public ConsumablesEntity(){}

    public Long getConsumablesid() {
        return consumablesid;
    }

    public void setConsumablesid(Long consumablesid) {
        this.consumablesid = consumablesid;
    }

    public String getFruit() {
        return Fruit;
    }

    public void setFruit(String fruit) {
        Fruit = fruit;
    }

    public String getMeat() {
        return Meat;
    }

    public void setMeat(String meat) {
        Meat = meat;
    }

    public String getVegetables() {
        return Vegetables;
    }

    public void setVegetables(String vegetables) {
        Vegetables = vegetables;
    }
}
