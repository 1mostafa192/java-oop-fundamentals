public class AccountBanking
{
    private int id;
    private String name;
     private  float balance;

     public void setData(int id, String name,float balance){
         this.id=id;
         this.name=name;
         this.balance=balance;
     }
      public void deposite(float num){
         if(num>0) {
             System.out.print("this the num orgaing is = " + balance + "\n");
             this.balance += num;
             System.out.println("to add the balcne is = " + num + " to become balnce = " + balance + "\n");
         }
     }
    public void  withdraw(float num){
         if(num<=balance&&num>0){
             System.out.println("this the balcna orgain is = "+balance+"\n");
            this.balance-=num;
             System.out.println("to withdarw form balance is num =  "+num+" to become balcnce = "+ balance+'\n');
         }
         else{
             System.out.println("the balance not to enough  because to num is bigger balance ");
         }
    }
    public void displayAccountInfo(){
         System.out.println("this the name is "+ name);
        System.out.println("this the id is "+ id);
        System.out.println("this the balance is "+ balance);
    }
}
