import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean exit=true;
        System.out.println("Здравствуйте!");
    while (exit){
        System.out.println("Какую пиццу предпочитаете?  \n 1) Pepperoni\n 2) Margarita\n 3) LaFinta" );
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Если хотите острый нажмите - 1  не острый - 2");
                int enter1 = scan.nextInt();
                Pepperoni pepperoni = new Pepperoni();
                pepperoni.setPrice(300);
                pepperoni.setWeight(0.400);
                Pizza.Cooking();
                pepperoni.Label();
                pepperoni.Special(enter1);
                System.out.println("");
                break;
            case 2:
                System.out.println("Если хотите c мясом нажмите - 1  без мяса - 2");
                int enter2 = scan.nextInt();
                Margarita margarita = new Margarita();
                margarita.setPrice(250);
                margarita.setWeight(.350);
                Pizza.Cooking();
                margarita.Label();
                margarita.Special(enter2);
                System.out.println("");
                break;
            case 3:
                System.out.println("Если хотите c грибами нажмите - 1  без грибов - 2");
                int enter3 = scan.nextInt();
                LaFinta laFinta = new LaFinta();
                laFinta.setPrice(400);
                laFinta.setWeight(.500);
                Pizza.Cooking();
                laFinta.Label();
                laFinta.Special(enter3);
                break;
            default:
                System.out.println("Извините, но у нас нет такой пиццы");

        }
        System.out.println("Если хотите еще заказать нажмите любую кнопку для выхода нажмите -нет- ");
        String exit2 = scan.next();
        if(exit2.equals("нет")){
            exit=false;
            System.out.println("Всего доброго! Ваш заказ будет доставлен в течении 30 минут!");
        }

    }
    }
}
