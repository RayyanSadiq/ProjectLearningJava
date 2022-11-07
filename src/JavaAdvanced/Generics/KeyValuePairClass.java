package JavaAdvanced.Generics;

public class KeyValuePairClass <K, V> { // multiple parameters for generics in classes

    private K key;
    private V value;

    public KeyValuePairClass(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
