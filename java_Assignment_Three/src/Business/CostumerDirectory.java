
package Business;

import java.util.ArrayList;

public class CostumerDirectory 
{
    private ArrayList<Costumer> costumer; 
    public CostumerDirectory()
    {
        costumer = new ArrayList<Costumer>();
    }
    
    public Costumer addCostumer(){
        Costumer newCostumer = new Costumer();
        costumer.add(newCostumer);
        return newCostumer;
    }
}
