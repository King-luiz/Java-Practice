public class MyPoint {
//attribute/variables
int x;
int y;

//default constructors
    public MyPoint(){
        this.x=0;
        this.y=0;
    }

    //parametric constructors

    public MyPoint(int x,int y){
        this.x =x;
        this.y = y;

    }
    //getters and setters
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;

    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    //toString
    @Override
    public String toString(){
        return "Point at ("+x+", "+y+")";
    }
    //distance
    public double distance(int x,int y){
        return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y,2));

    }
    //My point
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }
    //dist from point (0,0)
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,2));
    }

    //main method
    public static void main(String[] args) {

        //test for constructors
        // Creating two MyPoint objects
       
        MyPoint point1 = new MyPoint(3, 4);
        MyPoint point2 = new MyPoint(5, 6);

        // Printing the points toString
        System.out.println("===Printing toString===");
        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Test setters
        System.out.println("===test for setter===");
        point1.setX(2);
        point1.setY(4);
        System.out.println(point1);
        
        // Test getters
        System.out.println("===test for getter===");
        System.out.println("x is: " + point1.getX()); 
        System.out.println("y is: " + point1.getY());

        // Test setXY()
        System.out.println("===test for setXY===");
        point1.setXY(3, 0);

        // Test getXY()
        System.out.println("===test for getXY===");
        System.out.println(point1.getXY()[0]); 
        System.out.println(point1.getXY()[1]);
        System.out.println(point1);

        // Test another constructor
        System.out.println("===test for another constructor===");
        MyPoint point3 = new MyPoint(0, 4); 
        System.out.println(point3);
        
    }
}