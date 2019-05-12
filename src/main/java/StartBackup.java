import com.smattme.MysqlExportService;

class StartBackup {
     void start(){
        MysqlExportService mysqlExportService = new MysqlExportService(Config.getProperties());
        try {
            mysqlExportService.export();


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
