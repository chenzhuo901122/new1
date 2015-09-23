import java.util.Scanner;

public class ExceptionBookManager {
	private static String[] book = { "C语言", "数据结构", "汇编语言", "高数", "大学语文", "毛概" };
	private static Scanner console;
	
	public static void main(String[] args){
		String name;
		while(true){
			System.out.println("请输入查询方式：1-查询图书名；2-查询图书序号");
			try{
				int command = inputCommand();
				switch(command){
				case 1://按照图书名称选择图书
					name = getBookByName();
					System.out.println("Book:"+name);
					break;
				case 2://按照图书序号选择图书
					name = getBookByNumber();
					System.out.println("Book:"+name);
					break;
				case -1:
					System.out.println("错误命令异常！请输入正确的数字命令！");
					continue;
				default:
					System.out.println("错误命令异常！请输入正确的数字命令！");
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
			//System.out.println("错误命令异常！请输入正确的数字命令！");
			console = new Scanner(System.in);
			return -1;
		}
		return command;
	}

	private static String getBookByNumber() throws Exception{
		// TODO Auto-generated method stub
		while(true){
			//提示信息放在try块外面
			System.out.println("请输入图书序号：");
			//将整个输入命令方法调用过程放大 try块中，而不是仅仅将一部分设计异常的部分加入 try块
			try {
				int index = inputCommand();
				//处理返回的输入异常，由自身处理，图书不存在异常由上层调用处理
				if(index == -1){
					System.out.println("错误命令异常！请输入正确的数字命令！");
					continue;
				}
				//输入命令没有异常则进入数组越界异常捕获包装
				String name = book[index-1];
				return name;
			} catch (ArrayIndexOutOfBoundsException e) {
				Exception notExist = new Exception("图书不存在！请重新输入！");
				notExist.initCause(e);
				throw notExist;
			}
		}
	}

	private static String getBookByName() throws Exception{
		System.out.println("请输入图书名：");
		console = new Scanner(System.in);
		String name = console.next();
		for (int i = 0; i < book.length; i++){
			if(book[i]==name){  //==和equals?????????????
				return name;
			}
		}
		throw new Exception("图书不存在！请重新输入！");
	}
}
