package problem_6weeks;

abstract class PairMap {
	protected String keyArray []; 
	protected String valueArray []; 
	abstract String get(String key); 
	abstract void put(String key, String value); 
	abstract String delete(String key); 
	abstract int length(); 
}

class Dictionary extends PairMap {
	private int num;
	private int cnt = 0;
	public Dictionary(int num) {
		this.num = num;
		keyArray = new String[num];
		valueArray = new String[num];
	}
	@Override
	public String get(String key) {
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
	@Override
	public void put(String key, String value) {
		if(cnt==num) {
			System.out.println("�迭�� �� á���ϴ�.");
			return;
		} 
		
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value; 
				return;
			}
		} 
		
		keyArray[cnt] = key;
		valueArray[cnt] = value;
		cnt++;
	}
	@Override
	public String delete(String key) {
		for(int i=0; i<cnt; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = "null";
				return "null";
			}
		}
		return "�ش� �̸��� �������� �ʽ��ϴ�.";
	}
	@Override
	public int length() {
		return cnt;
	}
}

public class problem5_10 {
	public static void main(String[] arsg) {
		Dictionary dic = new Dictionary(10);
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̼�");
		dic.put("���繮", "C++"); 
		System.out.println("���繮�� ���� " + dic.get("���繮")); 
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); 
		dic.delete("Ȳ����"); 
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����")); 
	}
}