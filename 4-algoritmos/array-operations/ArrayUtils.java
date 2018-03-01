public class ArrayUtils {
    private ArrayUtils () {
        throw new RuntimeException("ArrayUtils must not be instantiated.");
    }

    public static int[] copyOf(int[] data) {
        var newData = new int[data.length];
        for (var i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        return newData;
    }

    public static void sort(int[] data) {
        for (var i = 0; i < data.length; i++) {
            for (var j = i; j < data.length; j++) {
                if (data[i] < data[j]) {
                    var swap = data[i];
                    data[i] = data[j];
                    data[j] = swap;
                }
            }
        }
    }

    public static int[] sorted(int[] data) {
        var newData = copyOf(data);
        sort(newData);
        return newData;
    }

    public static int linearSearch(int[] data, int value) {
        for (var i = 0; i < data.length; i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return data.length;
    }

    public static int binarySearch(int[] data, int value) {
        return binarySearch(data, value, 0, data.length);
    }

    public static int binarySearch(int[] data, int value, int begin, int end) {
        var half = (end + begin) / 2;
        if (end - begin <= 1) {
            return -half;
        }
        if (data[half] == value) {
            return half;
        }
        if (value < data[half]) {
            return binarySearch(data, value, begin, half);
        }
        return binarySearch(data, value, half, end);
    }
}
