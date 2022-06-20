public class Box {
    private Object object;

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }

/*
    public class Box<T> {
        private T item;
        public T getItem() {
            return item;
        }
        public void setItem(T item) {
            this.item = item;
        }
    }

    Box<Integer> integerBox = new Box<Integer>();
*/
}