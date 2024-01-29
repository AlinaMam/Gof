package Gof_structer.Proxy.examle_from_lesson;

public class DatabaseCache extends DataBaseWorker {
    private DataBaseWorker service;
    private boolean needReset;//флаг, указывающий на необходимость сброса кэша
    private String querryCache;//поле для хранения результата
    private String connectCache;//поле для хранения результата

    public DatabaseCache(DataBaseWorker service) {
        this.service = service;
        this.needReset = false;
    }

    @Override
    public String connect(String ConnectionString) {
        if ((connectCache == null) || needReset) {
            querryCache = service.connect(ConnectionString);
        }
        return querryCache;
    }

    @Override
    public String querry(String SQL) {
        if ((connectCache == null) || needReset) {
            querryCache = service.querry(SQL);
        }
        return querryCache;
    }
}
