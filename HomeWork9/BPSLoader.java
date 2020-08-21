package HomeWork9;

/**
 * Загрузчик курса с сайта БПС-Сбербанка
 */
public class BPSLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://www.bps-sberbank.by/page/currency-exchange-cards", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        //TODO дописываем код сюда
        if (currencyName.getId().equals(Currency.EUR.getId())) {
            String[] arr = content.substring(71603, 71609).split(",");
            return Double.parseDouble(arr[0] + "." + arr[1]);
        } else if (currencyName.getId().equals(Currency.RUB.getId())) {
            String[] arr = content.substring(72094, 72100).split(",");
            return Double.parseDouble(arr[0] + "." + arr[1]);
        } else if (currencyName.getId().equals(Currency.USD.getId())) {
            String[] arr = content.substring(72577, 72583).split(",");
            return Double.parseDouble(arr[0] + "." + arr[1]);
        }
        return 0;
    }

    public String toString() {
        return "БПС-Сбербанк:";
    }
}