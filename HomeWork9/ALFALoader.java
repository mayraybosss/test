package HomeWork9;

/**
 * Загрузчик курса с сайта Альфа Банка
 */
public class ALFALoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
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
            return Double.parseDouble(content.substring(346, 354)) * Double.parseDouble(content.substring(683, 691));
        } else if (currencyName.getId().equals(Currency.RUB.getId())) {
            return Double.parseDouble(content.substring(506, 514));
        } else if (currencyName.getId().equals(Currency.USD.getId())) {
            return Double.parseDouble(content.substring(683, 691));
        }
        return 0;
    }

    public String toString() {
        return "АльфаБанк:";
    }
}