package chap3.hideswitch.before;

public class Payroll {

    /**
     * 문제점이 많은 switch를 포함한 함수
     * 1. 함수가 길다. 새 직원 유형을 추가하면 더욱 더 길어진다.
     * 2. 한가지 작업만 수행하지 않는다.
     * 3. SRP 위반이다.
     * 4. OCP 위반이다.
     */
    public Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommisionedPay(e);
            case HOURLY:
                return calculateHourPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e);
        }
    }


}
