import com.smattme.MysqlExportService;

import java.io.File;
import java.util.Properties;

class Config {
    static Properties getProperties(){
        Properties properties = new Properties();
        properties.setProperty(MysqlExportService.DB_NAME, "tabletwebdb");
        properties.setProperty(MysqlExportService.DB_USERNAME, "root");
        properties.setProperty(MysqlExportService.DB_PASSWORD, "Trance123");

        properties.setProperty(MysqlExportService.EMAIL_HOST, "smtp.mail.ru");
        properties.setProperty(MysqlExportService.EMAIL_PORT, "587");
        properties.setProperty(MysqlExportService.EMAIL_USERNAME, "mailforbackup@mail.ru");
        properties.setProperty(MysqlExportService.EMAIL_PASSWORD, "Trance123");
        properties.setProperty(MysqlExportService.EMAIL_FROM, "mailforbackup@mail.ru");
        properties.setProperty(MysqlExportService.EMAIL_TO, "Dmitriy.Polyakov@kantartns.com");

        properties.setProperty(MysqlExportService.TEMP_DIR, new File("C:\\MySQLBackups").getPath());

        properties.setProperty(MysqlExportService.PRESERVE_GENERATED_ZIP, "true");

        return properties;
    }
}
