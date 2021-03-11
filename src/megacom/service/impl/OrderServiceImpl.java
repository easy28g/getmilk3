package megacom.service.impl;

import megacom.enums.Units;
import megacom.models.Order;
import megacom.models.Product;
import megacom.service.OrderService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class OrderServiceImpl implements OrderService, Comparable<OrderServiceImpl> {

    Scanner scan = new Scanner(System.in);

    Order order;
    List<Product> productList = new ArrayList<>();
    List<Order> orderServiceList = new ArrayList<>();

    @Override
    public void createOrder() {
        Date date = new Date();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Product product = addProduct();

        order = new Order(date);

        productList.add(product);

        orderServiceList.add(order);

        System.out.println("****************************************************************************");

    }

    private Product addProduct() {

        System.out.print("Название продукта: ");
        String productName = scan.next();

        System.out.print("Количество: ");
        int amount = scan.nextInt();

        System.out.println("Единица измерения: 1-LTD, 2-KG, 3-GRM, 4-PEACE");
        int chooseUnits = scan.nextInt();


        Units units = null;
        switch (chooseUnits){
            case 1:
                units = Units.LTD;
                break;
            case 2:
                units = Units.KG;
                break;
            case 3:
                units = Units.GRM;
                break;
            case 4:
                units = Units.PEACE;
                break;

            default: break;
        }

        System.out.print("Описание продукта-");
        String productDescription = scan.next();

        Product product = new Product(productName, amount, units, productDescription);

        return product;
    }

    @Override
    public void outputOrder() {
        System.out.println("Заказ ID: "+order.getId());
        for(int i=0; i<productList.size(); i++) {
            System.out.println((i+1)+") Название продута: "+productList.get(i).getProductName());
            System.out.println((i+1)+") Описание продукта: "+productList.get(i).getDiscription());
        }

        System.out.println("****************************************************************************");
    }



    @Override
    public int compareTo(OrderServiceImpl o) {
        return 0;
    }


    public void deleteOrderId(int id) {
        for(int i=0; i<orderServiceList.size(); i++) {
            if(id == orderServiceList.get(i).getId()){
                productList.clear();
            }
        }


    }
}
