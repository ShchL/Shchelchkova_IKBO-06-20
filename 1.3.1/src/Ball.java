public class Ball {
    private String colour;
    private int radius;

    public Ball(String str, int n){
        colour = str;
        radius = n;
    }

    public Ball(String str){
        colour = str;
        radius = 1;
    }

    public Ball(){
        colour = "blue";
        radius = 1;
    }

    public void setRadius(int radius) throws Exception{
        if(radius<=0) throw new Exception("Такого мяча не может быть");
        this.radius = radius;
    }

    public void setColour(String colour) throws Exception{
        if(colour.isEmpty()) throw new Exception("Строка пустая");
        this.colour = colour;
    }

    public String getColour(){
        return colour;
    }

    public int getRadius() {
        return radius;
    }

    public String toString(){
        return this.colour+" ball, radius "+this.radius;
    }
}






