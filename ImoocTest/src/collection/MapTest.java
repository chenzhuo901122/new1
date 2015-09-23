package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	
	public Map<String,Student> students;
	
	public MapTest(){
		this.students = new HashMap<String, Student>();
	}
	
	public void testPut(){
		Scanner console = new Scanner(System.in);
		int i=0;
		while(i<3){
			System.out.println("请输入学生ID");
			String ID = console.next();
			//判断ID是否被占用
			Student st = students.get(ID);
			if(st == null){
				System.out.println("请输入学生姓名");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				//添加ID-student映射
				students.put(ID, newStudent);
				System.out.println(students.get(ID).name);
				i++;
			}else{
				System.out.println("该学生ID已被占用");
				continue;
			}
		}
	}
	
	public void testKeySet(){
		//通过keySet方法返回Map中所有键的Set集合
		Set<String> keySet = students.keySet();
		//students容量
		System.out.println("总共有"+students.size()+"个学生");
		//遍历keySet，取得每个键，调用get方法获得对应value
		for(String stuId : keySet){
			Student st = students.get(stuId);
			if(st!=null){
				System.out.println("学生"+st.name);
			}
		}
	}
	
	public void testRemove(){
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("请输入要删除学生ID");
			String ID = console.next();
			Student st = students.get(ID);
			if (st == null){
				System.out.println("ID不存在");
				continue;
			}
			students.remove(ID);
			System.out.println("成功删除学生"+st.name);
			break;
		}
	}
	
	public void testEntrySet(){
		//通过entrySet方法，返回Map中的所有键值对
		Set<Entry<String,Student>> entrySet = students.entrySet();
		for(Entry<String,Student> entry:entrySet){
			System.out.println("取得键"+entry.getKey());
			System.out.println("对应值为"+entry.getValue().name);
		}
	}
	
	public void testModify(){
		System.out.println("请输入要修改学生ID");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if (student ==null){
				System.out.println("该ID不存在，请重新输入");
				continue;
			}
			System.out.println("当前学生ID对应学生为"+student.name);
			System.out.println("请输入新的学生姓名");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID,newStudent);
			System.out.println("修改成功");
			break;
		}
	}
	
	public void testContainsKeyOrValue(){
		//在Map中，用containsKey（）方法判断是否包含某个Key值
		//用containsValue（）方法判断是否包含某个Value值
		System.out.println("请输入要查询的学生ID");
		Scanner console = new Scanner(System.in);
		String id = console.next();
		
		System.out.println("是否存在"+students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("对应学生姓名"+students.get(id).name);
		
		System.out.println("请输入要查询的学生姓名");
		String name = console.next();
		
		if(students.containsValue(new Student(null,name)))
			System.out.println("在映射表中确实包含学生");
		else
			System.out.println("在映射表中不存在该学生");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
	//	mt.testRemove();
	//	mt.testEntrySet();
//		mt.testModify();
//		mt.testEntrySet();
		mt.testContainsKeyOrValue();
	}

}
