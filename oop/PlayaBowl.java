package oop;

public abstract class PlayaBowl implements BowlProfile {

    private String name;
    private String base; 
    private int calories; 

    public PlayaBowl(String name, String base, int calories) {
        this.name = name;
        this.base = base;
        this.calories = calories;
    }
    
    public String getName() {
        return name;
    }

    public String getBase() {
        return base;
    }

    public int getCalories() {
        return calories;
    }

}
