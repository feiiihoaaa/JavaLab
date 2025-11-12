package org.example;

class Sotrudnik {
    private String fio;
    private String dolzhnost;
    private double oklad;

    public Sotrudnik(String fio, String dolzhnost, double oklad) throws OkladException {
        if (fio == null || fio.isEmpty()) {
            throw new IllegalArgumentException("ФИО не может быть пустым");
        }
        if (dolzhnost == null || dolzhnost.isEmpty()) {
            throw new IllegalArgumentException("Должность не может быть пустой");
        }
        if (oklad < 0) {
            throw new OkladException(oklad);
        }
        this.fio = fio;
        this.dolzhnost = dolzhnost;
        this.oklad = oklad;
    }

    public String getFio() { return fio; }
    public void setFio(String fio) { this.fio = fio; }

    public String getDolzhnost() { return dolzhnost; }
    public void setDolzhnost(String dolzhnost) { this.dolzhnost = dolzhnost; }

    public double getOklad() { return oklad; }
    public void setOklad(double oklad) { this.oklad = oklad; }

    public void rasschitatZarplatu() {
        try {
            System.out.println("Зарплата: " + oklad);
        } catch (Exception e) {
            System.out.println("Ошибка при расчете зарплаты: " + e.getMessage());
        }
    }
}
