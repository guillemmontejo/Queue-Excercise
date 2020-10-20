public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new QueueImpl<Integer>(5);

        try {
            q.push(1);
            q.push(2);
            q.push(3);
            q.push(4);
            q.push(5);

            System.out.println(q.size());

            int un = q.pop();
            System.out.println("valor cua "+un);
        }
        catch (FullQueueException fullExp){
            System.out.println("EXCEPCIÓ!: ");
            fullExp.printStackTrace();
        }

        catch (EmptyQueueException empty){
            System.out.println("EXCEPCIÓ!: ");
            empty.printStackTrace();
        }



    }
}
