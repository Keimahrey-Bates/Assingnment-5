import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwoDimRaggedArrayUtility
{
	private double twoDimRagArr[][];
	public static double[][] readFile(File file) throws FileNotFoundException
	{
		int indRow = 0;
		Scanner fileInput = new Scanner(file);
		String[][] subArr = new String[10][];
		while (fileInput.hasNextLine())
		{
			String[] row = fileInput.nextLine().split(" ");
			subArr[indRow] = new String[row.length];
			for(int i = 0; i < row.length; i++)
			{
				subArr[indRow][i] = row[i];
			}
			indRow++;
		}	
		double[][]arrData = new double[indRow][];
		for(int i = 0; i < indRow; i++)
		{
			arrData[i] = new double[subArr[i].length];
			for(int j = 0; j < subArr[i].length; j++)
			{
				System.out.print(subArr[i][j] + " ");
				arrData[i][j] = Double.parseDouble(subArr[i][j]);
			}
			System.out.println();
		}
		fileInput.close();
		return arrData;
	}
	public static void writeToFile(double[][] data, File outputFile) throws FileNotFoundException
	{
		PrintWriter fileOutput = new PrintWriter(outputFile);
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				fileOutput.write(data[i][j] + " ");
			}
			fileOutput.write("\n");
		}
		fileOutput.close();
	}
	public static double getTotal(double[][] data)
	{
		double total = 0.0;
		
			for(int i = 0; i < data.length; i++)
			{
				for(int j = 0; j < data[i].length; j++)
				{
					total += data[i][j];
				}
			}
			return total;
	}
	public static double getAverage(double[][] data)
	{
		double total = 0.0;
		double average = 0.0;
		int elements = 0;
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				total += data[i][j];
				elements++;
			}
		}
		average = total / elements;
		return average;
	}
	public static double getRowTotal(double[][] data, int row)
	{
		double rowTotal = 0.0;
		for(int i = 0; i < data[row].length; i++)
		{
			rowTotal += data[row][i];
		}
		return rowTotal;
	}
	public static double getColumnTotal(double[][] data, int col)
	{
		double columnTotal = 0.0;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			columnTotal += data[i][col];
		}
		return columnTotal;
	}
	public static double getHighestInRow(double[][] data, int row)
	{
		double highestRow = -999999;
		for(int i = 0; i < data.length; i++)
		{
			if(highestRow < data[row][i])
			{
				highestRow = data[row][i];
			}
		}
		return highestRow;
	}
	public static int getHighestInRowIndex(double[][] data, int row)
	{
		int index = -1;
		double highestRow = -999999;
		for(int i = 0; i < data.length; i++)
		{
			if(highestRow < data[row][i])
			{
				highestRow = data[row][i];
				index = i;
			}
		}
		return index;
	}
	
	public static double getLowestInRow(double[][] data, int row)
	{
		double lowestRow = 999999;
		for(int i = 0; i < data.length; i++)
		{
			if(lowestRow > data[row][i])
			{
				lowestRow = data[row][i];
			}
		}
		return lowestRow;
	}
	public static int getLowestInRowIndex(double[][] data, int row)
	{
		int index = -1;
		double lowestRow = 999999;
		for(int i = 0; i < data.length; i++)
		{
			if(lowestRow > data[row][i])
			{
				lowestRow = data[row][i];
				index = i;
			}
		}
		return index;

	}
	public static double getHighestInColumn(double[][] data, int col)
	{
		double highestCol = -999999;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			if(highestCol < data[i][col])
			{
				highestCol = data[i][col];
				
			}
		}
		return highestCol;
	}
	public static int getHighestInColumnIndex(double[][] data, int col)
	{
		int index = -1;
		double highestCol = -999999;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			if(data[i][col] > highestCol)
			{
				highestCol = data[i][col];
				index = i;
			}
		}
		return index;
	}
	public static double getLowestInColumn(double[][] data, int col)
	{
		double lowestCol = 999999;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			if(lowestCol > data[i][col])
			{
				lowestCol = data[i][col];
			}
		}
		return lowestCol;
	}
	public static int getLowestInColumnIndex(double[][] data, int col)
	{
		int index = -1;
		double lowestCol = 999999;
		for(int i = 0; i < data.length; i++)
		{
			if(col >= data[i].length)
			{
				continue;
			}
			if(data[i][col] < lowestCol)
			{
				lowestCol = data[i][col];
				index = i;
			}
		}
		return index;
	}
	public static double getHighestInArray(double[][] data)
	{
		double highestInArr = -999999;
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				if(highestInArr < data[i][j])
				{
					highestInArr = data[i][j];
				}
			}
		}
		return highestInArr;
	}
	public static double getLowestInArray(double[][] data)
	{
		double lowestInArr = 999999;
		for(int i = 0; i < data.length; i++)
		{
			for(int j = 0; j < data[i].length; j++)
			{
				if(lowestInArr < data[i][j])
				{
					lowestInArr = data[i][j];
				}
			}
		}
		return lowestInArr;
	}
}
            
                          