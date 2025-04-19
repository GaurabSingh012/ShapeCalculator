abstract class Shape{
    abstract double calculateArea();
    abstract double calculatePerimeter();

    protected double dim_one, dim_two, dim_three;
    int num_sides;
    public Shape(){
        dim_one = dim_two = dim_three = 0;
        num_sides = 0;
    }
}