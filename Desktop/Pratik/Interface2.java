interface Vehicle
{
	void price();
}
interface Car extends Vehicle
{

}
class HondaCity implements Car
{
	public void price()
	{
		System.out.println("Price:Rs 10 Lakh");
	}
}
class Interface2
{
	public static void main(String []arg)
	{
		HondaCity obj=new HondaCity();
		obj.price();
	}
}