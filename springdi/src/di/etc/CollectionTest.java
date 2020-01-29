package di.etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

//멤버변수가 List나 Map인 경우 DI 적용 방법
public class CollectionTest {
	private ArrayList<String> list;
	private HashMap<String, String> map;
	
	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	//ArrayList 데이터 출력하기
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
