public class Wall {

    double widht;
    double height;

    public Wall(){

    }

    public Wall(double widht, double height) {
        this.widht = widht;
        this.height = height;

        if (widht < 0){
            this.widht = 0;
        }

        else if (height < 0){
            this.height = 0;
        }
    }

    public double getWidht() {
        return widht;
    }

    public double getHeight() {
        return height;
    }

    public void setWidht(double widht){
        if (widht < 0){
            this.widht = 0;
        }
    }

    public void setHeight(double height){
        if (height < 0){
            this.height = 0;
        }
    }

    public double getArea(){
        return this.widht*this.height;
    }

}
