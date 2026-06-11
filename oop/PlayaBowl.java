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

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isHealthy() {
        return calories <= 750;
    }

    public abstract void describeBowlBriefly(StringBuilder description);
}
