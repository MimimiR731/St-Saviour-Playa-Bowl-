public class VegetarianBowl extends PlayaBowl {
    private boolean granola; 
    private boolean chiaSeeds;

    public VegetarianBowl(String name, String base, int calories, boolean granola, boolean chiaSeeds) {
        super(name, base, calories);
        this.granola = granola;
        this.chiaSeeds = chiaSeeds;
    }

    public void addVegetables(boolean addGranola, boolean addChiaSeeds) {
        if (addGranola) {
            granola = true;
        }
        if (addChiaSeeds) {
            chiaSeeds = true;
        }
    }

    @Override
    public void describeBowlBriefly(StringBuilder description) {
        description.append(getName()).append(" with ").append(getBase());
        if (granola) {
            description.append(", granola");
        }
        if (chiaSeeds) {
            description.append(", chia seeds");
        }
    }

}   