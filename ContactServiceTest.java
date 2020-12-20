public class ContactServiceTest {

   public static void main(String[] args) throws InvalidInputException {
       Contact contact1 =new Contact("9898","ABC","ZZZ1","1234567891","Hyd");
      
       ContactService contactService = new ContactService();
      
       System.out.println(contactService.addContact(contact1));
       System.out.println(contactService.updateContact("9898","Test","Test1","1234567891","Hyd"));
       System.out.println(contactService.deleteContact("9898"));
      
      

   }

}