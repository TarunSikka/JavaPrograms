package day2;

import java.util.List;

public class workerCall  {

	public static void main(String[] args) {
		worker dw1= new dailyWorker("John",5,170000);
		worker dw2= new dailyWorker("Mack",5,150000);
		worker dw3= new dailyWorker("Harry",5,160000);
		worker sw1= new salWorker("Krish", 9300000);
		worker sw2= new salWorker("Sumit", 9100000);
		worker sw3= new salWorker("Raghav", 9200000);
		
		worker ar[]={dw1,dw2,dw3,sw1,sw2,sw3};
		
		dw1.display();
		dw2.display();
		dw3.display();
		sw1.display();
		sw2.display();
		sw3.display();
		System.out.println("Sorted Order");
		sort(ar);
		

	}
	public static void sort(worker arr[])
	{
		worker temp;
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i + 1; j < arr.length; j++) 
            {
				if (arr[i].pay() > arr[j].pay()) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i].display();
		}
	}
}
