public class Rectangle {
    double width, height;
    public Rectangle(){

    }
    public Rectangle(double width ,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.height + this.width)*2;
    }
    public void displayRectangle(){
        for (int i = 0 ; i < this.height;i++){
            System.out.println();
            for(int j = 0 ; j < this.width ; j++){
                System.out.print("*");
            }
        }
    }
}
