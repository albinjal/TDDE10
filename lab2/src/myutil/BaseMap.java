package myutil;

public interface BaseMap<K, V> extends BaseCollection {
	 public void put(K key, V value);
	    
	 public V get(K key);
}
