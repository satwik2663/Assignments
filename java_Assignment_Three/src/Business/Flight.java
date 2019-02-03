
package Business;

import java.util.ArrayList;

public class Flight 
{
    private String From;
    private String to;
    private float price;
    private int window;
    private int ile;
    private int middle;
    
    private int w;
    private int m;
    private int a;
    
    public Flight ()
    {
    this.w = 0;
    this.m=0;
    this.a = 0;
    }
    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void setIle(int ile) {
        this.ile = ile;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }
    
    public int getWindow() {
        return window;
    }

    public int getIle() {
        return ile;
    }

    public int getMiddle() {
        return middle;
    }
  
    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
     public String toString() {
        return this.getTo(); 
    }
  
    public int reduceWIndow(int b)
    {
       --b;
       this.window  = b;
       this.w = this.w+1;
       return window;
       
    }
    public int reduceIle(int b)
    {
       --b;
       this.ile  = b;
       this.a=this.a+1;
       return ile;
    }
    
    public int reducemiddle(int c)
    {
       --c;
       this.middle  = c;
       this.m=this.m+1;
       return middle;
    }
}
