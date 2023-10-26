class Animal {
    void eat() {
        System.out.println("eating");
    }
}
final class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("meowing");
    }
}
class TestInheritance3 {
    public static void main(String args[]){
        Cat c = new Cat();
        c.meow();
        c.eat();
    }    
}

// Hasilnya akan seperti dibawah ini
// [Running] cd "e:\belajar-java\" && javac TestInheritance3.java && java TestInheritance3
// meowing
// eating
// Class Dog tidak akan bisa kepanggil karena ada final class
