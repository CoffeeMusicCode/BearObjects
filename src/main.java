import org.nichosschool.www.Bear;

public class main {

    // the main entry point
    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        System.out.println("Bear World!");

        Bear polarbear = new Bear("Fred", 15);
        
        Bear blackbear = new Bear("Jack", 10);
        
        polarbear.color = "white";
        polarbear.birthday();
        
        Bear grizlybear = new Bear("Joe", 14);
        

        polarbear.birthday();
        grizlybear.color = "brown";
        grizlybear.poop();
        
        polarbear.birthday();
        
        grizlybear.eats(polarbear);
        
        polarbear.profile();
        grizlybear.profile();
        blackbear.profile();

    }

}
