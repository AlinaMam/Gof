package Gof_structer.Proxy.examle_from_internet;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        prepare(new ProxyDailyReport(new DailyReport()), LocalDate.now());
    }
    private static void prepare(Report report, LocalDate localDate) {
        System.out.println(report.prepareReport(localDate));
    }
}
