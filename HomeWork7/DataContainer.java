package HomeWork7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DataContainer<T> {

    private T[] data;
    private int size;

    public DataContainer(T[] initArr) {
        this.data = initArr;
        this.size = initArr.length;
    }

    public T get(int index) {
        return this.data[index];
    }

    public int add(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == null) {
                this.data[i] = item;
                return i;
            }
        }

        T[] tmp = data;
        this.size += 1;

        data = (T[]) Array.newInstance(item.getClass(), size);
        for (int i = 0; i < tmp.length; i++) {
            this.data[i] = tmp[i];
        }
        this.data[size - 1] = item;

        return size - 1;

    }

    public boolean delete(int index) {
        if (index >= size)
            return false;
        else {
            T item = this.data[index];
            this.data[index] = null;
            T[] tmp = data;
            size -= 1;

            data = (T[]) Array.newInstance(item.getClass(), size);
            int count = 0;

            for (int i = 0; i < tmp.length; i++) {
                if (tmp[i] != null) {
                    data[count] = tmp[i];
                    count++;
                }
            }
            return true;
        }
    }

    public boolean delete(T item) {
        for (int i = 0; i < this.data.length; i++) {
            if (this.data[i] == item) {
                return this.delete(i);
            }
        }

        return false;
    }

    public T[] getItems() {
        return data;
    }

    public int getSize() {
        return size;
    }
}
