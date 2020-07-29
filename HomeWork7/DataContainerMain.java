package HomeWork7;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        String[] data = new String[2];

        DataContainer dataContainer = new DataContainer(data);
        dataContainer.add("adfwaf");
        dataContainer.add("adfgaf");
        dataContainer.add("adfcaaf");
        dataContainer.add("adfardwaf");
        dataContainer.delete(0);
        dataContainer.delete("adfcaaf");
        System.out.println(Arrays.toString(dataContainer.getItems()));
    }
}
