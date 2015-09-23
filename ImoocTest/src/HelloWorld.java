/*
//外部类
public class HelloWorld {
    
    // 外部类中的静态变量score
    private static int score = 84;
    
    // 创建静态内部类
	public  static  class SInner {
        // 内部类中的变量score
        int score = 91;
        
		public void show() {
			System.out.println("访问外部类中的score：" + HelloWorld.score           );
			System.out.println("访问内部类中的score：" + score);
		}
	}

	// 测试静态内部类
	public static void main(String[] args) {
		// 直接创建内部类的对象
         SInner si=new SInner();
        
        // 调用show方法
		si.show();
	}
}
*/
////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*
//外部类
public class HelloWorld {
    
    private String name = "爱慕课";
    
    // 外部类中的show方法
    public void show() { 
		// 定义方法内部类
		class MInner {
			int score = 83;
			public int getScore() {
				return score + 10;
			}
		}
        
		// 创建方法内部类的对象
        MInner mi=new MInner();
        
        // 调用内部类的方法
		int newScore=mi.getScore();
        
		System.out.println("姓名：" + name + "\n加分后的成绩：" + newScore);
	}
    
	// 测试方法内部类
	public static void main(String[] args) {
        
		// 创建外部类的对象
        HelloWorld mo=new HelloWorld();
        
        // 调用外部类的方法
		mo.show();
	}
}
*/
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
