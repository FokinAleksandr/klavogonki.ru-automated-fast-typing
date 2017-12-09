package page;

import com.codeborne.selenide.SelenideElement;
import common.enums.AwaitingTimeEnum;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class TypingPage {

    @FindBy(how = How.ID, using = "host_start")
    private SelenideElement startLink;

    @FindBy(how = How.ID, using = "inputtext")
    private SelenideElement inputText;

    @FindBy(how = How.ID, using = "typefocus")
    private SelenideElement typeFocus;

    @FindBy(how = How.ID, using = "afterfocus")
    private SelenideElement afterFocus;

    public void type() {
        String initialText = typeFocus.getText() + " " + afterFocus.getText();

        String properText = initialText
            .replace("c", "с")
            .replace("o", "о");

        System.out.println(properText);

        inputText.setValue(properText);
    }
}
