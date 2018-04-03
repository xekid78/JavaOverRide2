/**
 *
 * @author xekid78
 *
 */
class Player2 {
	public String myName;

	public Player2(String name) {
		myName = name;
	}

	public void attack(String enemy) {
		System.out.println(myName + "は、" + enemy + "を攻撃した！");
	}
}

class Wizard extends Player2 {
	public Wizard(String name) {
		super(name);
	}

	public void attack(String enemy) {
		System.out.println(myName + "は、" + enemy + "に炎を放った！");
	}
}

public class Override2 {
	public static void main(String[] args) {
		System.out.println("== パーティでスライムを攻撃 ==");

		Player2 hero = new Player2("勇者");
		Player2 worrior = new Player2("戦士");
		Wizard wizard = new Wizard("魔法使い");
		Player2[] party = {hero, worrior, wizard};

		for (Player2 member: party) {
			member.attack("スライム");
		}
	}
}
