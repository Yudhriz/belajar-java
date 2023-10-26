class A {
    void msg(){System.out.println("Hello");}
}

class B {
    void msg(){System.out.println("Welcome");}
}

class C extends A,B {
    public Static void main(String args[]){
        C obj=new C();
        obj.msg();
}
}

// Error sebelum dicompile