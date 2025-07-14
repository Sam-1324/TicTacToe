package com.example.LLDFacadePattern;


/*The facade layer is created in order to protect Client to interact from complex logics , on behalf of Client the facade layer will connect with complex logics but at 
 * the same time Client has got the flexibility to directly interact with complex methods if it wants.
 * 
 * In the above example we can see 4 different class objects are created in order to perform one task that is to 'Create Order'.
 */

public class OrderFacade
{
    ProductDao productDao;
    Invoice invoice;
    Payment payment;
    SendNotification sendNotification;
    public OrderFacade()
    {
       productDao = new ProductDao();
       invoice = new Invoice();
       payment = new Payment();
       sendNotification = new SendNotification();
    }
    
    //Creating a order
    public void createOrder()
    {
      Product product = productDao.getProduct(121);
      payment.makePayment();
      invoice.generateInvoice();
      sendNotification.sendNotification();

      //Order creation is successfull.
    }
    
}


