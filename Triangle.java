 
public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;
    
    public Triangle(Point p1, Point p2, Point p3){
    
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
            
    }
    
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    
        p1 = new p1 (x1, y1);
        p2 = new p2 (x2, y2);
        p3 = new p3 (x3, y3);
        
    }
    
    public double getPerimeter() {
     
        return p1.distanceTo(p2) + p2.distanceTo(p3) + p3.distanceTo(p1);
        
    }
