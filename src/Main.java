public class Main {
    public static void main(String[] args) {
        int priceTicket = 1000;  //Цена билета
        int quantityMile;        //количество начисленных мили

        BonusMilesService service = new BonusMilesService();
        quantityMile = service.calculate(priceTicket);

        System.out.println("Всего мили:" + quantityMile);

    }
}
