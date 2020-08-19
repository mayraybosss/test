package HomeWork9;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        //TODO дописываем код сюда
        if (currencyName.getId().equals(Currency.EUR.getId())) {
            return Double.parseDouble(content.substring(119, content.length() - 2));
        } else if (currencyName.getId().equals(Currency.RUB.getId())) {
            return Double.parseDouble(content.substring(134, content.length() - 2));
        } else if (currencyName.getId().equals(Currency.USD.getId())) {
            return Double.parseDouble(content.substring(125, content.length() - 2));
        }
        return 0;

    }
}
