package oop;
public class VegetarianBowl extends PlayaBowl {
    private boolean granola; 
    private boolean chiaSeeds;

    public VegetarianBowl(String name, String base, int calories, boolean granola) {
        super(name, base, calories);
        this.granola = granola;
    }

    public void addVegetables(boolean addGranola) {
        if (addGranola) {
            granola = true;
        }
    }

    @Override
    public void describeBowlBriefly(StringBuilder description) {
        description.append(getName()).append(" with ").append(getBase());
        if (granola) {
            description.append(", granola");
        }
    }

    @Override
    public String describeBowl() {
        return getBase() + " is a vegetarian bowl.";
    }
}   