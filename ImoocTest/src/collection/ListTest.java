package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



public class ListTest {
	public List coursesToSelect;
	public ListTest(){
		this.coursesToSelect = new ArrayList();
	}
	public void testAdd(){
		//����һ���γ̶��󣬲�ͨ������add��������ӵ���ѡ�γ�List��
		Course cr1 = new Course("1","�����Y��");
		coursesToSelect.add(cr1);
		Course temp=(Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp.id+":"+temp.name);
		
		Course cr2=new Course("2","C����");
		coursesToSelect.add(0, cr2);
		Course temp2 = (Course) coursesToSelect.get(0);
		System.out.println("����˿γ̣�"+temp2.id+":"+temp2.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course) coursesToSelect.get(3);
		System.out.println("����˿γ̣�"+temp3.id+":"+temp3.name);
		
		Course[] course2 = {new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5 = (Course) coursesToSelect.get(3);
		System.out.println("����˿γ̣�"+temp5.id+":"+temp5.name);
	}
	/*
	public void testGet(){
		int size = coursesToSelect.size();
		for (int i=0;i<size;i++){
			Course cr = (Course)coursesToSelect.get(i);
			System.out.println("�γ�"+cr.id+cr.name);
		}
	}
	*/
	//����������List
	/*
	public void testIterator(){
		Iterator it = (Iterator) coursesToSelect.iterator();
		while(it.hasNext()){
			Course cr = (Course) it.next();
			System.out.println("�γ�"+cr.id+cr.name);
		}
	}
	*/
	public void testForEach(){
		for (Object obj:coursesToSelect){
			Course cr = (Course) obj;
			System.out.println("�γ�"+cr.id+cr.name);
		}
	}
	public static void main(String[] args){
		ListTest lt = new ListTest();
		lt.testAdd();
		//lt.testGet();
		//lt.testIterator();
		lt.testForEach();
	}
}
