package guru.springframework.propertyexamplebeans;

/**
 * Created by shivam (techSavyThor) on 05/18/2019
 */

public class FakeJmsBroker {

    private String jmsUsername;
    private String jmsPassword;
    private String jmsUrl;

    public String getJmsUsername() {
        return jmsUsername;
    }

    public void setJmsUsername(String jmsUsername) {
        this.jmsUsername = jmsUsername;
    }

    public String getJmsPassword() {
        return jmsPassword;
    }

    public void setJmsPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getJmsUrl() {
        return jmsUrl;
    }

    public void setJmsUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
