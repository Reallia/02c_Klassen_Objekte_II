package com.cc.java;

public class Cat {
    


    private String name;
    private String furColor;
    private int age;
    private boolean isFemale;

    private int counter; // braucht keinen anfangswert, ethält eine default 0

    
   
    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    /** Getter */
    public String getStringAttributes(String flag) {
        switch (flag) {
            case "#name":
                return name; 
            case "#furColor":
                return furColor; 
            default:
                return "ERROR: ???";
        }
    }

    public String getAge() {
        
        if (isFemale) {
            return checkEscalationsLevel();
        } else {
            return String.valueOf(age);
        }
    }

    private String checkEscalationsLevel() {

        counter++;

        switch (counter) {
            case 1:
                return "This is an inaproppriate question!";
            case 2:
                return "I have told you once";            
            case 3:
                return "Talk to the hand!";    
            default:
                return "beep";  // durch das return braucht man kein break; mehr 
                                // return bricht eine methode ab.
        }
    }
}

