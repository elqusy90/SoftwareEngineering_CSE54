import Building.*;

import java.util.Enumeration;

public class Main {

    public static void main(String [] args){
        Owner o1 = new Owner("ahmed");
        Owner o2 = new Owner("mohammed");
        Owner o3 = new Owner("mahmoud");

        Building b1, b2;
        b1 = new Building();
        b2 = new Building();

        b1.addOwner(o1);
        b1.addOwner(o2);
        b2.addOwner(o1);
        b2.addOwner(o3);


        System.out.println("the owners of the first building as follow: ");
        Enumeration e1 = b1.getOwners();

        while(e1.hasMoreElements()){
            Owner o = (Owner) e1.nextElement();
            System.out.println("\t" + o.getName());
        }

        System.out.println("the owners of the second building as follow: ");
        Enumeration e2 = b2.getOwners();

        while(e2.hasMoreElements()){
            Owner o = (Owner) e2.nextElement();
            System.out.println("\t" + o.getName());
        }

    }
}
