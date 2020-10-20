public interface Queue<E> {
    //E tipus genèric parametritzable
    /**
     * Mètode que permet afegir/encuar un nou element a la cua
     * @param e l'element a encuar
     * @throws FullQueueException llença excepció quan
     * la cua estigui plena
     */
    public void push(E e) throws FullQueueException;

    /**
     *
     * @return
     * @throws EmptyQueueException
     */

    public E pop() throws EmptyQueueException;
    public int size();
}
