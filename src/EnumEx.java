public class EnumEx {
    public static void main(String[] args) {
        for(CoffeeType type : CoffeeType.values()){
            System.out.println(type);
        }
    }
}
