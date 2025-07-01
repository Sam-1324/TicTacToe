package com.example.LLDDesignAtm;

import com.example.LLDDesignAtm.ATMStates.ATMState;

/*Always use 'State Design Principle' amd 'Chain of Responsibility' principle to solve LLD of ATM Machine */
public class ATMroom 
{
    Atm atm;
    User user;
    public static void main(String [] args)
    {
             ATMroom atmRoom = new ATMroom();
             //Initialzing the ATM room space......
             atmRoom.initialize();

             atmRoom.atm.printCurrentAtmStatus();

             ATMState state = atmRoom.atm.getAtmState();
             System.out.println("Requesting you to please go ahead and insert the card");
             state.insertCard(atmRoom.atm,atmRoom.user.card);

             state = atmRoom.atm.getAtmState();
             state.authenticatePin(atmRoom.atm,atmRoom.user.card,9999);

             //Selecting the CASH_WITHDRAWAL Operation
             state = atmRoom.atm.getAtmState();
             state.selectOperation(atmRoom.atm,atmRoom.user.card,TransactionType.CASH_WITHDRAWAL);
            
             //The amount which has to be withdrawn from the account
             state = atmRoom.atm.getAtmState();
             state.cashWithdrawalOperation(atmRoom.atm,atmRoom.user.card,2700);

             //Selecting the CHECK_BALANCE Operation
             state = atmRoom.atm.getAtmState();
             state.checkBalanceOperation(atmRoom.atm,atmRoom.user.card);

        
    }
    private void initialize()
    {
      //create ATM
      atm = Atm.getATMObject();
      atm.setAtmAccountBalance(3500,1,2,5);
      this.user = creatUser();
    }
    private User creatUser()
    {
        User user = new User();
        user.setCard(createCard());
        return user;
    }
    private Card createCard()
    {
      Card card = new Card();
      card.setBankAccount(createBankAccount());
      return card;
    }
    private UserAccount createBankAccount()
    {
      UserAccount bankAccount = new UserAccount();
      bankAccount.balance = 3000;
      return bankAccount;   
    }

}