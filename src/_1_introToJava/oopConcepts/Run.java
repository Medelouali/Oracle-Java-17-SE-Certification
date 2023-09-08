package _1_introToJava.oopConcepts;

import java.util.List;

public class Run {
    // This method demonstrates the point of polymorphism
    public void run(){
        PolymorphismEngineer webDev=new PolymorphismSoftwareEngineer();
        PolymorphismEngineer mechanical=new PolymorphismMechanicalEngineer();
        for(PolymorphismEngineer e: List.of(webDev, mechanical)){
            e.work();
        }
    }
}
