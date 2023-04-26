import java.util.ArrayList;

public class CarFactory implements ICar {

    public void AddCar() {

    }
   public void UpdateCar (){

   }

   public void FactoryDetails(Factory f){
        ArrayList<String> factorynames=new ArrayList<>();
        factorynames.add("Factory 1");
        factorynames.add("Factory 2");
        factorynames.add("Factory 3");
        for (String s : factorynames) {
            System.out.println(s);
        }
        factorynames.remove("Factory 1");
        factorynames.get(1);
        System.out.println("f.factoryId");

        System.out.println(f.factoryId);
        System.out.println(f.name);
        System.out.println(f.location);

   }
}
