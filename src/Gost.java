public class Gost extends Person{

    public Gost(int adamSany, int birAigaTolooSummasy, int komUsluga) {
        super(adamSany, birAigaTolooSummasy, komUsluga);
    }

    @Override
    public void kaidaJashait() {
        System.out.println("Мейманканада "+getAdamSany()+" адам жашайт, бир айга "+getBirAigaTolooSummasy()+" сом төлөшөт");
    }
}
