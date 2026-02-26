public class Skeleton extends Monster {
    private double speed;

    public Skeleton()
    {
        speed = 100;
    }

    public Skeleton(String name)
    {
        super(name);
        speed = 100;
    }

    public String toString()
    {
        return super.toString() + " " + speed + "\n";
    }
    

    public Skeleton(String name, Double speed)
    {
        super(name);
        this.speed = speed;
    }
}
