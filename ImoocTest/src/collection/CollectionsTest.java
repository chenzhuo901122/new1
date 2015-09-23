package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {
	
	public void testSort1(){
		List<Integer> integerList = new ArrayList<Integer>();
		Random random = new Random();
		Integer k;
		for (int i = 0;i<10;i++){
			do{
				k=random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("成功添加整数"+k);
		}
		System.out.println("排序前");
		for(Integer integer:integerList){
			System.out.println(integer);
		}
		Collections.sort(integerList);
		System.out.println("排序后");
		for(Integer integer:integerList){
			System.out.println(integer);
		}	
	}
	
	public void testSort2(){
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("baidu");
		System.out.println("排序前");
		for(String string:stringList){
			System.out.println(string);
		}
		Collections.sort(stringList);
		System.out.println("排序后");
		for(String string:stringList){
			System.out.println(string);
		}
	}
	
	public void testSort3(){
		List<String> stringList = new ArrayList<String>();
		Random random = new Random();
		
		for(int i=0;i<20;i++){
			//添加20条随机字符串
			int k = random.nextInt(9)+1;//长度10以内的字符串（不含0）
			String rs = CollectionsTest.testRandomString(k);
			while(!stringList.contains(rs)){
				stringList.add(rs);
			}
			System.out.println("成功添加字符串"+rs);
		}
		System.out.println("容量"+stringList.size());
		Collections.sort(stringList);
		System.out.println("排序后");
		for(String string:stringList){
			System.out.println(string);
		}
	}

	
	public static String testRandomString(int length){
		Random random = new Random();
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";  
		StringBuffer sb = new StringBuffer();
		
        for(int i = 0 ; i < length; ++i){  
            int number = random.nextInt(62);    
            sb.append(str.charAt(number));  
        }  
        return sb.toString(); 
	}
	
	public void testSort4(){
		//comparable 接口实现排序
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("3","xiaoming"));
		studentList.add(new Student("2","xiaohong"));
		studentList.add(new Student("1","xiaolan"));
		studentList.add(new Student("100","xiaogou"));
		for (Student student:studentList){
			System.out.println("学生"+student.name);
		}
		Collections.sort(studentList);
		System.out.println("排序后");
		for (Student student:studentList){
			System.out.println("学生"+student.name);
		}
		System.out.println("按照姓名排序");
		Collections.sort(studentList,new StudentComparator());
		for (Student student:studentList){
			System.out.println("学生"+student.name);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
//		ct.testSort1();
//		ct.testSort2();
//		ct.testSort3();
		ct.testSort4();
	}

}
