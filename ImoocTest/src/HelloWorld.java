/*
//�ⲿ��
public class HelloWorld {
    
    // �ⲿ���еľ�̬����score
    private static int score = 84;
    
    // ������̬�ڲ���
	public  static  class SInner {
        // �ڲ����еı���score
        int score = 91;
        
		public void show() {
			System.out.println("�����ⲿ���е�score��" + HelloWorld.score           );
			System.out.println("�����ڲ����е�score��" + score);
		}
	}

	// ���Ծ�̬�ڲ���
	public static void main(String[] args) {
		// ֱ�Ӵ����ڲ���Ķ���
         SInner si=new SInner();
        
        // ����show����
		si.show();
	}
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
//�ⲿ��
public class HelloWorld {
    
    private String name = "��Ľ��";
    
    // �ⲿ���е�show����
    public void show() { 
		// ���巽���ڲ���
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// ���������ڲ���Ķ���
        MInner mi=new MInner();
        
        // �����ڲ���ķ���
		int newScore=mi.getScore();
        
		System.out.println("������" + name + "\n�ӷֺ�ĳɼ���" + newScore);
	}
    
	// ���Է����ڲ���
	public static void main(String[] args) {
        
		// �����ⲿ��Ķ���
        HelloWorld mo=new HelloWorld();
        
        // �����ⲿ��ķ���
		mo.show();
	}
}
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
