# JavaOverRide2
オーバーライド

## 処理
Player2クラスのattack()メソッドをWizardクラスでオーバーライドする。

## コード
```
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
```

## 出力結果  
```
== パーティでスライムを攻撃 ==
勇者は、スライムを攻撃した！
戦士は、スライムを攻撃した！
魔法使いは、スライムに炎を放った！
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
