public class display extends Main {
	private double inches; // polegadas do display
	private boolean led; // é de led ou não
	private int brightness; // nits
	private boolean converted;
	    
	//Construtor
	public display(double i, boolean l, int b) {
		this.setInches(i);
		this.setLed(l);
	    this.setBrightness(b);
	    this.converter();
	} 
	    
	//Setters
	public void setInches(double i) { this.inches = i; }
	public void setLed(boolean l) { this.led = l; }
    public void setBrightness(int b) { this.brightness = b; }
        
    //Getters
	public double getInches() { return this.inches; }
    public boolean getLed() { return this.led; }
    public int getBrightness() { return this.brightness; }
        
    //Exibe o status do display utilizando os getters
    public void status() {
    	this.text(this.converted);
        System.out.println("Led: " + this.getLed());
        System.out.println("Brightness: " + this.getBrightness());
        System.out.println("\n----------------------\n");
        this.converted = false;
    }
        
    //Método para converter polegadas para centímetros
    public void converter(){
        this.inches = this.inches*2.54;
        this.converted = true;
    }
    
    //Método para formatar o texto conforme o resultado
    public void text(boolean converted){
        if (converted) {
            System.out.println("Centimeters: " + this.getInches()); 
        }else{
            System.out.println("Inches: " + this.getInches());
        }    
    }
}	 
