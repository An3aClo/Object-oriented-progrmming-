package square;

import java.util.Scanner;

public class Square {
    
    public int Area(int side) {
        
        int area = 0;
        area = side * side;
        return area;
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Square s = new Square();
        System.out.println("the area is" + s.Area(4));
        
    }
    
}
