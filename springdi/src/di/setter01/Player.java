package di.setter01;

//Player�� ���� �ִ� Dice�� �ܺ�(spring �����̳�)���� Injection �޾� ����ؾ� ��
//> Injection ���� �� �ֵ��� �̸� �غ��ؾ� ��
//> Constructor or Setter �޼ҵ�
public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	
	public Player() {
		
	}
	
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player�� �Ű����� 1�� ������");
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