import java.util.ArrayList;

public class QueueImpl<E> implements Queue<E> {

    private ArrayList<E> items = new ArrayList<E>();
    private int max_len;
    private int len;

    public QueueImpl(int len){
        this.max_len = len;
        this.len = 0;
    }
    public void push(E e) throws FullQueueException {
        if(this.max_len > this.len){
            this.items.add(e);
            this.len += 1;
        }

        else{
            throw new FullQueueException();
        }
    }

    public E pop() throws EmptyQueueException {
        if (this.len == 0){
            throw new EmptyQueueException();
        }

        else {
            this.len -= 1;
            E e = items.get(this.len);
            //lshift() ?????
            return e;
        }
    }

    public int size() {
        return this.len;
    }

}
