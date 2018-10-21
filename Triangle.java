 
public class Triangle{

    private Point point;
    private Point p1;
    private Point p2;
    private Point p3;
    
    public Triangle(Point p1, Point p2, Point p3){
    
        p1 = new Point(p1);
        p2 = new Point(p2);
        p3 = new Point(p3);
            
    }
    
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
        p3 = new Point(x3, y3);
        
    }
    
    public String toString(){
        return "Triangle: " + p1 + ", " + p2 + ", " + p3;
    }
    
    public double getPerimeter(){
     
        return Point.distance(p1, p2) + Point.distance(p2, p3) + Point.distance(p3, p1);
        
    }
    
    public void setVertex(int whichPoint, Point newPoint){
     if (whichPoint == 0){
            p1 = new Point(newPoint);
        }
        if (whichPoint == 1){
            p2 = new Point(newPoint);
        }
        if (whichPoint == 2){
            p3 = new Point(newPoint);
        }    
    }
    
    
    public Point getVertex(int whichPoint){
        if (whichPoint == 0){
           point = new Point(p1);
           return point;
        }
        if (whichPoint == 1){
            point = new Point(p2);
            return point;
        }
        if (whichPoint == 2){
            point = new Point(p3);
            return point;
        }
        return point;
    }
}
    
    
