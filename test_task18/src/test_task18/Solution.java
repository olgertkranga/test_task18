package test_task18;

//Complete this code or write your own from scratch
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Map<String, String> phoneBook = new HashMap<String, String>();

		Scanner in = new Scanner(System.in);

		int numbers = in.nextInt();

		in.nextLine();

		for (int i = 0; i < numbers; i++) {

			String name = in.nextLine();

			String phone = in.nextLine();

			phoneBook.put(name, phone);
		}

		while (in.hasNext()) {

			String inputN = in.nextLine();

			if (phoneBook.containsKey(inputN)) {

				System.out.println(inputN + "=" + phoneBook.get(inputN));
			} else {

				System.out.println("Not found");
			}

		}

	}

}