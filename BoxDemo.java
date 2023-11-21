class Box
{
    double length;
    double breadth;
    double height;
}
class BoxDemo{
    public static void main(String[] args){
        double volume;
        Box mybox=new Box();
        mybox.length=10;
        mybox.breadth=8;
        mybox.height=7;
        volume=mybox.length*mybox.breadth*mybox.height;
        System.out.println("Volume of box="+volume);
    }
}