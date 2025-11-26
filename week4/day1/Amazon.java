package week4.day1;

public class Amazon extends CanaraBank {

	//implementing methods

	public void cashOnDelivery()
	{
		System.out.println("By cash");
	}
	public void upiPayments()
	{
		System.out.println("By upi");
	}
	public void cardPayments()
	{
		System.out.println("By card");
	}
	public void internetBanking()
	{
		System.out.println("By netbanking");
	}
	public static void main(String args[])
	{
		Amazon a=new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.internetBanking();
		a.recordPaymentDetails();
	}
}
