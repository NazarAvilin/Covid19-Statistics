package model;

public class JsonData {

    private String country;
    private int cases;
    private int todayCases;
    private int deaths;
    private int todayDeaths;
    private int recovered;
    private int active;
    private int critical;
    private int casesPerOneMillio;
    private int daethsPerOneMillion;
    private int totalTests;
    private int testsPerOneMillion;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getTodayCases() {
        return todayCases;
    }

    public void setTodayCases(int todayCases) {
        this.todayCases = todayCases;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getTodayDeaths() {
        return todayDeaths;
    }

    public void setTodayDeaths(int todayDeaths) {
        this.todayDeaths = todayDeaths;
    }

    public int getRecovered() {
        return recovered;
    }

    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCritical() {
        return critical;
    }

    public void setCritical(int critical) {
        this.critical = critical;
    }

    public int getCasesPerOneMillio() {
        return casesPerOneMillio;
    }

    public void setCasesPerOneMillio(int casesPerOneMillio) {
        this.casesPerOneMillio = casesPerOneMillio;
    }

    public int getDaethsPerOneMillion() {
        return daethsPerOneMillion;
    }

    public void setDaethsPerOneMillion(int daethsPerOneMillion) {
        this.daethsPerOneMillion = daethsPerOneMillion;
    }

    public int getTotalTests() {
        return totalTests;
    }

    public void setTotalTests(int totalTests) {
        this.totalTests = totalTests;
    }

    public int getTestsPerOneMillion() {
        return testsPerOneMillion;
    }

    public void setTestsPerOneMillion(int testsPerOneMillion) {
        this.testsPerOneMillion = testsPerOneMillion;
    }

    @Override
    public String toString() {
        return " Количество заразившихся COVID-19 в: \n" +
                " Страна: '" + country + '\'' +
                "\n Всего заразившихся: " + cases +
                "\n Заразилось сегодня: " + todayCases +
                "\n Всего летальных исходов: " + deaths +
                "\n Летальных исходов сегодня: " + todayDeaths +
                "\n Вылечено: " + recovered +
                "\n Активных случаев: " + active +
                "\n В критическом состоянии: " + critical +
                "\n Случаев на 1 млн: " + casesPerOneMillio +
                "\n Смертей на 1 млн: " + daethsPerOneMillion +
                "\n Всего тестов: " + totalTests +
                "\n Всего тестов на 1 млн: " + testsPerOneMillion;
    }
}
