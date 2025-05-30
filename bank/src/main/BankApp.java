package main;

import service.BankService;
import utils.BankUtils;

public class BankApp {
	public static void main(String[] args) {
		while (true) { 
			System.out.println(" __       __          _______   ______  __    __ __    __ \r\n"
					+ "|  \\     /  \\        |       \\ /      \\|  \\  |  \\  \\  /  \\\r\n"
					+ "| ▓▓\\   /  ▓▓__    __| ▓▓▓▓▓▓▓\\  ▓▓▓▓▓▓\\ ▓▓\\ | ▓▓ ▓▓ /  ▓▓\r\n"
					+ "| ▓▓▓\\ /  ▓▓▓  \\  |  \\ ▓▓__/ ▓▓ ▓▓__| ▓▓ ▓▓▓\\| ▓▓ ▓▓/  ▓▓ \r\n"
					+ "| ▓▓▓▓\\  ▓▓▓▓ ▓▓  | ▓▓ ▓▓    ▓▓ ▓▓    ▓▓ ▓▓▓▓\\ ▓▓ ▓▓  ▓▓  \r\n"
					+ "| ▓▓\\▓▓ ▓▓ ▓▓ ▓▓  | ▓▓ ▓▓▓▓▓▓▓\\ ▓▓▓▓▓▓▓▓ ▓▓\\▓▓ ▓▓ ▓▓▓▓▓\\  \r\n"
					+ "| ▓▓ \\▓▓▓| ▓▓ ▓▓__/ ▓▓ ▓▓__/ ▓▓ ▓▓  | ▓▓ ▓▓ \\▓▓▓▓ ▓▓ \\▓▓\\ \r\n"
					+ "| ▓▓  \\▓ | ▓▓\\▓▓    ▓▓ ▓▓    ▓▓ ▓▓  | ▓▓ ▓▓  \\▓▓▓ ▓▓  \\▓▓\\\r\n"
					+ " \\▓▓      \\▓▓_\\▓▓▓▓▓▓▓\\▓▓▓▓▓▓▓ \\▓▓   \\▓▓\\▓▓   \\▓▓\\▓▓   \\▓▓\r\n"
					+ "            |  \\__| ▓▓                                    \r\n"
					+ "             \\▓▓    ▓▓                                    \r\n"
					+ "              \\▓▓▓▓▓▓                                     \r\n"
					+ "");
			System.out.println("=============================================================================");
			BankService.getInstance().menu();
		}
	}
}
