/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.Model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class TheShop implements Serializable{
    
    private String items;
    private double numberOfItems;
    private String available;

    public TheShop() {
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public double getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(double numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.items);
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.numberOfItems) ^ (Double.doubleToLongBits(this.numberOfItems) >>> 32));
        hash = 79 * hash + Objects.hashCode(this.available);
        return hash;
    }

    @Override
    public String toString() {
        return "TheShop{" + "items=" + items + ", numberOfItems=" + numberOfItems + ", available=" + available + '}';
    }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TheShop other = (TheShop) obj;
        if (Double.doubleToLongBits(this.numberOfItems) != Double.doubleToLongBits(other.numberOfItems)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (!Objects.equals(this.available, other.available)) {
            return false;
        }
        return true;
    }
    
    
}
