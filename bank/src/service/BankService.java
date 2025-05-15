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
	private AccountService accountService = AccountService.getInstance();
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
				int no = BankUtils.nextInt("1. 내 정보보기 2. 정보 수정 3. 회원탈퇴 4. 개설. 5. 입금 6.출금 7. 이체 8. 해지 9.로그아웃 ");
				switch (no) {
					case 1: 
						customerService.mypage();
						break;
					case 2:
						customerService.modify();
						break;
					case 3:
						customerService.remove();
						break;
					case 4:
						accountService.open();
						break;
					case 5:
						accountService.deposit();
						break;
					case 6:
						accountService.withdraw();
						break;
					case 7:
						accountService.transfer();
						break;
					case 8:
						accountService.close();
						break;
					case 9:
						customerService.logout();
						break;		
					}
				}
		} catch (NumberFormatException e) {
			System.out.println("정확힌 숫자를 입력해주세요");
		} catch	(IllegalArgumentException e){
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
			
		}
		
}
