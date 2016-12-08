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
public class Tower implements Serializable{
    
     private String description;
     private String ubication;

    public Tower() {
    }
     
     

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUbication() {
        return ubication;
    }

    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.ubication);
        return hash;
    }

    @Override
    public String toString() {
        return "Tower{" + "description=" + description + ", ubication=" + ubication + '}';
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
        final Tower other = (Tower) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.ubication, other.ubication)) {
            return false;
        }
        return true;
    }
     
     
    
}
