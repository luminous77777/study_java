package service;

import java.util.ArrayList;
import java.util.List;

import domain.Customer;
import utils.BankUtils;

public class CustomerService {
	private List<Customer> customers = new ArrayList<Customer>();
	private Customer loginCustomer; //null 비로그인
	
	
	private static CustomerService customerService = new CustomerService();//싱글턴 패턴
	private CustomerService() {}
	public static CustomerService getInstance() {
		
		
		return customerService;
	}
	
	{
		customers.add(new Customer(1,"A","010-1234-5678","user@gmail.com","saa","1234"));

	}
	
	public Customer getLoginCustomer() {
		return loginCustomer;
	}

	public void register() {
		System.out.println("회원가입");
		
		int no = BankUtils.nextInt("고객 코드 > ");
		
		if(findBy(no) != null) {
			throw new IllegalArgumentException("이미 있는 고객 번호 입니다.");
		}
		checkNo(no);
		
		String name = BankUtils.nextLine("이름을 입력해주세요>");
		checkName(name);
		
		String tel = BankUtils.nextLine("전화 번호를 입력해주세요");
		for (Customer c : customers) {
		    if (c.getTel().equals(tel)) {
		        throw new IllegalArgumentException("이미 있는 전화번호입니다.");
		    }
		}
		checkTel(tel);
		
		String email = BankUtils.nextLine("이메일을 입력해주세요");
		for (Customer c : customers) {
		    if (c.getEmail().equals(email)) {
		        throw new IllegalArgumentException("이미 있는 메일입니다.");
		    }
		}
		checkEmail(email);
		
		
		String id = BankUtils.nextLine("아이디를 입력해주세요");
		for (Customer c : customers) {
		    if (c.getId().equals(id)) {
		        throw new IllegalArgumentException("이미 있는 아이디입니다.");
		    }
		}
		
		String pw = BankUtils.nextLine("계정 비밀번호를 입력해주세요");
		checlPw(pw);
		
		
		customers.add(new Customer(no,name,tel,email,id,pw));
	}
	
	public void login() {
		String id = BankUtils.nextLine("아이디 >");
		String pw = BankUtils.nextLine("비밀번호");
		
		boolean flag = false;
		for(Customer c :customers) {
			if(c.getId().equals(id) && c.getPw().equals(pw)) {
				flag = true;
				loginCustomer = c;
				break;
			}
		}
		if(!flag) {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다");
		}
	}
	
	public void logout() {
		loginCustomer = null;
		System.out.println("정상적으로 로그아웃 되었습니다");
	}
	
	public void loginInfo() {
		Customer c = loginCustomer;
		System.out.println(c.getName()+"님이 로그인 중입니다");
	}
	
	public Customer editInfo() {//정보수정
		Customer customer = getLoginCustomer();
		
		String name = BankUtils.nextLine("이름을 입력해주세요>");
		checkName(name);
		
		String tel = BankUtils.nextLine("전화 번호를 입력해주세요");
		for (Customer c : customers) {
		    if (c.getTel().equals(tel)) {
		        throw new IllegalArgumentException("이미 있는 전화번호입니다.");
		    }
		}
		checkTel(tel);
		
		String email = BankUtils.nextLine("이메일을 입력해주세요");
		for (Customer c : customers) {
		    if (c.getEmail().equals(email)) {
		        throw new IllegalArgumentException("이미 있는 메일입니다.");
		    }
		}
		checkEmail(email);
		
		
		String id = BankUtils.nextLine("아이디를 입력해주세요");
		for (Customer c : customers) {
		    if (c.getId().equals(id)) {
		        throw new IllegalArgumentException("이미 있는 아이디입니다.");
		    }
		}
		
		String pw = BankUtils.nextLine("계정 비밀번호를 입력해주세요");
		checlPw(pw);
		
		
		return customer;
	}
	
	private Customer findBy(int no) { //no의 숫자를 가진 고객 출력
		Customer customer = null;
		for(Customer c : customers) {
			if(c.getNo() == no) {
				
				customer =c;
				return customer;
			}
		}
		return customer;	
	}
	
	private void checkNo(int no) {
		if( no <= 0) {
			throw new IllegalArgumentException("옳바른 값을 입력해주세요");
		}
	}
	
	private void checkName(String name) {
		if(!name.matches("[가-힣]{2,4}")) {
			throw new IllegalArgumentException("이름은 2~4글자 한글만 입력해야 합니다.");
		}
	}
	
	private void checkTel(String tel) {
		String s= "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		if(!tel.matches(s)) {
			throw new IllegalArgumentException("옳바른 전화번호를 입력해주세요");
		}
	}
	
	private void checkEmail(String email) {
		String s = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		if(!email.matches(s)) {
			throw new IllegalArgumentException("옳바른 형식의 이메일을 입력해주세요");
		}
	}
	
	private void checlPw(String pw) {
		String s = "(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?])[A-Za-z\\d!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]{7,}";
		if(!pw.matches(s)) {
			throw new IllegalArgumentException("비밀번호는 특수문자를 포함한 7자리여야합니다");
		}
		
	}
}
