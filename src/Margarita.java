public class Margarita extends Pizza{
    @Override
    void Label() {
        System.out.println("Pizza: Margarita"+"\nweight: "+getWeight()+"\nprice:"+getPrice());
    }
    int  Special(int num) {
        if (num == 1) {
            System.out.println("С мясом");
            return num;
        } else if (num == 2) {
            System.out.println("Без мяса");
            return num;
        }
        return num;
    }
}
