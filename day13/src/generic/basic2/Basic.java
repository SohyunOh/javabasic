package generic.basic2;

public class Basic<K , V> { // 매개값 2개 지정 

	//멀티제네릭
	private K key;
	private V value;
	
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public V get(K key) {
		return value;
	}

	@Override
	public String toString() {
		
		return "{" + key + "," + value + "}";
	}
	
	
	
	
	
	
	
}
