public class HomeMaintenanceCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the maintenance cost for Spring: $");
        double springCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Summer: $");
        double summerCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Fall: $");
        double fallCost = scanner.nextDouble();

        System.out.print("Enter the maintenance cost for Winter: $");
        double winterCost = scanner.nextDouble();

        // Calculate the total yearly maintenance cost
        double totalCost = springCost + summerCost + fallCost + winterCost;