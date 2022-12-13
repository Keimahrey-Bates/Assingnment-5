public class HolidayBonus {
	public static double[] calculateHolidayBonus(double [][] data)
	{
		double[][] bonusArr = new double[data.length][];
		double highest = 5000.0, lowest = 1000.0, otherRetail = 2000.0;
		for (int i = 0; i < data.length; i++)
		{
			bonusArr[i] = new double[data[i].length];
			}
		for (int i = 0, j = 0; i < bonusArr.length; i++, j++)
		{
			int highIndex =TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);
			int lowIndex =TwoDimRaggedArrayUtility.getLowestInColumnIndex(data, i);
			if (i < bonusArr[j].length)
			{
				bonusArr[highIndex][i] = highest;
				bonusArr[lowIndex][i] = lowest;
				if (j == highIndex || j == lowIndex)continue;
				else
				{
					bonusArr[j][i] = otherRetail;
					}
			}
		}
		double[] bonusPerStore = new double[data.length];
		for (int i = 0; i < bonusArr.length; i++)
		{
			for (int j = 0; j < bonusArr[i].length; j++)
			{
				bonusPerStore[i] += bonusArr[i][j];
			}
		}
		return bonusPerStore;
	}
		
	  public static double calculateTotalHolidayBonus(double[][] data) {
		    
		    double[] bonusArray = calculateHolidayBonus(data);
		    double total = 0;
		    
		    for (double bonus:bonusArray) {
		      total+=bonus;
		    }
		    return total;
		  }
		}


