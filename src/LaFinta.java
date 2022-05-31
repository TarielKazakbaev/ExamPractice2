public class LaFinta extends Pizza{
    @Override
    void Label() {
        System.out.println("Pizza: LaFinta"+"\nweight: "+getWeight()+"\nprice:"+getPrice());
    }
    int  Special(int num) {
        if (num == 1) {
            System.out.println("С грибами");
            return num;
        } else if (num == 2) {
            System.out.println("Без грибов");
            return num;
        }
        return num;
    }
}
