class Rectangle {
    int length;
    int breadth;

    Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int area()
    {
        return length * breadth;
    }
}
 public class Rectangle1{
    public static void main(String[] args) {
        Rectangle obj = new Rectangle(4,5);
        Rectangle obj1 = new Rectangle(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());
    }
 }