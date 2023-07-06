//Крестьянин, разбойник, снайпер, колдун, копейщик, арбалетчик, монах.
//Для каждого сформировать список свойств и возможных действий.
// Например, свойство скорость, действие, нанести удар.
// Проанализировать получившиеся свойства и действия персонажей и создать Обобщённый
// класс описывающий свойства и действия имеющиеся у всех персонажей.
// Создать этот класс.
// Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс.
// В основной программе создать по одному экземпляру каждого типа персонажей.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> teamOne = new ArrayList<>();
        ArrayList<Character> teamTwo = new ArrayList<>();
        List<Integer> positionsOne = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> positionsTwo = Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0);
        fillList(teamOne, positionsOne);
        fillList(teamTwo, positionsTwo);
        System.out.println(Arrays.toString(teamOne.toArray()));
        System.out.println("-----");
        System.out.println(Arrays.toString(teamTwo.toArray()));
        System.out.println("-----");
        for (Character c : teamOne) {
            c.step(teamTwo);
        }
        System.out.println("_____");
        for (Character c : teamTwo) {
            c.step(teamOne);
        }
    }

    public static void fillList(ArrayList<Character> list, List<Integer> positions) {
        for (int i = 0; i < 10; i++) {
            int cnt = new Random().nextInt(0, 7);
            switch (cnt) {
                case 0: {
                    list.add(new Crossbowman("crossbowman", positions.get(i), i));
                    break;
                }
                case 1: {
                    list.add(new Peasant("peasant", positions.get(i), i));
                    break;
                }
                case 2: {
                    list.add(new Mage("mage", positions.get(i), i));
                    break;
                }
                case 3: {
                    list.add(new Monk("monk", positions.get(i), i));
                    break;
                }
                case 4: {
                    list.add(new Rogue("rogue", positions.get(i), i));
                    break;
                }
                case 5: {
                    list.add(new Sniper("sniper", positions.get(i), i));
                    break;
                }
                default: {
                    list.add(new Spearman("spearman", positions.get(i), i));
                    break;
                }
            }
        }
    }
}