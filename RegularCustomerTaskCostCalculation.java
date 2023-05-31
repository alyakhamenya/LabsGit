public class RegularCustomerTaskCostCalculation implements ITaskCostCalculation{
    @Override
    public double calculate(Task task) {
        double cost = task.getBasePrice();
        cost *= 0.9; // Скидка 10% для постоянных клиентов
        return cost;
    }
}
