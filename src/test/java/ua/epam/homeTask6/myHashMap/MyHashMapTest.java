package ua.epam.homeTask6.myHashMap;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyHashMapTest {

    @Test
    public void testPutGet() {
        MyMap map = new MyHashMap();
        map.put(2, 4);
        map.put(18, 11);
        map.put(27, 99);

        assertEquals(map.get(2), 4);
        assertEquals(map.get(18), 11);
        assertEquals(map.get(27), 99);

        //missing key
        assertEquals(map.get(10), -1);
    }

    @Test
    public void testContainsKeyAndValue() {
        MyMap map = new MyHashMap();
        map.put(10, 21);
        map.put(18, 11);
        map.put(27, 99);

        assertTrue(map.containsKey(10));
        assertTrue(map.containsKey(18));

        assertTrue(map.containsValue(11));
        assertTrue(map.containsValue(99));

        //missing key
        assertFalse(map.containsKey(16));
        //missing value
        assertFalse(map.containsValue(45));
    }

    @Test
    public void testRemoveClearAndSize() {
        MyMap map = new MyHashMap();
        map.put(10, 21);
        map.put(18, 11);
        map.put(27, 99);

        assertEquals(map.size(), 3);

        map.remove(18);
        //new size
        assertEquals(map.size(), 2);
        //deleted key
        assertFalse(map.containsKey(18));
        //deleted value
        assertFalse(map.containsValue(11));
    }

    @Test
    public void testClearIsEmpty() {
        MyMap map = new MyHashMap();
        map.put(10, 21);
        map.put(18, 11);
        map.put(27, 99);

        map.clear();

        assertEquals(map.size(), 0);
        assertTrue(map.isEmpty());
    }
}
