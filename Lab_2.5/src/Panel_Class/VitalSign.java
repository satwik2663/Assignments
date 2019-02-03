package Panel_Class;

import java.util.Date;


public class VitalSign 
{
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private Date date;
     

    public VitalSign(double temperature, double bloodPressure, int pulse, Date date) {
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulse = pulse;
        this.date = date;
    }
    
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
   @Override
   public String toString()
   {
       return String.valueOf(this.date);
   }
}
