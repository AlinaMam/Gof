package Gof_structer.Proxy.examle_from_internet;

import java.time.LocalDate;

public class DailyReport implements Report{
    //получить данные
    //подготовить отчет
    @Override
    public String prepareReport(LocalDate localDate) {
        return "Ежедневный отчет за " + localDate;
    }
}
