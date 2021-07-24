package interface_exam2;

public interface Bank {
	//상수 : 인터페이스에서 값을 정해줄테니 함부로 바꾸지 말고 제공해주는 값만 참조해라 (절대적)
    public int MAX_INTEGER = 10000000;
     
    //추상메소드(인출하는 메소드)
    void withDraw(int price);
     
    //추상메소드(입금하는 메소드)
    void deposit(int price);
     
    //JAVA8에서 가능한 defualt 메소드(고객의 휴면계좌 찾아주는 메소드 : 필수구현은 선택사항)
    //디폴트메소드 : 인터페이스에서 기본적으로 제공해주지만, 맘에 안들면 각자 구현해서 써라. (선택적) 
    default String findDormancyAccount(String custId){
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("**금융결제원에서 제공하는 로직**");
        return "00은행 000-000-0000-00";
    }
}
