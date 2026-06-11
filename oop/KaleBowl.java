package oop;
public class KaleBowl extends VegetarianBowl {
    private boolean kale; 
    private boolean chiaSeeds;

    public KaleBowl(String name, String base, int calories, boolean granola, boolean kale, boolean chiaSeeds) {
        super(name, base, calories, granola, chiaSeeds);
        this.kale = kale;
        this.chiaSeeds = chiaSeeds;
    }

    public void addKaleAndChiaSeeds(boolean addKale, boolean addChiaSeeds) {
        if (addKale) {
            kale = true;
        }
        if (addChiaSeeds) {
            chiaSeeds = true;
        }
    }

    @Override
    public void describeBowlBriefly(StringBuilder description) {
        super.describeBowlBriefly(description);
        if (kale) {
            description.append(", kale");
        }
        if (chiaSeeds) {
            description.append(", chia seeds");
        }
    }
    
}
