import java.util.LinkedList;
import java.util.Queue;

/*
Опишем ситуацию: в банке есть несколько окон обслуживания клиентов, а также очередь,
в которую постепенно поступают клиенты. Окно обслуживания может обслуживать
только одного клиента в данный момент времени. Каждый клиент имеет свое время обслуживания,
которое необходимо для его обработки.
В этой задаче нужно смоделировать процесс обслуживания клиентов в очереди банка с
использованием класса Queue в Java.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ivan Ivanov", 30);
        Client client2 = new Client("Nikita Ivanov", 60);
        Client client3 = new Client("Lena Ivanova", 50);

        /*
        System.out.println("Первый клиент: " + client.FIO + " " + "Время обслуживания: " + myBankQueu.timeWork + "\n" +
                "Второй клиент: " + myBankQueu2.FIO + " " + "Время обслуживания: " + myBankQueu2.timeWork + "\n" +
                "Третий клиент: " + myBankQueu3.FIO + " " + "Время обслуживания: " + myBankQueu3.timeWork);
*/
        Queue<Client> myQueue = new LinkedList<>();
        myQueue.add(client);
        myQueue.add(client2);
        myQueue.add(client3);

        long fullTime = 0;

        while (!myQueue.isEmpty()) {
            Client myClient = myQueue.poll();
            System.out.println("Клиент: " + myClient.getFIO() + "\n" + "Время обслуживания: " + myClient.getTimeWork() + "\n");
            fullTime += myClient.getTimeWork();
            System.out.println("Общее время обслуживания: " + fullTime);
        }


    }

}