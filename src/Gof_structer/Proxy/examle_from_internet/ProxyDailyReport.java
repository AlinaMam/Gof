package Gof_structer.Proxy.examle_from_internet;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProxyDailyReport implements Report {
    //наличие объекта и реализация интерфейса - это две обязательные вещи для реализации данного паттерна
    private DailyReport dailyReport;
    private static Map<LocalDate, String> cache = new HashMap<>();

    public ProxyDailyReport(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String prepareReport(LocalDate localDate) {
        /*Proxy может использоваться для разных вещей:
        * -- кэширование
        * -- отложенная (ленивая инициализация)
        * -- промежуточные проверки данных и доступа
        * -- запуск параллельных потоков обработки
        * */
        if(cache.get(localDate) == null) {
            String report = dailyReport.prepareReport(localDate);
            cache.put(localDate, report);
            return report;
        }
        return cache.get(localDate);
    }
}
