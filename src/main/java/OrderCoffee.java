public class OrderCoffee {

    public Coffee orderCoffee(String typeOfCoffee){
        Coffee coffee;

        if (typeOfCoffee == CoffeeType.americano){
            coffee = new Americano();
        } else if (typeOfCoffee == CoffeeType.cappuccino){
            coffee = new Cappuccino();
        } else if (typeOfCoffee == CoffeeType.espresso){
            coffee = new Espresso();
        } else if (typeOfCoffee == CoffeeType.flatWhite){
            coffee = new FlatWhite();
        } else {
            coffee = new Americano();
        }

        coffee.prepare();
        coffee.getCoffeeCup();
        coffee.pourCoffee();
        coffee.serve();

        return coffee;
    }

    public static void main(String[] args){
        OrderCoffee orderCoffee = new OrderCoffee();
        Coffee coffee = orderCoffee.orderCoffee(CoffeeType.flatWhite);
        System.out.println(coffee.getName());
    }

}
