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
			System.out.println("������ѧ��ID");
			String ID = console.next();
			//�ж�ID�Ƿ�ռ��
			Student st = students.get(ID);
			if(st == null){
				System.out.println("������ѧ������");
				String name = console.next();
				Student newStudent = new Student(ID,name);
				//���ID-studentӳ��
				students.put(ID, newStudent);
				System.out.println(students.get(ID).name);
				i++;
			}else{
				System.out.println("��ѧ��ID�ѱ�ռ��");
				continue;
			}
		}
	}
	
	public void testKeySet(){
		//ͨ��keySet��������Map�����м���Set����
		Set<String> keySet = students.keySet();
		//students����
		System.out.println("�ܹ���"+students.size()+"��ѧ��");
		//����keySet��ȡ��ÿ����������get������ö�Ӧvalue
		for(String stuId : keySet){
			Student st = students.get(stuId);
			if(st!=null){
				System.out.println("ѧ��"+st.name);
			}
		}
	}
	
	public void testRemove(){
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("������Ҫɾ��ѧ��ID");
			String ID = console.next();
			Student st = students.get(ID);
			if (st == null){
				System.out.println("ID������");
				continue;
			}
			students.remove(ID);
			System.out.println("�ɹ�ɾ��ѧ��"+st.name);
			break;
		}
	}
	
	public void testEntrySet(){
		//ͨ��entrySet����������Map�е����м�ֵ��
		Set<Entry<String,Student>> entrySet = students.entrySet();
		for(Entry<String,Student> entry:entrySet){
			System.out.println("ȡ�ü�"+entry.getKey());
			System.out.println("��ӦֵΪ"+entry.getValue().name);
		}
	}
	
	public void testModify(){
		System.out.println("������Ҫ�޸�ѧ��ID");
		Scanner console = new Scanner(System.in);
		while(true){
			String stuID = console.next();
			Student student = students.get(stuID);
			if (student ==null){
				System.out.println("��ID�����ڣ�����������");
				continue;
			}
			System.out.println("��ǰѧ��ID��Ӧѧ��Ϊ"+student.name);
			System.out.println("�������µ�ѧ������");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID,newStudent);
			System.out.println("�޸ĳɹ�");
			break;
		}
	}
	
	public void testContainsKeyOrValue(){
		//��Map�У���containsKey���������ж��Ƿ����ĳ��Keyֵ
		//��containsValue���������ж��Ƿ����ĳ��Valueֵ
		System.out.println("������Ҫ��ѯ��ѧ��ID");
		Scanner console = new Scanner(System.in);
		String id = console.next();
		
		System.out.println("�Ƿ����"+students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("��Ӧѧ������"+students.get(id).name);
		
		System.out.println("������Ҫ��ѯ��ѧ������");
		String name = console.next();
		
		if(students.containsValue(new Student(null,name)))
			System.out.println("��ӳ�����ȷʵ����ѧ��");
		else
			System.out.println("��ӳ����в����ڸ�ѧ��");
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
