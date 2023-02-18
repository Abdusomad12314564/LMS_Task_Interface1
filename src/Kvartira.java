public class Kvartira extends Person{
    public Kvartira(int adamSany, int birAigaTolooSummasy, int komUsluga) {
        super(adamSany, birAigaTolooSummasy, komUsluga);
    }

    @Override
    public void kaidaJashait() {
        System.out.println("Квартирада "+getAdamSany()+" адам жашайт, бир айга "+getBirAigaTolooSummasy()+" сом төлөшөт, ком услугага "+getKomUsluga()+" сом төлөшөт");
    }
}
