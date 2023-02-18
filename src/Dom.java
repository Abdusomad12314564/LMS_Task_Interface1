public class Dom extends Person{

    public Dom(int adamSany, int birAigaTolooSummasy, int komUsluga) {
        super(adamSany, birAigaTolooSummasy, komUsluga);
    }

    @Override
    public void kaidaJashait() {
        System.out.println("Жер үйдө "+getAdamSany()+" адам жашайт, ком услуга бир айга "+getKomUsluga()+" сом төлөнөт");
    }
}
