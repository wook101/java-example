class Calculator{
    static int total;
    int add(int num){
        total+=num;
        return total;
    }
    int sub(int num){
        total-=num;
        return total;
    }
}

public class CalculaorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(7);
        calculator.add(10);
        calculator.sub(5);
        System.out.println(Calculator.total);
    }
}
