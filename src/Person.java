public abstract class Person implements EmneKylat{
    private int adamSany;
    private int BirAigaTolooSummasy;
    private int KomUsluga;

    public Person(int adamSany, int birAigaTolooSummasy, int komUsluga) {
        this.adamSany = adamSany;
        BirAigaTolooSummasy = birAigaTolooSummasy;
        KomUsluga = komUsluga;
    }

    public int getAdamSany() {
        return adamSany;
    }

    public void setAdamSany(int adamSany) {
        this.adamSany = adamSany;
    }

    public int getBirAigaTolooSummasy() {
        return BirAigaTolooSummasy;
    }

    public void setBirAigaTolooSummasy(int birAigaTolooSummasy) {
        BirAigaTolooSummasy = birAigaTolooSummasy;
    }

    public int getKomUsluga() {
        return KomUsluga;
    }

    public void setKomUsluga(int komUsluga) {
        KomUsluga = komUsluga;
    }

    @Override
    public String toString() {
        return "Person{" +
                " adamSany= " + adamSany +
                ", BirAigaTolooSummasy= " + BirAigaTolooSummasy +
                ", KomUsluga= " + KomUsluga;
    }
}
