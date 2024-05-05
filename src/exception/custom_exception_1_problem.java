//package exception;
//
//public class custom_exception_1 {
//
//    public static void main(String[] args) throws InsufficientFundException {
//
//        BankAccount jp= new BankAccount(100);
//        jp.withdraw(120);
//        jp.printbalance();
//
//
//    }
//}

//class InsufficientFundException extends Exception{
//    public InsufficientFundException() {
//
//        super();
//    }
//        public InsufficientFundException(String message){
//            super(message);
//        }
//    }
//
//    class AccountErrorException extends Exception{
//
//    AccountErrorException(String e){
//        super(e);
//
//    }



//    class BankAccount {
//        private double balance;
//
//        public BankAccount(double balance) {
//            this.balance = balance;
//        }

//        public void withdraw(double amount) throws InsufficientFundException {
//            if (balance < amount) {
//                throw new InsufficientFundException(" YOU DON'T HAVE BALENCE");
//            }
//            balance -= amount;
//        }

//public void printbalance() throws AccountErrorException {
//    // throw new AccountErrorException("problem with your account");
//    System.out.println(this.balance);
//}


