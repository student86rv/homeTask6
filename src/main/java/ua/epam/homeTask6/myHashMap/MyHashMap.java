package ua.epam.homeTask6.myHashMap;

public class MyHashMap implements MyMap {

    private class Entry {
        private int key;
        private int value;
        private Entry next;

        private Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int INITIAL_CAPACITY = 16;
    private final double LOAD_FACTOR = 0.75;

    private int size = 0;
    private Entry[] table = new Entry[INITIAL_CAPACITY];

    private int indexCalc(int key, Entry[] tableArr) {
        return Math.abs(key % tableArr.length);
    }

    private boolean loadCalc() {
        return size / table.length >= LOAD_FACTOR;
    }

    private void expandTable() {
        Entry[] newTable = new Entry[table.length * 2];
        for (Entry entry : table) {
            if (entry != null) {
                int newIndex = indexCalc(entry.key, newTable);
                newTable[newIndex] = entry;
            }
        }
        table = newTable;
    }

    @Override
    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean containsKey(int key) {
        Entry tmp = table[indexCalc(key, table)];
        while (tmp != null) {
            if (tmp.key == key) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(int value) {
        for (Entry entry : table) {
            Entry tmp = entry;
            while (tmp != null) {
                if (tmp.value == value) {
                    return true;
                }
                tmp = tmp.next;
            }
        }
        return false;
    }

    @Override
    public int get(int key) {
        Entry tmp = table[indexCalc(key, table)];
        while (tmp != null) {
            if (tmp.key == key) {
                return tmp.value;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void put(int key, int value) {
        Entry newEntry = new Entry(key, value);
        if (table[indexCalc(key, table)] == null) {
            table[indexCalc(key, table)] = newEntry;
        } else {
            if (loadCalc()) {
                expandTable();
            }
            Entry last = table[indexCalc(key, table)];
            table[indexCalc(key, table)] = newEntry;
            newEntry.next = last;
        }
        size++;
    }

    @Override
    public void remove(int key) {
        Entry tmp = table[indexCalc(key, table)];
        if (tmp.key == key) {
            table[indexCalc(key, table)] = tmp.next;
        } else {
            while (tmp.next != null) {
                if (tmp.next.key == key) {
                    tmp.next = tmp.next.next;
                    break;
                }
                tmp = tmp.next;
            }
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : table) {
            if (entry != null) {
                Entry tmp = entry;
                while (tmp != null) {
                    sb.append(tmp.key);
                    sb.append("=");
                    sb.append(tmp.value);
                    sb.append(", ");
                    tmp = tmp.next;
                }
            }
        }
        return sb.toString();
    }
}
