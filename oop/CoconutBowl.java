package oop;

public class CoconutBowl extends FruitBowl {
    private boolean coconutFlakes; 
    private boolean nutella;

    public CoconutBowl(String name, String base, int calories, boolean strawberries, boolean bananas, boolean coconutFlakes, boolean nutella) {
        super(name, base, calories, strawberries, bananas);
        this.coconutFlakes = coconutFlakes;
        this.nutella = nutella;
    }

    public void addCoconutFlakes(boolean addCoconutFlakes) {
        if (addCoconutFlakes) {
            coconutFlakes = true;
        }
    }

    @Override
    public void describeBowlBriefly(StringBuilder description) {
        super.describeBowlBriefly(description);
        if (coconutFlakes) {
            description.append(", coconut flakes");
        }
    } 
}
