package org.example;

class KontraktnySotrudnik extends Sotrudnik {
    public KontraktnySotrudnik(String fio, String dolzhnost, double oklad) throws OkladException {
        super(fio, dolzhnost, oklad);
    }

    @Override
    public void rasschitatZarplatu() {
        try {
            System.out.println("Контрактная зарплата: " + getOklad());
        } catch (Exception e) {
            System.out.println("Ошибка при расчете контрактной зарплаты: " + e.getMessage());
        }
    }
}
