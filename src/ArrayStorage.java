/**
 * Array based storage for Resumes
 */
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size = 0;


    void clear() {
        for (int i = 0; i < storage.length; i++) {
                storage[i] = null;
                size--;
        }
    }

    void save(Resume r) {
        for (int i = 0; i < storage.length; i++) {
            size++;
            storage[size] = r;
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid) {
                return storage[i];
            }
        }
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i].uuid == uuid) {
                storage[i] = null;
            }
            if (storage[i + 1] != null) {
                storage[i] = storage[i + 1];
            }
        }
        size--;
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {

        for (int i = 0; i < size; i++) {
            if (storage[i] != null) {
                storage[i] = storage[i];
            }
        }
        return storage;
    }

    int size() {


        return size;
    }
}
