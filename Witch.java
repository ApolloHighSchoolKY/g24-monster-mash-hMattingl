public class Witch extends Monster{
    public Witch(String name)
    {
        super(name);
    }

    //override kill
    public String kill()
    {
        return getName() + " killed a victim. splish splash \n";
    }

    public String fly()
    {
        return getName() +" went flying and cackling on her broomstick \n";
    }

}