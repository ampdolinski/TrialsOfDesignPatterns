package abstractfactory.template;


public class TemplateDemo {

    public static void main(String[] args) {

        PerformanceTestTemplate testTemplate = new ListSortPerformanceTest();

        testTemplate.run();

    }

}
