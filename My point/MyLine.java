public class MyLine {
    //attributes
    MyPoint begin;
    MyPoint end;
    
    //default constructor
    public MyLine(int x1, int y1, int x2, int y2) {
        begin = new MyPoint(x1, y1);
        end = new MyPoint(x2, y2);
    }


    //parametric
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getters and setters for the beginning point
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }
    // Getters and setters for the end point
    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }
    
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        return begin.getXY();
    }

    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    public int[] getEndXY() {
        return end.getXY();
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }
    //the length of the line
    public double getLength() {
        return begin.distance(end);
    }

    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
    

    //main class

    public static void main(String[] args) {
        //test for constructors
        MyLine line1 = new MyLine(1, 2, 3, 4);
        MyLine line2 = new MyLine(new MyPoint(5, 10), new MyPoint(15, 20));
        System.out.println(line1);
        System.out.println(line2);
        //test getters and setters
        System.out.println("Get beginX : "+ line1.getBeginX());
        line1.setBeginX(10);
        System.out.println("new beginX : "+line1.getBeginX());
        System.out.println("get beginY : "+line1.getBeginY());

        line1.setBeginY(20);
        //System.out.println(line1.getBeginXY());
        System.out.printf("Length : %.2f%n",line1.getLength());


        MyPoint mp1 = new MyPoint(2,8);
        MyPoint mp2 = new MyPoint(5,10);
         System.out.println(mp1);
         System.out.println(mp2);

        //test toString

         System.out.println("Point 1 is : "+mp1.toString());
         System.out.println("Point 2 is : "+mp2.toString());

    }
}