package oop;
public class FruitBowl extends PlayaBowl {
    private boolean strawberries; 
    private boolean bananas;

    public FruitBowl(String name, String base, int calories, boolean strawberries, boolean bananas) {
        super(name, base, calories);
        this.strawberries = strawberries;
        this.bananas = bananas;
    }

    public void addStrawberriesAndBananas(boolean addStrawberries, boolean addBananas) {
        if (addStrawberries) {
            strawberries = true;
        }
        if (addBananas) {
            bananas = true;
        }
    }

    @Override
    public void describeBowlBriefly(StringBuilder description) {
        description.append(getBase());
        if (strawberries) {
            description.append(", strawberries");
        }
        if (bananas) {
            description.append(", bananas");
        }
    }
        @Override
        public String describeBowl() {
            return getName() + " is a fruit bowl.";
        }
    
}
