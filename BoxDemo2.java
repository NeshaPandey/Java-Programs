class Box{
    int W,H,L;
    int volume(){
        return W*H*L;
    }
}
public class BoxDemo2 {
    public static void main(String[] args){
        Box B1=new Box();
        Box B2=new Box();
        int vol;
        B1.H=15;
        B1.W=10;
        B1.L=25;
        B2.W=5;
        B2.H=6;
        B2.L=7;
        vol=B1.volume();
        System.out.println("Volume of Box1="+vol);
        vol=B2.volume();
        System.out.println("Volume of Box2="+vol);

    }
    
}
