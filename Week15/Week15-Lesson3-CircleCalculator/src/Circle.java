public class Circle {
    private double r;
    private final double PI = 3.1416;
    private double circumference;
    private double area;

    // Constructor
    public Circle(double r){
        setR(r);
    }

    // Getters and Setters
    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        if (r>0) {
            this.r = r;
            this.circumference = calculateCircumference();
            this.area = calculateArea();
        } else {
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
    }

    public double getPI() {
        return this.PI;
    }

    public double getCircumference() {
        return this.circumference;
    }

    public double getArea() {
        return this.area;
    }

    // Private Methods
    private double calculateCircumference() {
        return 2*this.PI*this.r;
    }

    private double calculateArea() {
        return this.PI*Math.pow(this.r, 2);
    }

    // Public Methods
    public String evaluateCircumference() {
        if (this.circumference<=5) {
            return "too short";
        } 
        else if(this.circumference > 50){
            return "too big";
        }
        else {
            return "adecuate";
        }
    }

    // toString
    @Override
    public String toString() {
        return "{" +
            " r='" + getR() + "'" +
            ", circumference='" + getCircumference() + "'" +
            ", area='" + getArea() + "'" +
            "}";
    }

    


}
