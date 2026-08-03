import java.util.Scanner;

public class bookTitle {
    public static void main(String[] args) {
		String[] books = {"Time of life", "Mirrors of zoom","Dork Diaries","Heart Rates","Dealer","Poker Game","Deck of cards","Face Suite","Fibonacci","Polling"};


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the book title to search: ");
        String searchTitle = scanner.nextLine();

        boolean found = false;

        for (String book : books) {
            if (book.equals(searchTitle)) {
                found = true;
            }
        }

        if (found == true) {
            System.out.println("Book found: " + searchTitle);
        } else {
            System.out.println("Book not found.");
        }
    }
}