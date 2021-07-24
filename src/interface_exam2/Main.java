package interface_exam2;

public class Main {

	public static void main(String[] args)
	{
			Bank bank = new KBBank();
	        bank.withDraw(100);
	        bank.deposit(100);
	        bank.findDormancyAccount("763231");
	         
	        System.out.println("\n*************인스턴스 교체!!***************\n");
	         
	        bank = new SHBank();
	        bank.withDraw(100);
	        bank.deposit(100);
	        bank.findDormancyAccount("4311");
	        
	        /*
	         * public class KakaoBank{

				    public void kakaoWithDraw(int price) {
				        System.out.print("Kakao은행만의 인출 로직...");
				        System.out.println(price+" 원을 인출한다.");  
				    }
				 
				    public void kakaoDeposit(int price) {
				        System.out.println("Kakao은행만의 입금 로직..."+price+" 원을 입금한다.");
				    }
				     
				    public void kakaoFindDormancyAccount(){
				        System.out.println("kakao은행만의 휴면계좌 찾아주기 로직");
				    }
	 	       }
	         */
	         
	        // 마지막으로 아래 신규 인터넷 은행사 카카오뱅크 코드를 보자. 위 코드에서 볼 수 있듯이 
	        // 카카오뱅크는 인터페이스를 implements를 하지 않은 채 자신만의 메소드를 구현했다. 
	        // 어떤 문제점이 있을까? 당연...금융결제원에서 제공해주는 그 어떠한 서비스도 사용할 수 없으며
	        //  호환성이 없으며 연동이 불가할 것이다. 

		

	}

}
