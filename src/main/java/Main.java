import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
//        GoToSchool goToSchool = new GoToSchool();
//        goToSchool.move();

        GenericXmlApplicationContext ctx =
                new GenericXmlApplicationContext("classpath:applicationContext.xml");

        GoToSchool goToSchool = ctx.getBean("tWalk", GoToSchool.class);
        goToSchool.move();

        ctx.close();
    }
}
