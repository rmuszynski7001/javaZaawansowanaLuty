package sda.patterns.behavioral;

public class TemplateMethodDemoApp {
    public static void main(String[] args) {
        NewsProvider newsProvider = new EmailNewsProvider("aa@bbb.ccc");
        newsProvider.setMessage("Bardzo ważny news: kończymy");
        newsProvider.provideNews();
    }
}
