package collections.genericsType;

public class Box<T> {
    private T t;

    public void setObject(T t) {
        this.t = t;
    }
    public T get(){
        return t;
    }

    //    private Object object;
//
//    public void setObject(Object object) {
//        this.object = object;
//    }
//    public Object get(){
//        return object;
//    }
}
