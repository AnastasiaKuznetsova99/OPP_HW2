import java.util.ArrayList;

public abstract class Character implements CharacterInterface {
  protected Coordinates position;

  public Character(String name, int hp, int maxHp, int damage, int defense, int speed, int x, int y) {
    this.position = new Coordinates(x, y);
  }

  public Coordinates getCoordinates() {
    return position;
  }

  protected Character findNearest(ArrayList<Character> team) {
    Character nearest = team.get(0);
    for (Character character : team) {
      if (position.getDistance(character.getCoordinates()) < position.getDistance(nearest.getCoordinates())) {
        nearest = character;
      }
    }
        return nearest;
  }
}