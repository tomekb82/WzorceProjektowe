package decorator;

/**
 * Created by tomek on 15.08.16.
 */
public abstract class Beverage {
    private String description = "unknown";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
    }
}
