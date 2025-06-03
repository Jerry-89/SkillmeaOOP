import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    RodinnyDom domJanik = new RodinnyDom();
    domJanik.pocetPoschodi = 4;
    domJanik.rozloha = 457f; // f na konci lebo je to float
    domJanik.material = "drevotrieska";
    domJanik.pocOkien = 3;

    RodinnyDom domZajac = new RodinnyDom(); //vytvoril som dalsi rodinny dom
    domZajac.pocetPoschodi = 5;
    domZajac.rozloha = 457f;
    domZajac.material = "tehla";
    domZajac.pocOkien = 5;