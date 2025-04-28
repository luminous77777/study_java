package service;

import domain.Customer;
import utils.BankUtils;

public class BankService { //UI담당

	
	private static BankService bankService = new BankService();
	
	private BankService() {}
	
	public static BankService getInstance() {
		return bankService;
	}
	
	private CustomerService customerService = CustomerService.getInstance();
	
	public void menu() {
		try {
			if(customerService.getLoginCustomer() == null) {
				int no = BankUtils.nextInt("1. 회원가입 2.로그인");
				switch (no) {
				case 1: {
					customerService.register();
					break;
				}
				case 2: {
					customerService.login();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + no);
				}
				
			}
			else {
				System.out.println("로그인 중입니다.");
				int no = BankUtils.nextInt("1. 로그아웃 2.유저 정보");
				switch (no) {
					case 1: 
						customerService.logout();
						break;
					case 2:
						customerService.loginInfo();
						break;
					case 3:
						System.out.println("");
						break;
					}
				}
		} catch (NumberFormatException e) {
			System.out.println("정확힌 숫자를 입력해주세요");
		}catch	(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
			
		}
		
}
