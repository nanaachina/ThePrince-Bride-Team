/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princessbride.view;

/**
 *
 * @author rbrown
 */
public enum ActorEnum {
    
     Fezzik("Not sure who he is rightn now"),
    Inigo("sword fighter");
    
    private String description;
    
    ActorEnum(String desc) {
        description = desc;
    }
    
    public String getDescription() {
        return description;
    }
    
    
}
