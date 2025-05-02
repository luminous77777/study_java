package service;

import static utils.BankUtils.*;
import java.util.ArrayList;
import java.util.List;

import domain.Customer;

public class CustomerService {
	private List<Customer> customers = new ArrayList<Customer>();
	private Customer loginCustomer; // null 비로그인

	private static CustomerService customerService = new CustomerService();// 싱글턴 패턴
	private CustomerService() {
	}
	public static CustomerService getInstance() {
		return customerService;
	}
	private AccountService accountService = AccountService.getInstance();
	

	{
		customers.add(new Customer(1, "A", "010-1234-5678", "user@gmail.com", "saa", "1234"));

	}

	public Customer getLoginCustomer() {
		return loginCustomer;
	}

	public void register() {
		System.out.println("회원가입");

		String name = nextLine("이름 >");
		String tel = nextLine("전화번호 > (ex : 010-1111-2222)");
		String email = nextLine("이메일 >");
		String id = nextLine("아이디 >");
		String pw = nextLine("비밀번호 >");
		int no = customers.isEmpty() ? 1 : customers.get(customers.size()-1).getNo()+1;
		
		
		Customer customer = new Customer( no, name, tel, email, id, pw);
		customers.add(customer);
		
		System.out.println("회원가입완료");
	}

	public void mypage() {
		System.out.println("내정보보기");
		System.out.println(loginCustomer);
		System.out.println("계좌 정보 조회");
		AccountService.getInstance().findAccountsBy(loginCustomer);
		accountService.print(accountService.findAccountsBy(loginCustomer));
	}

	public void modify() {
		System.out.println("정보수정");
		String id = nextLine("회원 정보 아이디 > ");
		Customer c = findById(id);
		if(c == null) {
			System.out.println("회원정보 없음");
			return ;
		}
		
		String name = nextLine("이름 >");
		String tel = nextLine("전화번호 > (ex : 010-1111-2222)");
		String email = nextLine("이메일 >");
		String pw = nextLine("비밀번호 >");
		System.out.println("정보수정");
		
		c.setName(name);
		c.setTel(tel);
		c.setEmail(email);
		c.setPw(pw);
	}

	public void remove() {
		System.out.println("삭제");
		//만약 계좌가 존재하면?
		if(!accountService.findAccountsBy(loginCustomer).isEmpty()) {
			System.out.println("계좌가 존재합니다. 해지 후 탈퇴 진행하세요");
			return;
		}
		
		if(!nextConfirm("탈퇴하시겠습니까?")) {
			return;
		}
		customers.remove(loginCustomer);
		logout();
		
		
	}
	
	public Customer findBy(int no) {
		for(Customer c: customers) {
			if(c.getNo() == no) {
				return c;
			}
		}
		return null;
	}
	public Customer findById(String id) {
		for(Customer c: customers) {
			if(c.getId().equals(id)) {
				return c;
			}
		}
		return null;
	}
	

	
	public void login() {
		String id = nextLine("아이디 >");
		String pw = nextLine("비밀번호");

		boolean flag = false;
		for (Customer c : customers) {
			if (c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				break;
			}
		}
		if (!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
	}

	public void logout() {
		loginCustomer = null;
		System.out.println("정상적으로 로그아웃 되었습니다");
	}

	public void loginInfo() {
		Customer c = loginCustomer;
		System.out.println(c.getName() + "님이 로그인 중입니다");
	}

	public Customer editInfo() {// 정보수정
		Customer customer = getLoginCustomer();

		int no = nextInt("수정할 데이터선택 해주세요 1. 이름 2.전화번호 3.이메일 4.아이디 5.비밀번호");
//		switch (no) {
//		case value: {
//			
//			yield type;
//		}
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + key);
//		}
		String name = nextLine("이름을 입력해주세요>");
		checkName(name);

		String tel = nextLine("전화 번호를 입력해주세요");
		for (Customer c : customers) {
			if (c.getTel().equals(tel)) {
				throw new IllegalArgumentException("이미 있는 전화번호입니다.");
			}
		}
		checkTel(tel);

		String email = nextLine("이메일을 입력해주세요");
		for (Customer c : customers) {
			if (c.getEmail().equals(email)) {
				throw new IllegalArgumentException("이미 있는 메일입니다.");
			}
		}
		checkEmail(email);

		String id = nextLine("아이디를 입력해주세요");
		for (Customer c : customers) {
			if (c.getId().equals(id)) {
				throw new IllegalArgumentException("이미 있는 아이디입니다.");
			}
		}

		String pw = nextLine("계정 비밀번호를 입력해주세요");
		checlPw(pw);

		return customer;
	}

	

	private void checkNo(int no) {
		if (no <= 0) {
			throw new IllegalArgumentException("옳바른 값을 입력해주세요");
		}
	}

	private void checkName(String name) {
		if (!name.matches("[가-힣]{2,4}")) {
			throw new IllegalArgumentException("이름은 2~4글자 한글만 입력해야 합니다.");
		}
	}

	private void checkTel(String tel) {
		String s = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		if (!tel.matches(s)) {
			throw new IllegalArgumentException("옳바른 전화번호를 입력해주세요");
		}
	}

	private void checkEmail(String email) {
		String s = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		if (!email.matches(s)) {
			throw new IllegalArgumentException("옳바른 형식의 이메일을 입력해주세요");
		}
	}

	private void checlPw(String pw) {
		String s = "(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])[A-Za-z\\d!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]{7,}";
		if (!pw.matches(s)) {
			throw new IllegalArgumentException("비밀번호는 특수문자를 포함한 7자리여야합니다");
		}

	}
}
