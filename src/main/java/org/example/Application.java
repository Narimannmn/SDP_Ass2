package org.example;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Application {
    static Scanner scanner = new Scanner(System.in);
    public void start(){
        int builder[];
        Dictionary<String, Integer> content= new Hashtable<>();
        content.put("Chicken cutlet", 0);
        content.put("Beef cutlet", 0);
        content.put("Cheese", 0);
        content.put("cholopnio", 0);
        System.out.println("Hello user! Let's create order for burger");
        Food burger = new Burger();
        while (true) {
            System.out.println("1) Add cutlet\n" +
                    "2) Add cheese\n" +
                    "3) Add spiciness\n" +
                    "4) End builder\n");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 : {
                    System.out.println("1)Chicken\n" +
                            "2)Beef");
                    int meat = scanner.nextInt();
                    switch (meat) {
                        case 1:{
                            burger = new ChickenDecorator(burger);
                            System.out.println("add chicken cutlet");
                            content.put("Chicken cutlet", content.get("Chicken cutlet") + 1);
                            break;
                        }
                        case 2:{
                            burger = new BeefDecorator(burger);
                            System.out.println("add beef cutlet");
                            content.put("Beef cutlet", content.get("Beef cutlet") + 1);
                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    burger = new CheeseDecorator(burger);
                    System.out.println("add cheese");
                    content.put("Cheese", content.get("Cheese") + 1);
                    break;
                }

                case 3:{
                    burger = new SpicyDecorator(burger);
                    System.out.println("add cholopenio");
                    content.put("cholopnio", content.get("cholopnio") + 1);
                    break;
                }

                case 4:
                    System.out.println("Your burger cost " + burger.getCost() + " and has " + burger.getCallories() + " callories");
                    Enumeration enukeys = content.keys();
                    Enumeration enuelem = content.elements();
                    System.out.println("Your burger has");
                    while (enukeys.hasMoreElements()) {
                        int number = (int) enuelem.nextElement();
                        if(number > 0){
                            System.out.println(number + " " + enukeys.nextElement());
                        }

                    }
                    return;
            }

        }
    }
}
