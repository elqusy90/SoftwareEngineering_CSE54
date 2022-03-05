package Building;

import java.util.Enumeration;
import java.util.Vector;

public class Building {
    Vector owners;
    public Building(){
        owners = new Vector();
    }


    public Enumeration getOwners() {
        return owners.elements();
    }

    public void addOwner(Owner c){
        owners.addElement(c);
    }
}
