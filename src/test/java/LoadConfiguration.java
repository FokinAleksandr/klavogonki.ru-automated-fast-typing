import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;


public class LoadConfiguration {

    @BeforeClass
    public static void setSettings() {
        Configuration.timeout = 30000;
        Configuration.browser = "chrome";
    }
}
