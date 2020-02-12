package myutil;

public class MyMap<K, V> implements BaseMap<K, V> {
	private BaseList<K> keys = new MyList<K>();
	private BaseList<V> values = new MyList<V>();
	public MyMap() {
	}

	@Override
	public boolean isEmpty() {
		return this.getKeys().isEmpty();
	}

	@Override
	public int size() {
		return this.getKeys().size();
	}

	@Override
	public void print() {
		
	}

	@Override
	public void put(K key, V value) {
		this.getKeys().add(key);
		this.getValues().add(value);
	}

	@Override
	public V get(K key) {
		Integer index = this.getKeys().getIndexOf(key);
		if (index == null) {
			return null;
		}
		return this.getValues().getElementAt(index);
		
	}
	
	private BaseList<K> getKeys() {
		return this.keys;
	}
	
	private BaseList<V> getValues() {
		return this.values;
	}
	

}
