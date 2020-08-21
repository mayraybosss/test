package HomeWork9;

/**
 * Загрузчик курса с сайта БелАгроПромБанка
 */
public class BelAgroLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://belapb.by/ExCardsDaily.php?ondate=8/21/2020", currencyName);
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
            return Double.parseDouble(content.substring(613, 619));
        } else if (currencyName.getId().equals(Currency.RUB.getId())) {
            return Double.parseDouble(content.substring(945, 951));
        } else if (currencyName.getId().equals(Currency.USD.getId())) {
            return Double.parseDouble(content.substring(283, 289));
        }
        return 0;
    }

    public String toString() {
        return "БелАгроПромБанк:";
    }
}