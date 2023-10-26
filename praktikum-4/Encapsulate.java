class Encapsulate{ 
    private String geekName; 
    private int geekRoll; 
    private int geekAge; 
 
    protected int getAge(){ 
        return geekAge; 
    } 
 
    protected int getRoll(){ 
        return geekRoll; 
    } 
 
    protected String getName(){ 
        return geekName; 
    } 
 
    protected void setAge(int newAge){ 
        geekAge = newAge; 
    } 
 
    protected void setRoll(int newRoll){ 
        geekRoll = newRoll; 
    } 
 
    protected void setName(String newName){ 
        geekName = newName; 
    } 
}