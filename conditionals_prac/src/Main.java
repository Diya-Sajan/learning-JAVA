class simcalc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}class calc extends simcalc{ //simple
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }
}class advancecalc extends calc{
    public double pow(int a, int b){
        return a^b;
    }
}
public class Main{
    public static void main(String args[]){
        advancecalc obj= new advancecalc();
        int a = 5;
        int b = 8;
        System.out.println(obj.add(a,b));
        System.out.println(obj.sub(a,b));
        System.out.println(obj.multiply(a,b));
        System.out.println(obj.divide(a,b));
        System.out.println(obj.pow(a,b));
    }
}