package di.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//��������� List�� Map�� ��� DI ���� ���
public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String, String> map;
	
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	//ArrayList ������ ����ϱ�
	public void getList() {
		System.out.println("============ ArrayList ============");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void getMap() {
		Set<String> keylist = map.keySet();
		
		System.out.println("============ Map ============");
		for(String key : keylist) {
			System.out.println("key : " + key + ", value : " + map.get(key));
		}
	}
}
