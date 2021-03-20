import javax.swing.JOptionPane;

class Auto
{
	private String mark;
	private int year;
	private static int amountAuto;
	
	Auto(int year, String mark)
	{
		this.mark = mark;
		this.year = year;
		Auto.amountAuto++;
	}
	
	public String getStringInfo()
	{
		String result = "Кол-во машин: " + Auto.amountAuto + "\nМарка авто: "
						+ this.mark + "\nГод выпуска: " + this.year;
		
		return result;
	}
}

public class Main
{
	public static void main(String[] args) 
	{
		String marks[] = {"Peugeot 406", "Mitsubishi Lancer X", "Lada 2107", "Toyota Supra", "Kia Rio"};
		int years[] = {1991, 2011, 2003, 1998, 2012};
		
		String info = "";
		
		for(int i = 0; i < marks.length; i++)
		{
			info += new Auto(years[i], marks[i]).getStringInfo() + "\n\n";
		}
		
		for (String i : marks)
		{
			System.out.println(i + "\n");
		}
		
		JOptionPane.showMessageDialog(null, info);
		
	}
}