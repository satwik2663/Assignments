package Panel_Class;


import java.util.ArrayList;


public class VitalSignHistory 
{
    private ArrayList <VitalSign> vitalSignHostory;
    
    public VitalSignHistory()
    {
        vitalSignHostory = new ArrayList <VitalSign>();
    }
    public ArrayList<VitalSign> getVital() {
        return vitalSignHostory;
    }
    
    public void setVital(ArrayList<VitalSign> vital) {
        this.vitalSignHostory = vital;
    }  
    public void deleteVitals(VitalSign vitalSign)
    {
        vitalSignHostory.remove(vitalSign);
    }
}
