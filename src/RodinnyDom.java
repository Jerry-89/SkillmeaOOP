public class RodinnyDom {
    int pocetPoschodi;
    String material; //string, pretoze to bude text
    float rozloha; //float pretoze to moze byt desatinne cislo
    int pocOkien;
    int cenaZaMeter;

    public void vypocetCenyDomu (int cenaZaMeter, String menoRodiny){
        System.out.println(menoRodiny + (rozloha * cenaZaMeter * pocetPoschodi)); //prenasobi rozlohu cenou 8000€
    }
}
