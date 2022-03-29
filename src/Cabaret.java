import java.util.ArrayList;
public class Cabaret {
    private String name;
    private ArrayList<Performer> abc;

    public Cabaret(String name)
    {
        this.name=name;
        abc =  new ArrayList<Performer>();
    }

    public String getName()
    {
        return name;
    }
    public ArrayList<Performer> getPerformers()
    {
        return abc;
    }

    public boolean addPerformer(Performer aaa)
    {
        if(abc.indexOf(aaa)==-1)
        {
            abc.add(aaa);
            return true;
        }
        return false;
    }

    public boolean removePerformer(Performer aaa)
    {
        if(abc.contains(aaa))
        {
            abc.remove(aaa);
            return true;
        }
        return false;
    }

    public double averagePerformerAge()
    {
        int count=0;
        int total=0;
        for(int i=0; i<abc.size();i++)
        {
            count++;
            total+=abc.get(i).getAge();
        }
        return total/count;
    }
    public ArrayList<Performer> performersOverAge(int a)
    {
        ArrayList<Performer> bbb = new ArrayList<Performer>();
        for(Performer performer : abc)
        {
            if(performer.getAge()>=a)
            {
                bbb.add(performer);
            }
        }
        return bbb;
    }

    public void groupRehearsal()
    {
        for(Performer performer: abc)
        {
            System.out.println("Rehearsal Call!!! " + performer.getName());
            if(performer instanceof Comedian)
            {
                Comedian ccc = (Comedian) performer;
                ccc.rehearse(false);
            }
            else{
                performer.rehearse();
            }
        }
    }

    public void cabaretShow()
    {
        for(Performer performer: abc)
        {
            System.out.println("Welcome to the cararet. Next act up: " + performer.getName());
            if(performer instanceof Dancer)
            {
                Dancer ccc = (Dancer) performer;
                ccc.pirouette(2);
            }
        }
    }
}
