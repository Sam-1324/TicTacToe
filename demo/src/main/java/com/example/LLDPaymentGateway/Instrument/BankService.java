package com.example.LLDPaymentGateway.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.sound.midi.Instrument;
     
public class BankService extends InstrumentService
{

    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) 
    {
      BankInstrument bankInstrument = new BankInstrument();
      bankInstrument.instrumentID = new Random().nextInt(100-10) + 10;
      bankInstrument.bankAccountNo = instrumentDO.bankAccountNo;
      bankInstrument.ifscCode = instrumentDO.ifscCode;
      bankInstrument.instrumentType = InstrumentType.BANK;
      bankInstrument.userId = InstrumentDO.userId;

      List<InstrumentEntity> userInstrumentList = userVsInstruments.get(bankInstrument.userId);
      if(userInstrumentList == null)
      {
         userInstrumentList = new ArrayList<>();
         userVsInstruments.put(bankInstrument.userId , userInstrumentList);
      }
      userInstrumentList.add(bankInstrument);
      return mapBankInstrumentToInstrumentDO(bankInstrument);
    }

   

    @Override
    public List<InstrumentDO> getInstrumentByUserId(int userid) 
    {
      List<InstrumentEntity> userInstruments = userVsInstruments.get(userid);
      List<InstrumentDO> userInstrumentsFetched = new ArrayList<>();
      for(InstrumentEntity instrument: userInstruments)
       {
          if(instrument.getInstrumentType() == InstrumentType.BANK)
           {
             userInstrumentsFetched.add(mapBankInstrumentToInstrumentDO((BankInstrument) instrument));
           }
       }
       return userInstrumentsFetched;

    }

    private InstrumentDO mapBankInstrumentToInstrumentDO(BankInstrument bankInstrument)
    {
      InstrumentDO instrumentDO = new InstrumentDO();
      instrumentDO.instrumentType = bankInstrument.instrumentType;
      instrumentDO.bankAccountNo = bankInstrument.bankAccountNo;
      instrumentDO.ifscCode = bankInstrument.ifscCode;
      instrumentDO.userId = bankInstrument.userId;
      instrumentDO.instrumentID = bankInstrument.instrumentID;

      return instrumentDO;
    }
    
}