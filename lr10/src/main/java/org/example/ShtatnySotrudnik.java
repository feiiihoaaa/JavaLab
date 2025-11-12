package org.example;

class ShtatnySotrudnik extends Sotrudnik {
    private double premiya;

    public ShtatnySotrudnik(String fio, String dolzhnost, double oklad, double premiya) throws OkladException {
        super(fio, dolzhnost, oklad);
        this.premiya = premiya;
    }

    public double getPremiya() { return premiya; }
    public void setPremiya(double premiya) { this.premiya = premiya; }

    @Override
    public void rasschitatZarplatu() {
        try {
            if (premiya < 0) {
                throw new PremiyaException("Премия не может быть отрицательной: " + premiya);
            }
            System.out.println("Зарплата с премией: " + (getOklad() + premiya));
        } catch (PremiyaException e) {
            System.out.println("Ошибка премии: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Общая ошибка: " + e.getMessage());
        }
    }
}
