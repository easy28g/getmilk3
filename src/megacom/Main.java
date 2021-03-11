package megacom;

import megacom.service.impl.OrderServiceImpl;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
        OrderServiceImpl orderService = new OrderServiceImpl();
        OrderServiceImpl orderService1 = new OrderServiceImpl();
        Queue<OrderServiceImpl> orderServiceQueue = new PriorityQueue<>();

        orderService.createOrder();
        orderService.createOrder();

        orderService1.createOrder();
        orderService1.createOrder();

        orderService.outputOrder();
        orderService1.outputOrder();

        orderService.deletOrder();


        orderService.outputOrder();
        orderService1.outputOrder();

        orderServiceQueue.offer(orderService);
        orderServiceQueue.offer(orderService1);

        System.out.println(orderServiceQueue.poll());
        System.out.println(orderServiceQueue.poll());

 */


        Queue<OrderServiceImpl> orderServiceQueue = new PriorityQueue<>();
        //List<OrderServiceImpl> orderServiceArrayList = new ArrayList<>();
        OrderServiceImpl orderService2 = null;
        int chooseOrder;
        do {
            System.out.println("Создать заказ - 1");
            System.out.println("Список заказов - 2");
            System.out.println("Удалить заказ - 3");
            System.out.println("ВЫХОД - 0");
            chooseOrder = scanner.nextInt();
            System.out.println("****************************************************************************");

            if(chooseOrder==0){
                break;
            }

            if(chooseOrder==1) {

                orderService2 = new OrderServiceImpl();

                int chooseProduct;
                do {
                    System.out.println("Добавить продукт - 1");
                    System.out.println("Выйти - 0");
                    chooseProduct = scanner.nextInt();
                    System.out.println("****************************************************************************");

                    if (chooseProduct == 0) {
                        break;
                    }
                    orderService2.createOrder();

                    //orderServiceArrayList.add(orderService2);
                } while (true);
                orderServiceQueue.offer(orderService2);
            }

            if(chooseOrder==2){
                List<OrderServiceImpl> orderServiceList = new ArrayList<>(orderServiceQueue);
                for(int i=0; i<orderServiceQueue.size(); i++) {
                    orderServiceList.get(i).outputOrder();
                }
            }

            if(chooseOrder==3){
                System.out.print("Введите ID заказа: ");
                int chooseOrderDelete = scanner.nextInt();

                List<OrderServiceImpl> orderServiceList = new ArrayList<>(orderServiceQueue);

                for(int i=0; i<orderServiceList.size(); i++) {
                    orderServiceList.get(i).deleteOrderId(chooseOrderDelete);
                }

            }

        }while(true);


    }
}
