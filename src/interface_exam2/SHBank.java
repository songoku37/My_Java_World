package interface_exam2;

public class SHBank implements Bank{
	@Override
    public void withDraw(int price) {
        System.out.println("SH은행만의 인출 로직...");
        if(price < Bank.MAX_INTEGER){
            System.out.println(price+" 원을 인출한다.");  
        }else{
            System.out.println(price+" 원을 인출실패.");
        }
    }
 
    @Override
    public void deposit(int price) {
        System.out.println("SH은행만의 입금 로직..."+price+" 원을 입금한다.");
        System.out.println("SH은행은 별도의 후행처리 작업을 따로 한다.");
     
    }
     
    //JAVA8에서 가능한 defualt 메소드(고객의 휴면계좌 찾아주는 메소드)
    // 디폴트메소드 : 인터페이스에서 기본적으로 제공해주지만, 맘에 안들면 각자 구현해서 써라. (선택적)
    @Override
    public String findDormancyAccount(String custId){
        System.out.println("**금융개정법안 00이후 고객의 휴면계좌 찾아주기 운동**");
        System.out.println("*SH은행만의 로직 적용*");
        return "00은행 000-000-0000-00";
    }
}
