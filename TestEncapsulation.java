public class TestEncapsulation {
    public static void main(String[] Args){ 
        Encapsulate obj = new Encapsulate(); 
 
        obj.setAge(20); 
        obj.setRoll(2); 
        obj.setName("Yudha Rizky Alvingky"); 
 
        System.out.println("Geek Name : " + obj.getName()); 
        System.out.println("Geek Age  : " + obj.getAge()); 
        System.out.println("Geek Roll : " + obj.getRoll()); 
        // System.out.println("Geek Roll : " + obj.geekRoll); 
    } 
}
