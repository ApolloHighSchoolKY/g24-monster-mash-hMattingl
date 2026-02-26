

/**
 * @(#)Farm.java
 *
 *
 * @author
 * @version 1.00 2023/3/8
 */

import java.util.ArrayList;

public class Farm {

    public static void main(String [] args)
    {
        {
            ArrayList <Animal> barn = new ArrayList<Animal>();
            Pig oink = new Pig();
    	    Cow moo = new Cow("moo", 20);

            System.out.println(moo.equals(oink));

            System.out.println(moo);
            moo.eat();
            moo.eat();
            moo.eat();
            moo.eat();
            moo.eat();
            System.out.println(moo);

            System.out.println(moo.equals(moo));

            barn.add(moo);
            barn.add(oink);

            for(Animal x: barn)
            {
                if(x.getAge() >= 5)
                    x.kill();
                System.out.println(x.speak());
                
                x.eat();
            }

            

        }

    }
}