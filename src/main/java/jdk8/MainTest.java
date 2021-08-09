package jdk8;

public class MainTest {
    public static void main(String[] args) {
        long totalDialSizeInTheAddressBookInAMonth = 5;
        long totalDailSizeInTheAddressBook = 7;
        final double percentageInAMonth = (double) totalDialSizeInTheAddressBookInAMonth / totalDailSizeInTheAddressBook;
        System.out.println("percentageInAMonth = " + percentageInAMonth);
    }
}
