import java.util.Scanner;

public class ExceptionBookManager {
	private static String[] book = { "C����", "���ݽṹ", "�������", "����", "��ѧ����", "ë��" };
	private static Scanner console;
	
	public static void main(String[] args){
		String name;
		while(true){
			System.out.println("�������ѯ��ʽ��1-��ѯͼ������2-��ѯͼ�����");
			try{
				int command = inputCommand();
				switch(command){
				case 1://����ͼ������ѡ��ͼ��
					name = getBookByName();
					System.out.println("Book:"+name);
					break;
				case 2://����ͼ�����ѡ��ͼ��
					name = getBookByNumber();
					System.out.println("Book:"+name);
					break;
				case -1:
					System.out.println("���������쳣����������ȷ���������");
					continue;
				default:
					System.out.println("���������쳣����������ȷ���������");
					continue;
				}
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
				
		}
	}
	
	private static int inputCommand() {
		// TODO Auto-generated method stub
		int command;
		try{
			console = new Scanner(System.in);
			command = console.nextInt();
		}catch(Exception e){
			//System.out.println("���������쳣����������ȷ���������");
			console = new Scanner(System.in);
			return -1;
		}
		return command;
	}

	private static String getBookByNumber() throws Exception{
		// TODO Auto-generated method stub
		while(true){
			//��ʾ��Ϣ����try������
			System.out.println("������ͼ����ţ�");
			//������������������ù��̷Ŵ� try���У������ǽ�����һ��������쳣�Ĳ��ּ��� try��
			try {
				int index = inputCommand();
				//�����ص������쳣����������ͼ�鲻�����쳣���ϲ���ô���
				if(index == -1){
					System.out.println("���������쳣����������ȷ���������");
					continue;
				}
				//��������û���쳣���������Խ���쳣�����װ
				String name = book[index-1];
				return name;
			} catch (ArrayIndexOutOfBoundsException e) {
				Exception notExist = new Exception("ͼ�鲻���ڣ����������룡");
				notExist.initCause(e);
				throw notExist;
			}
		}
	}

	private static String getBookByName() throws Exception{
		System.out.println("������ͼ������");
		console = new Scanner(System.in);
		String name = console.next();
		for (int i = 0; i < book.length; i++){
			if(book[i]==name){  //==��equals?????????????
				return name;
			}
		}
		throw new Exception("ͼ�鲻���ڣ����������룡");
	}
}
