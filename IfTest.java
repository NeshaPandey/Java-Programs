interface IntStack{
    void push(int item);
    int pop();
}

class fixedStack implements IntStack{
    private int stck[];
    private int tos;
    fixedStack(int size){
        stck=new int[size];
        tos=-1;
    }


public void push(int item){
    if(tos==stck.length-1){
        System.out.println("Stack overflow");
    }
    else{
        stck[++tos]=item;
    }
}

public int pop(){
    if(tos<0){
        System.out.println("Stack underflow");
        return 0;
    }
    else{
        return stck[tos--];
    }
}
}
public  class IfTest {
    public static void main(String[] args) {
        fixedStack myStack1=new fixedStack(5);
        for(int i=0;i<5;i++){
            myStack1.push(i);
        }
        System.out.println("Stack in myStack1");
        for(int i=0;i<5;i++){
            System.out.println(myStack1.pop());
        }
    } 
}
