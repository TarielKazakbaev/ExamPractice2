public class Pepperoni extends Pizza{
    @Override
    void Label() {
        System.out.println("Pizza: Pepperoni"+"\nweight: "+getWeight()+"\nprice:"+getPrice());
    }
    int  Special(int num) {
        if (num == 1) {
            System.out.println("Острый");
            return num;
        } else if (num == 2) {
            System.out.println("Не острый");
            return num;
        }
        return num;
    }
}
