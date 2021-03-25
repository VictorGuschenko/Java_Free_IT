public class MyServiceRunner {
    public static void main(String[] args) throws Exception {

        AllowObjectCreatePrivateMethodCallAnnotationProcessor ann =
                new AllowObjectCreatePrivateMethodCallAnnotationProcessor();
        ann.process(MyService.class);

    }
}
