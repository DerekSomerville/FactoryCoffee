public class OrderCoffee {

    public Coffee orderCoffee(String typeOfCoffee){
        Coffee coffee;
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffee = coffeeFactory.createCoffee(typeOfCoffee);

        coffee.prepare();
        coffee.getCoffeeCup();
        coffee.pourCoffee();
        coffee.serve();

        return coffee;
    }

    public static void main(String[] args){
        OrderCoffee orderCoffee = new OrderCoffee();
        Coffee coffee = orderCoffee.orderCoffee(CoffeeType.mocha);
        System.out.println(coffee.getName());
    }

}
