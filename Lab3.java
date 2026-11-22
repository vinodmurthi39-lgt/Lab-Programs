public class Lab3{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,20);

        System.out.println("Before resizing:");
        r.Demension_display();

        r.resizble(20,30);

        System.out.println("after resizing:");
        r.Demension_display();


    }
}
class Rectangle{
    int width;
    int hight;

    Rectangle(int width,int hight){
        this.width=width;
        this.hight=hight;
    }

    public void resizble(int width ,int hight){
        this.width=width;
        this.hight=hight;
    }

    void Demension_display(){
        System.out.println("Width :"+width);
        System.out.println("Hight :"+hight);
    }
}