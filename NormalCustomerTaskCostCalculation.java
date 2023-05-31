public class NormalCustomerTaskCostCalculation implements ITaskCostCalculation{
    @Override
    public double calculate(Task task) {
        double cost = task.getBasePrice();
        if (task.getQuantity() > 100) {
            cost *= 0.95; // Скидка 5% для заказов свыше 100 единиц
        }
        return cost;
    }
}
