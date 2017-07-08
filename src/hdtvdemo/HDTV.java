package hdtvdemo;
/*
 * Create HDTV class with pvt members that can be accessed using getter and setter methods
 * */
public class HDTV {
	private String brandname;
    private int size;
    
    public HDTV(String b, int s){
        this.brandname = b;
        this.size = s;

    }
    
    public String getBrandname() {
        return brandname;
    }
    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }
    
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    //Method to output result
    public String toString(){
        return "Brandname: "+this.brandname+"- Size: "+this.size;
    }
}
