package problem_7weeks;

class Circle{
    private int x, y, radius;
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public String toString(){
        return this.getClass().getName() + "(" + this.x + "," + this.y + ")������" + this.radius;
    }
    public boolean equals(Object obj){
        Circle c = (Circle)obj;
        if(this.x == c.x && this.y == c.y){
            return true;
        }
        else{
            return false;
        }
    }
}

public class problem6_2 {
    public static void main(String[] args){
        Circle a = new Circle(2, 3, 5);
        Circle b = new Circle(2, 3, 30);
        System.out.println("�� a : " + a);
        System.out.println("�� b : " + b);
        if(a.equals(b)){
            System.out.println("���� ��");
        }
        else{
            System.out.println("���� �ٸ� ��");
        }
    }
}




