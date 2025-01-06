import java.util.Scanner;

public class AsiaTravelRecommender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;

        //Question 1: Budget
        System.out.print("How much money can you spend per day (USD)? ");
        int budget = input.nextInt();

        if (budget < 30) {
            score += 1;
        } else if (budget < 50) {
            score += 2;
        } else if (budget < 100) {
            score += 3;
        } else {
            score += 4;
        }

        //Question 2: Length
        System.out.print("How many days are you traveling? ");
        int days = input.nextInt();

        if (days < 7) {
            score += 1;
        } else if (days < 14) {
            score += 2;
        } else if (days < 30) {
            score += 3;
        } else {
            score += 4;
        }

        //Question 3: Weather
        System.out.print("What weather do you prefer?\n");
        System.out.println("1. Cold (Below 15°C/59°F)");
        System.out.println("2. Mild (15-25°C/59-77°F)");
        System.out.println("3. Warm (25-30°C/77-86°F)");
        System.out.println("4. Hot (Above 30°C/86°F)");
        System.out.print("Enter number (1-4): ");
        int weather = input.nextInt();

        if (weather == 1) {
            score += 1;
        } else if (weather == 2) {
            score += 2;
        } else if (weather == 3) {
            score += 3;
        } else {
            score += 4;
        }

        //Question 4: Food
        System.out.print("How much do you like trying new foods? (1-5): ");
        int food = input.nextInt();

        if (food == 1) {
            score += 0;
        } else if (food == 2) {
            score += 1;
        } else if (food == 3) {
            score += 2;
        } else if (food == 4) {
            score += 3;
        } else {
            score += 4;
        }

        //Question 5: City Life
        System.out.print("Do you like big cities? (y/n): ");
        String city = input.next();

        if (city.equalsIgnoreCase("y")) {
            score += 3;
        } else if (city.equalsIgnoreCase("n")) {
            score -= 1;
        }

        //Question 6: Language
        System.out.print("Is it important to be able to speak English there? (y/n): ");
        String language = input.next();

        if (language.equalsIgnoreCase("y")) {
            score += 2;
        } else if (language.equalsIgnoreCase("n")) {
            score += 0;
        }

        //Question 7: Activities
        System.out.print("Want to see temples and historic sites? (y/n): ");
        String culture = input.next();

        if (culture.equalsIgnoreCase("y")) {
            score += 3;
        } else if (culture.equalsIgnoreCase("n")) {
            score += 0;
        }

        //Question 8: Shopping
        System.out.print("Do you want to go shopping? (y/n): ");
        String shopping = input.next();

        if (shopping.equalsIgnoreCase("y")) {
            score += 2;
        } else if (shopping.equalsIgnoreCase("n")) {
            score += 0;
        }

        //Print recommendations
        System.out.println("\nBased on your answers (Score: " + score + "), you should visit:");

        if (score >= 20) {
            System.out.println("\nJapan:");
            System.out.println("- Amazing mix of modern cities and ancient temples");
            System.out.println("- World-famous sushi and ramen");
            System.out.println("- Super clean and efficient trains");

            System.out.println("\nSingapore:");
            System.out.println("- English is an official language");
            System.out.println("- Amazing shopping and food courts");
            System.out.println("- Ultra-modern and very clean");

            System.out.println("\nSouth Korea:");
            System.out.println("- Cool mix of K-pop culture and traditions");
            System.out.println("- Delicious BBQ and street food");
            System.out.println("- Great for shopping and city life");
        } else if (score >= 15) {
            System.out.println("\nTaiwan:");
            System.out.println("- Famous night markets with amazing food");
            System.out.println("- Beautiful temples and mountain views");
            System.out.println("- Friendly people and some English support");

            System.out.println("\nMalaysia:");
            System.out.println("- English widely spoken");
            System.out.println("- Great shopping malls and street food");
            System.out.println("- Beautiful islands and beaches");

            System.out.println("\nChina:");
            System.out.println("- See the Great Wall and Forbidden City");
            System.out.println("- Different foods in each region");
            System.out.println("- Rich history everywhere you go");
        } else if (score >= 10) {
            System.out.println("\nVietnam:");
            System.out.println("- Very affordable travel");
            System.out.println("- Amazing pho and banh mi");
            System.out.println("- Beautiful beaches and landscapes");

            System.out.println("\nPhilippines:");
            System.out.println("- English is an official language");
            System.out.println("- Perfect beaches for island hopping");
            System.out.println("- Very friendly locals");

            System.out.println("\nIndonesia:");
            System.out.println("- Beautiful Bali beaches");
            System.out.println("- Tourist areas have good English");
            System.out.println("- Great for nature lovers");
        } else {
            System.out.println("\nBest places to start your Asia travel:");

            System.out.println("\nPhilippines:");
            System.out.println("- English widely used everywhere");
            System.out.println("- Tourist-friendly places");
            System.out.println("- Good mix of city and beach");

            System.out.println("\nMalaysia:");
            System.out.println("- Most people speak English");
            System.out.println("- Great public transport");
            System.out.println("- Modern conveniences");

            System.out.println("\nSingapore:");
            System.out.println("- English is main language");
            System.out.println("- Safe and clean");
            System.out.println("- Very tourist-friendly");
        }

        input.close();
    }
}