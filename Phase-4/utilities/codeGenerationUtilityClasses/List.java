import java.util.ArrayList;

public class List {
    public ArrayList<Object> elements;

    public List(ArrayList<Object> newElements) {
        this.elements = new ArrayList<>();
        for(Object newElement : newElements)
            this.elements.add(getNewObject(newElement));
    }

    public List(List that) {
        this(that.elements);
    }

    private Object getNewObject(Object o) {
        if(o instanceof List)
            return new List((List) o);
        else
            return o;
    }

    public Object getElement(int index) {
        return this.elements.get(index);
    }

    public void setElement(int index, Object o) {
        this.elements.set(index, getNewObject(o));
    }

}
