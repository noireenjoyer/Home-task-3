import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/*Сума продажів товару дорівнює добутку кількості (шт) та ціни.
Ціна має грошовий формат, два знаки після десяткового
роздільника.
Середньоденна сума продажів дорівнює результату від поділу
загальної суми продажів на кількість днів проведення торгівлі.
Реалізуйте функціонал розрахунку суми продажів за певний період
та середньоденної суми продажів.
Виведення в консоль тексту замовлень має такий вигляд:

Product No 1: smartphone,
total sales for 5 days is EUR 12153,41,
sales by day is EUR 2430,68.
Product No 2: laptop,
total sales for 7 days is EUR 10486,85,
sales by day is EUR 1498,12.

При реалізації функціоналу зверніть увагу на створення
та перевикористання певних змінних для відповідних даних
товарів.
Для округлення значень розрахункових сум можете скористатись
можливостями System.out.printf().*/

    public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Enter the count of phone - "); //Ввод информации про первый товар
        int quantity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the price - ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("How many days sale had been being? - ");
        int count_days = Integer.parseInt(scanner.nextLine());

        double total_sales; //Подсчет
        total_sales = quantity * price;

        double sales_by_day;
        sales_by_day = total_sales / count_days;

        System.out.println("\nProduct No 1: smartphone," +
                "\ntotal sales for " + count_days + "days is EUR " + decimalFormat.format(total_sales) +
                "\nsales by day is EUR " + decimalFormat.format(sales_by_day));
        System.out.println();


        System.out.println("Enter the count of laptop - "); //Ввод информации про второй товар
        quantity = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the price - ");
        price = Double.parseDouble(scanner.nextLine());

        System.out.println("How many days sale had been being? - ");
        count_days = Integer.parseInt(scanner.nextLine());

        total_sales = quantity * price; //Подсчет

        sales_by_day = total_sales / count_days;


        System.out.println("\n Product No 2: laptop," +
                "\n total sales for" +  count_days + "days is EUR" + decimalFormat.format(sales_by_day) +
                "\n sales by day is EUR" + decimalFormat.format(sales_by_day));
        System.out.println();


    }
    }
