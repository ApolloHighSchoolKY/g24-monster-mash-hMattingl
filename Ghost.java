public class Ghost extends Monster {
   private String ability;
   
    public Ghost(String name, String power)
    {
        super(name);
        setAbility(power);
    }

    public String possess(String thing)
    {
        if(ability.toLowerCase().equals("possession"))
            return getName() + " possessed the " + thing + " now, it's spooky \n";
        if(ability.toLowerCase().equals("intangibility"))
            return getName() + " tried to possess " + thing + " but just fell though it";
        return getName() + " can't possess things, they have " + ability;
    }

    public void setAbility(String power)
    {
        ability = power;
    }

    public String kill()
    {
        if(ability.toLowerCase().equals("intangibility"))
            return "How? " + getName() + " can only phase though things.\n";
        if(ability.toLowerCase().equals("flight"))
            return "Up " + getName() + " and the victim go, down the victim goes.\n";
        if(ability.toLowerCase().equals("possession"))
            return getName() + " possessed and killed a victim. wonder if the daylight could've saved them?\n";
        else
            return getName() + "killed a victim. Boo hoo.\n";
    }
    
}
