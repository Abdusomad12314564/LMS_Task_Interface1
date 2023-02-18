public class Main {
    public static void main(String[] args) {
        //todo Бул квда, уйдө жана мейманканада кандай адам жашайт жана чыгымдары канча толук маалымат чыгарып берет.
        EmneKylat dom = new Dom(5,0,1000);
        EmneKylat kvartira = new Kvartira(3,20000,1000);
        EmneKylat gost = new Gost(2,30000,0);

        EmneKylat [] emneKylats={dom,kvartira,gost};
        for (EmneKylat arr:emneKylats) {
            arr.kaidaJashait();
        }
    }
}