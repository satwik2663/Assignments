
package Business;

import java.util.ArrayList;

public class TravelAgency {
    
    private ArrayList<Airliner> airliner;    
    public TravelAgency(){
        airliner = new ArrayList<Airliner>();
    }
    public ArrayList<Airliner> getAirliner() {
        return airliner;
    }

    public void setAirliner(ArrayList<Airliner> airliner) {
        this.airliner = airliner;
    }
    public Airliner addAirliner(){
        Airliner newAirliner = new Airliner();
        airliner.add(newAirliner);
        return newAirliner;
    }
    public void Remove(Airliner a)
    {
        airliner.remove(a);
    }
    
    
}
