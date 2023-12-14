package bubbleSortObjects;

import java.util.ArrayList;

public class BubbleSortObjects {

	public static void main(String[] args) {
		User user1 = new User("kwele", 85);
		User user2 = new User("john", 24);
		User user3 = new User("max", 2);

		ArrayList<User> clients = new ArrayList<>();
		clients.add(user1);
		clients.add(user2);
		clients.add(user3);

		for (int i = 0; i < bubleSort(clients).size(); i++) {
			System.out.println(bubleSort(clients).get(i).getAge());
		}

	}

	public static ArrayList<User> bubleSort(ArrayList<User> clients) {

		boolean swapped;
		for (int i = 0; i < clients.size() - 1; i++) {
			swapped = false;
			for (int j = 0; j < clients.size() - i - 1; j++) {

				if (clients.get(j).getAge() > clients.get(j + 1).getAge()) {
					User temp = clients.get(j);
					clients.set(j, clients.get(j + 1));
					clients.set(j + 1, temp);

					swapped = true;
				}

			}
			if (swapped == true) {
				break;
			}

		}

		return clients;

	}

}
