package HomeWork9;

import org.w3c.dom.ls.LSOutput;

public class Test {
    public static void main(String[] args) {
        printRates(new BelAgroLoader());
        printRates(new BPSLoader());
        printRates(new ALFALoader());
        printRates(new NBRBLoader());
    }

    public static void printRates(SiteLoader loader){
        System.out.println(loader.toString());
        System.out.println("EUR: " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("RUB(for 100): " + loader.load(SiteLoader.Currency.RUB));
        System.out.println("USD: " + loader.load(SiteLoader.Currency.USD));
        System.out.println();
    }

}
