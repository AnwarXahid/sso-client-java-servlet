package sso;

import java.io.InputStream;
import java.util.Properties;

public class SSOPropertyReader {
    private static SSOPropertyReader ssoFileReader = null;
    private static String appName = "SSO Testing";
    private static String appId = "qLLXu3XBllnR90OWKzUm3NnnYLthGUMb";
    private static String secret = "bTEWXWO3orST9NVJuZjyQhe7Zumq1riigPnkBGtjfHcUSaH3qRBcm9qA3ZPMDCQp0Ueybso1siKnzOKkzN6X1kJ0cBU6eEgj3B7kvJaw60kqMAwIzvRZ5ZBKSUGWXS2ltaBDsWgQXegqhHgr1NfRgjQm8hOMDL9l9iQtyNzdL3dyqa5YfuacPDnAOF08KCAMlxPF922aQINcOFvdzuS2rS2y18hAMAatbUkwCesi3O3I3EUcN0HBwvQKyNdrUz27";
    private static String idpUrl = "http://127.0.0.1:8088/";

    private static String appNameQS = "appName";
    private static String appLoginEndPoint = "applogin";
    private static String iaLoginEndPoint = "interapplogin";
    private static String etIntervalms = "180000";

    private static String redirectUri = "http://2d4897b2.ngrok.io/welcome.jsp";
    private static String landingPageUri = "http://2d4897b2.ngrok.io/welcome.jsp";
    private static String loginPageUri = "http://2d4897b2.ngrok.io/login";

    private static final String ssoPropertiesFileName = "sso.properties";

    private SSOPropertyReader() throws Exception {
        /*ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream resource = classLoader.getResourceAsStream(ssoPropertiesFileName);

        Path temp = Files.createTempFile("sso-", ".properties");
        Files.copy(classLoader.getResourceAsStream("sso.properties"), temp, StandardCopyOption.REPLACE_EXISTING);
        FileInputStream fileInput = new FileInputStream(temp.toFile());
        Properties properties = new Properties();
        properties.load(fileInput);
        fileInput.close();*/


        //Change
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream input = classLoader.getResourceAsStream("sso.properties");

        Properties properties = new Properties();
        properties.load(input);

        appId = properties.getProperty("appId");
        appName = properties.getProperty("appName");
        secret = properties.getProperty("sharedSecret");
        idpUrl = properties.getProperty("idpurl");
        appNameQS = properties.getProperty("appNameQS");
        appLoginEndPoint = properties.getProperty("apploginendpoint");
        iaLoginEndPoint = properties.getProperty("ialoginendpoint");
        etIntervalms = properties.getProperty("etintervalms");
        redirectUri = properties.getProperty("redirectUri");
        landingPageUri = properties.getProperty("landingPageUri");
        loginPageUri = properties.getProperty("loginpageuri");

        if (appId == null || appId.equals("")) {
            throw new Exception("App id is null or empty. Could not read app id from property file. Please set app id in properties file");
        }

        if (appName == null || appName.equals("")) {
            throw new Exception("App name is null or empty. Could not read app name from property file. Please set ap pname in properties file.");
        }

        if (secret == null || secret.equals("")) {
            throw new Exception("App id is null or empty. Could not read app id from property file. Please set app id in properties file");
        }

        if (idpUrl == null || idpUrl.equals("")) {
            throw new Exception("App id is null or empty. Could not read app id from property file. Please set app id in properties file");
        }

        if (appNameQS == null || appNameQS.equals("")) {
            throw new Exception("App id is null or empty. Could not read app id from property file. Please set app id in properties file");
        }

        if (appLoginEndPoint == null || appLoginEndPoint.equals("")) {
            throw new Exception("App login end point is null or empty. Could not read app id from property file. Please set app id in properties file");
        }

        if (iaLoginEndPoint == null || iaLoginEndPoint.equals("")) {
            throw new Exception("Inter app login end point is null or empty. Could not read dashboardLoginEndPoint from property file. Please set up dashboardLoginEndPoint in properties file");
        }

        if (etIntervalms == null || etIntervalms.equals("")) {
            throw new Exception("Expiry time interval is null or empty. Could not read etIntervalms from property file. Please set up etIntervalms in properties file");
        }

        if (loginPageUri == null || loginPageUri.equals("")) {
            throw new Exception("Login page uri is null or empty. Could not read loginpageuri from property file. Please set up loginpageuri in properties file");
        }
    }

    private synchronized static void createSSOFileReader() throws Exception {
        if (ssoFileReader == null) {
            ssoFileReader = new SSOPropertyReader();
        }
    }

    public synchronized static SSOPropertyReader getInstance() throws Exception {
        if (ssoFileReader == null) {
            createSSOFileReader();
        }
        return ssoFileReader;
    }

    public String getAppId() {
        return appId;
    }

    public String getAppName() {
        return appName;
    }

    public String getSecret() {
        return secret;
    }

    public String getIdpUrl() {
        return idpUrl;
    }

    public String getAppNameQS() {
        return appNameQS;
    }

    public String getAppLoginEndPoint() {
        return appLoginEndPoint;
    }

    public String getIALoginEndPoint() {
        return iaLoginEndPoint;
    }

    public String getEtIntervalms() {
        return etIntervalms;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public String getLandingPageUri() {
        return landingPageUri;
    }

    public String getLoginPageUri() {
        return loginPageUri;
    }
}
