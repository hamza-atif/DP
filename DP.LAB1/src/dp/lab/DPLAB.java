
package dp.lab;
class abstracttest extends abstractclass{

    @Override
    void name() {
        System.out.println("Hamza Atif");
    }

    @Override
    void reg() {
        System.out.println("FA20-BSE-018");
    }
    
}
class interfacetest implements info,detail{

    @Override
    public void course() {
        System.out.println("Design Patterns");
    }

    @Override
    public void instructor() {
        System.out.println("Sir Mukhriar Zamin");
        }

}
public class DPLAB {

    public static void main(String[] args) {
        
    abstracttest t = new abstracttest();
    t.name();
    t.reg();
    t.section();
    
    interfacetest t2=new interfacetest();
    t2.course();
    t2.instructor();
    System.out.println("The number of students in class are " + detail.numberstudents);
    System.out.println("The class is in " + detail.roomnum);
    
    encapsulation en= new encapsulation();
    en.setname("Comsats Univeristy Islamabad");
    en.setcity("Abbottabad");
    en.setnum("9854257");
    System.out.println("Name of the university is " + en.getname());
    System.out.println("Name of the city is " + en.getcity());
    System.out.println("Phone number of the university is " + en.getnum());
    
    }
    
}
