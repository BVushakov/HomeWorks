package HW.HW13;

public class Config {

//    private String url = "https://www.google.com.ua/";
//
//    public void test() {
//        String urlFull = new UrlBuilder().buildUrl("http", "local", "8080", "login");
//        String url = new UrlBuilder().buildUrl("http", "local","login");
//    }


    class UrlBuilder {
        public String buildUrl(String protocol, String host, String port, String path) {
            return String.format("%s://%s:%s/%s", protocol, host, port, path);
        }

        public String buildUrl(String protocol, String host, String path) {
            return String.format("%s://%s/%s", protocol, host, path);
        }
    }

}
