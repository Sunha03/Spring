package di.setter01;

//Player가 갖고 있는 Dice를 외부(spring 컨테이너)에서 Injection 받아 사용해야 함
//> Injection 받을 수 있도록 미리 준비해야 함
//> Constructor or Setter 메소드
public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	
	public Player() {
		
	}
	
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player의 매개변수 1개 생성자");
	}
	
	//setter
	public void setD(AbstractDice d) {
		this.d = d;
	}
	
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	
	public AbstractDice getD() {
		return d;
	}

	public int getTotalValue(){
		return totalValue;
	}
}