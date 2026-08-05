class DynamicArray {

    public static int[] obj = new int[]{};
    public int length = 0;
    public int capacity ;

    public DynamicArray(int capacity) {
        obj = new int[capacity];
        this.length = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return obj[i];
    }

    public void set(int i, int n) {
        obj[i] = n;
    }

    public void pushback(int n) {
        if(length == capacity)
        {
            resize();
        }
        System.out.println("length : "+ length);
        System.out.println("capacity : "+ capacity);
        obj[length++] = n;
        System.out.println("obj : "+ Arrays.toString(obj));
        
    }

    public int popback() {
        if(length > 0)
        {
            length--;
        }
        return obj[length];
    }

    private void resize() {
        capacity *=2;
        obj = Arrays.copyOf(obj, capacity);
    }

    public int getSize() {
       return length;
    }

    public int getCapacity() {
        return capacity;
    }

}

